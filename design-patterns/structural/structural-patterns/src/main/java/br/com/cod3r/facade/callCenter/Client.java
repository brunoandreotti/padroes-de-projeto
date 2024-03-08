package br.com.cod3r.facade.callCenter;

import java.util.List;

import br.com.cod3r.facade.callCenter.facade.CallCenterFacade;
import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;
import br.com.cod3r.facade.callCenter.services.CardService;
import br.com.cod3r.facade.callCenter.services.PaymentService;
import br.com.cod3r.facade.callCenter.services.RegisterService;
import br.com.cod3r.facade.callCenter.services.ReportService;
import br.com.cod3r.facade.callCenter.services.SecurityService;

public class Client {

	public static void main(String[] args) {
		//O padrão Facade tem como objetivo oferecer uma interface única para um conjunto de interfaces/classes/métodos
		// O Facade fornece uma única classe com um métodos que lidam com toda a complexidade de configurar as classes corretas (regra de negócio) para o resultado desejado.
		//Basicamente "esconde" toda a complexidade de um fluxo, fazendo com que o cliente precise apenas chamar o método que possui o fluxo dentro, sem ter conhecimento do fluxo em si

		//Without Facade

		CardService cardService = new CardService();
		RegisterService registerService = new RegisterService();
		ReportService reportService = new ReportService(registerService);
		PaymentService paymentService = new PaymentService(registerService);
		SecurityService securityService = new SecurityService(cardService, registerService);

		Card card = cardService.getCardByUser(123456L);
		System.out.println(card);

		reportService.getSumary(card);

		paymentService.getPaymentInfoByCard(card);
		
		//Remove last register, block the card e order a new one
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);

		//With facade

		CallCenterFacade callCenterFacade = new CallCenterFacade();
		System.out.println("Card info");
		callCenterFacade.cardInfo(123456L);
		System.out.println("Card summary");
		callCenterFacade.getSummary(123456L);
		System.out.println("Card payment info");
		callCenterFacade.paymentInfo(123456L);
		System.out.println("Card block");
		callCenterFacade.blockAndOrderNewCard(123456L);
	}
}
