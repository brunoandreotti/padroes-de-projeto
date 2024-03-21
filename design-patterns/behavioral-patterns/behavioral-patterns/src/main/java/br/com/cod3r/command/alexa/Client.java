package br.com.cod3r.command.alexa;

import br.com.cod3r.command.alexa.alexa.Alexa;

public class Client {

	//O Padrão command tem como objetivo encapsular uma requisição ocmo um pedido
	//permitindo que clientes parametrizem diferentes requisições
	//

	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");
	}
}
