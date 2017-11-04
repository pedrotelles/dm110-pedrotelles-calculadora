package br.inatel.dm110.calculadora.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.dm110.calculadora.impl.CalculadoraServiceImpl;

@ApplicationPath("/rest")
public class RestApplication extends Application{
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(CalculadoraServiceImpl.class);
		return classes;
	}
}