package br.com.cod3r.factorymethod.apple.halfSimple.factory;

import br.com.cod3r.factorymethod.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIPhone(String level) {
		IPhone device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(String level);
}
