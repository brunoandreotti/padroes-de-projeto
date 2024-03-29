package br.com.cod3r.factorymethod.apple.factory;

import br.com.cod3r.factorymethod.apple.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone order() {
		IPhone device = null;

		device = create();

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}

	protected abstract IPhone create();
}
