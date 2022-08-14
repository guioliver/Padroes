package Singleton;

/**
 * @author guioliver
 */
public class Singleton1 {
	
	private static Singleton1 instancia;
	
	public Singleton1() {
		super();
	}
		
	public static Singleton1 getInstancia() {
    	if (instancia== null) {
    	instancia = new Singleton1();
         }
    	return instancia;
		
	}	
}
