package Strategy;

import Facade.Facade;
import Singleton.Singleton1;
import Singleton.Singleton2;
import Singleton.Singleton3;

public class Teste {

	public static void main(String[] args) {
		
		Singleton1 lazy = Singleton1.getInstancia();
		System.out.println(lazy);
		lazy = Singleton1.getInstancia();
		System.out.println(lazy);
		
		Singleton2 eager = Singleton2.getInstancia();
		System.out.println(eager);
		eager = Singleton2.getInstancia();
		System.out.println(eager);
		
		Singleton3 lazyholder = Singleton3.getInstancia();
		System.out.println(lazyholder);
		lazyholder = Singleton3.getInstancia();
		System.out.println(lazyholder);
		
		Comportamento normal = new Normal();
		Comportamento defensivo = new Defensivo();
		Comportamento agressivo = new Agressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		Facade Facade = new Facade();
		Facade.migrarCliente("Guilherme", "15232629");
	}
	
}