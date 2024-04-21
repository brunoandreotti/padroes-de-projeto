package br.com.cod3r.strategy.calc;

import br.com.cod3r.strategy.calc.strategies.*;

import java.util.Map;

public class Calculator {
	private final int num1;
	private final int num2;

	private final Map<String, CalcStrategy> mapStrategy = Map.of(
			"+", new SumStrategy(),
			"-", new SubStrategy(),
			"*", new MultStrategy(),
			"/", new DivStrategy()
	);
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getResult(String operation) {
		switch (operation) {
		case "+": return num1 + num2;
		case "-": return num1 - num2;
		case "*": return num1 * num2;
		case "/": return num1 / num2;
		default: return 0;
		}
	}

	public int getResultWithStrategy(String operation) {
		return mapStrategy.get(operation).calculate(num1, num2);
	}
}
