package br.com.cod3r.command.alexa.alexa;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.command.alexa.commands.Command;
import br.com.cod3r.command.alexa.commands.TurnOffCommand;
import br.com.cod3r.command.alexa.commands.TurnOnCommand;
import br.com.cod3r.command.alexa.lights.GenericLight;
import br.com.cod3r.command.alexa.lights.PhillipsHueLight;
import br.com.cod3r.command.alexa.lights.XiaomiLight;

public class Alexa {
	private Map<String, GenericLight> integrations;




	
	public Alexa() {
		integrations = new HashMap<String, GenericLight>();
		integrations.put("LivingRoomLight", new PhillipsHueLight());
		integrations.put("KitchenLight", new XiaomiLight());
	}

	public void sendRequest(String request) {
		if(request.equals("Turn on the Living room light")) {
			System.out.println("Turnning on the Living room light");
			PhillipsHueLight light = (PhillipsHueLight) integrations.get("LivingRoomLight");
			light.turnOn();
		} else if(request.equals("Turn off the Living room light")) {
			System.out.println("Turnning off the Living room light");
			PhillipsHueLight light = (PhillipsHueLight) integrations.get("LivingRoomLight");
			light.turnOff();
		} else if(request.equals("Turn on the Kitchen light")) {
			System.out.println("Turnning on the Kitchen light");
			XiaomiLight light = (XiaomiLight) integrations.get("KitchenLight");
			light.turnOn();
		} else if(request.equals("Turn off the Kitchen light")) {
			System.out.println("Turnning off the Kitchen light");
			XiaomiLight light = (XiaomiLight) integrations.get("KitchenLight");
			light.turnOff();
		} else {
			System.out.println("Sorry, I can't perform your request!");
		}
			 
	}

	public void sendCommand(String request) {
		if(request.equals("Turn on the Living room light")) {
			System.out.println("Turnning on the Living room light");
			Command command = new TurnOnCommand(integrations.get("LivingRoomLight"));
			command.execute();
		} else if(request.equals("Turn off the Living room light")) {
			System.out.println("Turnning off the Living room light");
			Command command = new TurnOffCommand(integrations.get("LivingRoomLight"));
			command.execute();

		} else if(request.equals("Turn on the Kitchen light")) {
			System.out.println("Turnning on the Kitchen light");
			Command command = new TurnOnCommand(integrations.get("KitchenLight"));
			command.execute();
		} else if(request.equals("Turn off the Kitchen light")) {
			System.out.println("Turnning off the Kitchen light");
			Command command = new TurnOffCommand(integrations.get("KitchenLight"));
			command.execute();
		} else {
			System.out.println("Sorry, I can't perform your request!");
		}

	}
}
