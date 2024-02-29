package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.OldMonitorToHDMIAdapter;
import br.com.cod3r.adapter.tvPort.adapters.VGAToHDMIAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		VGA oldMonitor = new OldMonitor();


		System.out.println("------ Monitor Interface Adapter ----------");
		// A função do adapter é criar uma interface intermediaria entre uma interface "antiga" e uma "nova"
		// onde esse adapter irá adaptar a interface antiga para se comportar como a nova
		// Converter a interface de uma classe em outra interface esperada pelo cliente
		// O adapater permite a comunicação entre classes que não poderiam trabalhar juntas
		// devido a incompatibilidade de suas interfaces

		Computer pc2 = new Computer();
		VGAToHDMIAdapter oldMonitorWithHDMI = new VGAToHDMIAdapter(oldMonitor);

		pc2.connectPort(oldMonitorWithHDMI);

		System.out.println("------ Monitor Interface Adapter ----------");

		Computer pc3 = new Computer();

		OldMonitorToHDMIAdapter oldMonitorWithHDMI2 = new OldMonitorToHDMIAdapter();
		pc3.connectPort(oldMonitorWithHDMI2);
	}
}
