package br.com.cod3r.strategy.calc.strategies;

public class DivStrategy implements CalcStrategy {
    @Override
    public int calculate(int n1, int n2) {
        return n1 / n2;
    }
}
