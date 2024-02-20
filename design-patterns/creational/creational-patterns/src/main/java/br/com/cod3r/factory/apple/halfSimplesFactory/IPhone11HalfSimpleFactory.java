package br.com.cod3r.factory.apple.halfSimplesFactory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import java.util.Objects;

public class IPhone11HalfSimpleFactory extends IPhoneHalfSimpleFactory {

  @Override
  protected IPhone create(String model) {

    return model.equalsIgnoreCase("highend") ? new IPhone11Pro() : new IPhone11();
  }
}
