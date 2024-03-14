package br.com.cod3r.iterator.tvChannel;

public class Client {

	public static void main(String[] args) {
		//Implementando o iterator nós não conseguimos iterar diretamente na propriedade channels
		//E sim direto no objeto TV por estar implementando a interface Iterable
		TV tv = new TV();

		tv.searchAvaiableChannels();

		for(Integer channel: tv) {
			System.out.printf("Canal %s", channel);;
		}
	}
}
