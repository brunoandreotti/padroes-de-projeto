package br.com.cod3r.factorymethod.apple;


import br.com.cod3r.factorymethod.apple.model.IPhone;
import br.com.cod3r.factorymethod.apple.simpleFactory.IPhoneSimpleFactory;


public class ClientWithSimpleFactory {
	
	public static void main(String[] args) {
		// No caso do cliente utilizando as simple factories, ele precisará chamar apenas uma factory
		// informando o modelo (X ou 11) e o tipo como parâmetro (standard ou highend)
		// A implementação simple do factory method requer apenas uma factory para todos os produtos concretos
		// deixando a lógica de qual modelo e tipo será retornando dependendo do parâmetro para a factory
		//isso reduz em apenas uma a quantidade de factories que o cliente precisa chamar

		IPhoneSimpleFactory iPhoneSimpleFactory = new IPhoneSimpleFactory();

		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iPhoneSimpleFactory.order("X","standard");
		System.out.println(iphone);

		System.out.println("### Ordering an iPhone X HighEnd");
		IPhone iphone2 = iPhoneSimpleFactory.order("X","highend");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = iPhoneSimpleFactory.order("11","standard");
		System.out.println(iphone3);

		System.out.println("### Ordering an iPhone 11 HighEnd");
		IPhone iphone4 = iPhoneSimpleFactory.order("11","highend");
		System.out.println(iphone4);


	}
}
