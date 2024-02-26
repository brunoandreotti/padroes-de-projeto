package br.com.cod3r.factorymethod.apple.after.factory;

import br.com.cod3r.factorymethod.apple.after.model.IPhone;
import br.com.cod3r.factorymethod.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
