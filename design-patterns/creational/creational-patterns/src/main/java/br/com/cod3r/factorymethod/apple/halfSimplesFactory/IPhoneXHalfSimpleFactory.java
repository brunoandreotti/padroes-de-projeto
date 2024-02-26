package br.com.cod3r.factory.apple.halfSimplesFactory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneXHalfSimpleFactory extends IPhoneHalfSimpleFactory {

  @Override
  protected IPhone create(String model) {

    return model.equalsIgnoreCase("highend") ? new IPhoneX() : new IPhoneXSMax();
  }
}
