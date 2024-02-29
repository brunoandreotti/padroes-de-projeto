package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class OldMonitorToHDMIAdapter extends OldMonitor implements HDMI {

    public OldMonitorToHDMIAdapter () {
        super();
    }

    //o método setImage já é recebido por herança

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, we don't work with sound");
    }
}
