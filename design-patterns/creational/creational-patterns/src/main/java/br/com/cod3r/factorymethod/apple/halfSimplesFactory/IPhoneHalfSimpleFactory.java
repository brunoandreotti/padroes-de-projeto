package br.com.cod3r.factorymethod.apple.halfSimplesFactory;

import br.com.cod3r.factorymethod.apple.model.IPhone;

public abstract class IPhoneHalfSimpleFactory {

	public IPhone order(String model) {
		IPhone device = null;

		device = create(model);

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}

	protected abstract IPhone create(String model);
}
