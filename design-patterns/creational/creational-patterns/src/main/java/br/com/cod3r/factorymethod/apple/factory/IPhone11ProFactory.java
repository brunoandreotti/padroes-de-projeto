package br.com.cod3r.factorymethod.apple.factory;

import br.com.cod3r.factorymethod.apple.model.IPhone;
import br.com.cod3r.factorymethod.apple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

  @Override
  protected IPhone create() {
    return new IPhone11Pro();
  }
}
