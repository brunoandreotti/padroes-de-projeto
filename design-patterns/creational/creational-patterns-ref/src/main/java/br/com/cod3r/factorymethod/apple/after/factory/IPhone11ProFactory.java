package br.com.cod3r.factorymethod.apple.after.factory;

import br.com.cod3r.factorymethod.apple.after.model.IPhone;
import br.com.cod3r.factorymethod.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
