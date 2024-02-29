package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class VGAToHDMIAdapter implements HDMI {

    private VGA vga;

    public VGAToHDMIAdapter(VGA vga) {
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println(">>> This is your sound: " + sound);
    }
}
