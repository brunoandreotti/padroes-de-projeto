package br.com.cod3r.composite.folders;

import br.com.cod3r.composite.folders.model.FileSystemItem;
import br.com.cod3r.composite.folders.model.Folder;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {

		//O padrão Composite serve para compor objetos em estruturas de àrvore para representar hierarquis todo-parte;
		// Composite permite que clientes tratem onjetos individuas e composições de objetos de maneiras uniforme
		// Nesse exemplo File(parte) e Folder(todos) implementam a mesma interface "FileSystemItem)
		//E dentro do Folder possui uma refêrência a uma lista de FileSystemItem, ou sela a própria iterface que a classe implementa.

		FileSystemItem file1 = new br.com.cod3r.composite.folders.model.File("File1.txt");
		FileSystemItem file2 = new br.com.cod3r.composite.folders.model.File("File2.txt");
		FileSystemItem file3 = new br.com.cod3r.composite.folders.model.File("File3.txt");
		FileSystemItem file4 = new br.com.cod3r.composite.folders.model.File("File4.txt");
		FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
		FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
		FileSystemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));

		folder.print("");
	}
}
