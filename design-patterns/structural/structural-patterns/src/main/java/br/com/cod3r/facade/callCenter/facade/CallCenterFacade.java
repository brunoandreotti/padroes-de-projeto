package br.com.cod3r.facade.callCenter.facade;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;
import br.com.cod3r.facade.callCenter.services.*;

import java.util.List;

public class CallCenterFacade implements CallCenter{
    CardService cardService = new CardService();
    RegisterService registerService = new RegisterService();
    ReportService reportService = new ReportService(registerService);
    SecurityService securityService = new SecurityService(cardService, registerService);

    PaymentService paymentService = new PaymentService(registerService);

    @Override
    public void blockAndOrderNewCard(Long cardNumber) {



        Card card = getCard(123456L);

        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = securityService.blockCard(card);
        System.out.println("Cartão bloqueado com sucesso!");
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSumary(newCard);
        System.out.println("Novo cartão solicitado com sucesso!");
    }

    @Override
    public void cardInfo(Long cardNumber) {

        System.out.println(getCard(cardNumber));
    }

    @Override
    public void getSummary(Long cardNumber) {
        reportService.getSumary(getCard(cardNumber));
    }

    @Override
    public void paymentInfo(Long cardNumber) {
        paymentService.getPaymentInfoByCard(getCard(cardNumber));
    }

    private Card getCard(Long number) {
        return cardService.getCardByUser(number);
    }
}
