package br.com.cod3r.mediator.translate;

import br.com.cod3r.mediator.translate.mediator.Mediator;
import br.com.cod3r.mediator.translate.model.EnglishUser;
import br.com.cod3r.mediator.translate.model.PortugueseUser;
import br.com.cod3r.mediator.translate.model.User;

public class Client {

	// O Mediator é um padrão de projeto comportamental que reduz o acoplamento entre os componentes de um programa,
	// fazendo-os se comunicar indiretamente, por meio de um objeto mediador especial.


	public static void main(String[] args) {
		Mediator chatRoom = null;
		
		User alan = new EnglishUser("Alan", chatRoom);
		User jose = new PortugueseUser("Jose", chatRoom);
		User sue = new EnglishUser("Sue", chatRoom);
		User maria = new PortugueseUser("Maria", chatRoom);
		
		chatRoom.addUser(alan);
		chatRoom.addUser(sue);
		chatRoom.addUser(maria);
		
		alan.sendMessage("Hello");
		maria.sendMessage("Oi", alan);
		
		chatRoom.removeUser(sue);
		
		alan.sendMessage("How are you?", maria);
		maria.sendMessage("Estou bem, obrigado.", alan);
		
		chatRoom.addUser(jose);
		
		jose.sendMessage("Oi");
		
		chatRoom.removeUser(maria);
	}
	
}