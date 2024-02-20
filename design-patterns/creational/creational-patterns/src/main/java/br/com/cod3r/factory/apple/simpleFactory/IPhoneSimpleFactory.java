package br.com.cod3r.factory.apple.simpleFactory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneSimpleFactory  {


  public static IPhone order(String model, String level) {

    IPhone device = null;


    if ("X".equalsIgnoreCase(model)) {
      device = "highend".equalsIgnoreCase(level) ? new IPhoneXSMax() : new IPhoneX();

    }

    if ("11".equalsIgnoreCase(model)) {
      device = "highend".equalsIgnoreCase(level) ? new IPhone11Pro() : new IPhone11();

    }

    if (device != null) { assembleDevice(device); }


    return device;
  }

  private static void assembleDevice(IPhone device) {
    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();
  }
}
