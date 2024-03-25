package br.com.cod3r.state.headphone;

public class Client {

	//O State é um padrão de projeto comportamental que permite que um objeto altere o comportamento quando seu estado interno for alterado.
	//
	//O padrão extrai comportamentos relacionados ao estado em classes separadas de estado e força o objeto original a delegar o trabalho para uma instância dessas classes, em vez de agir por conta própria.

	public static void main(String[] args) {
		HeadPhone phone = new HeadPhone();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
		phone.onClick();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
	}
}
