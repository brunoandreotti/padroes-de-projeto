package br.com.cod3r.factorymethod.apple.after.factory;

import br.com.cod3r.factorymethod.apple.after.model.IPhone;
import br.com.cod3r.factorymethod.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
