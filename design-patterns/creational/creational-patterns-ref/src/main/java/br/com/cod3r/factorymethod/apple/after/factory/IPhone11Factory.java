package br.com.cod3r.factorymethod.apple.after.factory;

import br.com.cod3r.factorymethod.apple.after.model.IPhone;
import br.com.cod3r.factorymethod.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
