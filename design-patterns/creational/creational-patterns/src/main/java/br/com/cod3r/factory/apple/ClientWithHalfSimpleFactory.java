package br.com.cod3r.factory.apple;


import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXSMaxFactory;
import br.com.cod3r.factory.apple.halfSimplesFactory.IPhone11HalfSimpleFactory;
import br.com.cod3r.factory.apple.halfSimplesFactory.IPhoneXHalfSimpleFactory;
import br.com.cod3r.factory.apple.model.IPhone;


public class ClientWithHalfSimpleFactory {
	
	public static void main(String[] args) {
		// No caso do cliente utilizando as half simple factories , ele precisará chamar a factory
		// para cada modelo de iphone informando a versão como parâmetro (standard ou highend)
		// A implementação half simple do factory method requer uma factory para cada "grupo" de produto concreto
		// deixando a lógica de qual versão será retornando dependendo do parâmetro para a factory
		//isso diminui a quantidade de factories que o cliente precisa chamar

		IPhoneXHalfSimpleFactory iPhoneXHalfSimpleFactory= new IPhoneXHalfSimpleFactory();

		IPhone11HalfSimpleFactory iPhone11HalfSimpleFactory = new IPhone11HalfSimpleFactory();

		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iPhoneXHalfSimpleFactory.order("standard");
		System.out.println(iphone);

		System.out.println("### Ordering an iPhone X HighEnd");
		IPhone iphone2 = iPhoneXHalfSimpleFactory.order("highend");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = iPhone11HalfSimpleFactory.order("standard");
		System.out.println(iphone3);

		System.out.println("### Ordering an iPhone 11 HighEnd");
		IPhone iphone4 = iPhone11HalfSimpleFactory.order("highend");
		System.out.println(iphone4);


	}
}
