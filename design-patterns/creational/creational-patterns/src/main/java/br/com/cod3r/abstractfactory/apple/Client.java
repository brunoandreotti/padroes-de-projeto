package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;


public class Client {
	
	public static void main(String[] args) {

		//Abstractory factory é utilizada para a construção de objetos que serão utilizados
		//dentro de um mesmo contexto, não sendo necessáriamente objetos do mesmo tipo
		//Nesse caso as RulesAbstractoryFactory estão cuidando da criação tanto do certificado quanto do empacotamento do iphone
		//Então mesmo sendo objetos diferentes (Certificate e Packing) eles estão sendo criados dentro da mesma abstract factory

		BrazilRulesAbstractFactory brazilRules = new BrazilRulesAbstractFactory();
		USRulesAbstractFactory usRules = new USRulesAbstractFactory();

		IPhone11Factory iPhone11BrazilFactory = new IPhone11Factory(brazilRules);
		IPhone11Factory iPhone11USFactory = new IPhone11Factory(usRules);

		IPhoneXFactory iPhoneXBrazilFactory = new IPhoneXFactory(brazilRules);
		IPhoneXFactory iPhoneXUSFactory = new IPhoneXFactory(usRules);

		System.out.println("### Ordering an Brazil iPhone 11");
		iPhone11BrazilFactory.orderIPhone("standard");


		System.out.println("### Ordering an Brazil highend iPhone 11");
		iPhone11BrazilFactory.orderIPhone("highend");


		System.out.println("### Ordering an Brazil iPhone X");
		iPhoneXBrazilFactory.orderIPhone("standard");


		System.out.println("### Ordering an Brazil highend iPhone X");
		iPhoneXBrazilFactory.orderIPhone("highend");


		System.out.println("### Ordering an US iPhone 11");
		iPhone11USFactory.orderIPhone("standard");


		System.out.println("### Ordering an US highend iPhone 11");
		iPhone11USFactory.orderIPhone("highend");


		System.out.println("### Ordering an US iPhone X");
		iPhoneXUSFactory.orderIPhone("standard");


		System.out.println("### Ordering an US highend iPhone X");
		IPhone iphone8 = iPhoneXUSFactory.orderIPhone("highend");


	}
}
