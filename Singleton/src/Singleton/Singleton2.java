package Singleton;

/**
 * @author guioliver
 */
public class Singleton2 {
	
	private static Singleton2 instancia= new Singleton2();
	
	public Singleton2() {
		super();
	}
		
    public static Singleton2 getInstancia() {
    	return instancia;
		
	}	
}
