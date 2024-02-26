package br.com.cod3r.factorymethod.apple.halfSimplesFactory;

import br.com.cod3r.factorymethod.apple.model.IPhone;
import br.com.cod3r.factorymethod.apple.model.IPhone11;
import br.com.cod3r.factorymethod.apple.model.IPhone11Pro;

public class IPhone11HalfSimpleFactory extends IPhoneHalfSimpleFactory {

  @Override
  protected IPhone create(String model) {

    return model.equalsIgnoreCase("highend") ? new IPhone11Pro() : new IPhone11();
  }
}
