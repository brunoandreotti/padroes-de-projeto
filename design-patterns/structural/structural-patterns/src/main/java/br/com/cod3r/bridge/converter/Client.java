package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

	//Padrão bridge possui a função de desacoplar uma interface/classe abstrata (Employee/Converter) de sua implementação
	//para que os dois possam variar independentemente

	//O Conveter possui uma referência à Employee, dessa forma um Converter pode ser criado
	// para qualquer tipo de Employee
	//Desse modo é possível desenvolver outras classes de Employee independentemente das classes de Converter

	//No exemplo mostra a separação entre classes de Empregados(employess) e classes de converção de formato(Converter)
	//Graças às interfaces comuns, os mesmos converters (cvs e json) conseguem converter diferentes empregados(Employees)
	public static void main(String[] args) {

		ITGuy itGuy = new ITGuy("João", 30, 3000d);
		ProjectManager pm = new ProjectManager("Maria", 25, 4000d);

		Converter csvConverterITGuy = new CSVConverter(itGuy);
		Converter csvConverterPM = new CSVConverter(pm);
		Converter jsonConverterITGuy = new JsonConverter(itGuy);
		Converter jsonConverterPM = new JsonConverter(pm);



		System.out.println(csvConverterITGuy.getEmployeeFormated());
		System.out.println(csvConverterPM.getEmployeeFormated());
		System.out.println(jsonConverterITGuy.getEmployeeFormated());
		System.out.println(jsonConverterPM.getEmployeeFormated());
	}
}
