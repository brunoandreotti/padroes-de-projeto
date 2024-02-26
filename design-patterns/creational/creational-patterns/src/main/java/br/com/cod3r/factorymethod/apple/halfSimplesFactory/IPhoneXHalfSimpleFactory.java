package br.com.cod3r.factorymethod.apple.halfSimplesFactory;

import br.com.cod3r.factorymethod.apple.model.IPhone;
import br.com.cod3r.factorymethod.apple.model.IPhoneX;
import br.com.cod3r.factorymethod.apple.model.IPhoneXSMax;

public class IPhoneXHalfSimpleFactory extends IPhoneHalfSimpleFactory {

  @Override
  protected IPhone create(String model) {

    return model.equalsIgnoreCase("highend") ? new IPhoneX() : new IPhoneXSMax();
  }
}
