package br.com.cod3r.bridge.converter.converters;

import br.com.cod3r.bridge.converter.employees.Employee;

public class CSVConverter implements Converter {

	private final Employee emp;

	public CSVConverter(Employee employee) {
		this.emp = employee;
	}
	@Override
	public String getEmployeeFormated() {
		return String.format("%s;%d;%.2f",
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
