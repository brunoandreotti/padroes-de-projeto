package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

  @Override
  protected IPhone create() {
    return new IPhone11Pro();
  }
}
