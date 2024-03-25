package br.com.cod3r.observer.party;

import br.com.cod3r.observer.party.characters.Doorman;
import br.com.cod3r.observer.party.characters.Wife;
import br.com.cod3r.observer.party.event.HusbandArrive;
import br.com.cod3r.observer.party.observers.FriendObserver;
import br.com.cod3r.observer.party.observers.WifeObserver;
import br.com.cod3r.observer.party.subject.DoormanSubject;

public class Client {

	//O Observer é um padrão de projeto comportamental que permite que um objeto notifique outros objetos sobre alterações em seu estado.
	//
	//O padrão Observer fornece uma maneira de assinar e cancelar a assinatura desses eventos para qualquer objeto que implemente uma interface de assinante.

	//Publisher/Subject é quem monitora o status evento e repassa para o listener/observer
	//Listener/Observer é quem recebe o evento e faz algo




	public static void main(String[] args) {
		Doorman reception = new Doorman();
		Wife wife = new Wife(reception);

		//Sem aplicar o padrão
		//O objeto Wife precisa ficar verificando se é possível começeçar a festa
//		wife.startPartyIfPossible();
//
//		System.out.println("5 minutes later...");
//		wife.startPartyIfPossible();
//
//		System.out.println("5 minutes later...");
//		wife.startPartyIfPossible();
//
//		System.out.println("5 minutes later...");
//		wife.startPartyIfPossible();
//
//		System.out.println("5 minutes later...");
//		wife.startPartyIfPossible();
//
//		System.out.println("Husband is comming");
//		reception.setStatus(true);
//
//		System.out.println("5 minutes later...");
//		wife.startPartyIfPossible();

		//Aplicando o padrão
		//Instanciando os observer que ficarão ouvindo/observando atualização enviada pelo subject
		WifeObserver wifeObserver = new WifeObserver();
		FriendObserver friendObserver = new FriendObserver();

		//Instanciando subject que irá notificar caso hajá alteração no evento
		DoormanSubject doormanSubject = new DoormanSubject();

		//Adicionando os observers que o subject irá notificar

		doormanSubject.add(wifeObserver);
		doormanSubject.add(friendObserver);

		//Criando evento
		HusbandArrive event = new HusbandArrive();

		//Verificando evento
		doormanSubject.checkStatus(event);

		//Alterando status do evento
		event.setStatus(true);

		//Verificando evento
		doormanSubject.checkStatus(event);

		//Desa maneira podemos ver que quem espera a alateração não precisa ficar verificando o status da mensagem, diferentemente da implementação sem o padrão

	}


}
