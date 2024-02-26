package br.com.cod3r.factorymethod.apple.factory;

import br.com.cod3r.factorymethod.apple.model.IPhone;
import br.com.cod3r.factorymethod.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

  @Override
  protected IPhone create() {
    return new IPhoneX();
  }
}
