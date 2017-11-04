package br.inatel.dm110.calculadora.impl;

import br.inatel.dm110.calculadora.api.CalculadoraService;
import br.inatel.dm110.calculadora.api.Result;

public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public Result sum(int first, int second) {
		Result result = new Result();
		
		result.setFirst(Integer.toString(first));
		result.setSecond(Integer.toString(second));
		
		int r = first + second;
		
		result.setResult(Integer.toString(r));
		
		
		return result;
	}

	@Override
	public Result subtract(int first, int second) {
Result result = new Result();
		
		result.setFirst(Integer.toString(first) );
		result.setSecond(Integer.toString(second));
		
		int r = first - second;
		
		result.setResult(Integer.toString(r));
		
		
		return result;
	}

}
