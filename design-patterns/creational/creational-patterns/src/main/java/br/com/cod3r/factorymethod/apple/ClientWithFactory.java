package br.com.cod3r.factorymethod.apple;


import br.com.cod3r.factorymethod.apple.factory.IPhone11Factory;
import br.com.cod3r.factorymethod.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factorymethod.apple.factory.IPhoneXSMaxFactory;
import br.com.cod3r.factorymethod.apple.factory.IPhoneXFactory;
import br.com.cod3r.factorymethod.apple.model.IPhone;


public class ClientWithFactory {
	
	public static void main(String[] args) {
		// Factory methos é utilizado para criação de objetos do mesmo tipo mas com características diferentes
		// Nesse exemplo existe factories para cada tipo de iphone mas no final as factories sempre devolvem o objeto "IPhone"

		// No caso do cliente utilizando as factories normais, ele precisará chamar a factory específica
		// para cada modelo e versão que ele queira criar
		// A implementação padrão o factory method requer uma factory para cada produto concreto

		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
		IPhone11ProFactory iPhone11ProFactory = new IPhone11ProFactory();
		IPhone11Factory iPhone11Factory = new IPhone11Factory();
		IPhoneXSMaxFactory iPhoneXSMaxFactory = new IPhoneXSMaxFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iPhoneXFactory.order();
		System.out.println(iphone);


		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iPhone11ProFactory.order();
		System.out.println(iphone2);

		System.out.println("### Ordering an iPhone 11");
		IPhone iphone3 = iPhone11Factory.order();
		System.out.println(iphone3);

		System.out.println("### Ordering an iPhone X HighEnd");
		IPhone iphone4 = iPhoneXSMaxFactory.order();
		System.out.println(iphone4);
	}
}
