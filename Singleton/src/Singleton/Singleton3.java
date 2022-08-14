package Singleton;

/**
 * @author guioliver
 */
public class Singleton3 {
	
	private static class InstanceHolder{
		public static Singleton3 instancia= new Singleton3();
	}
	private Singleton3() {
		super();
	}
		
    public static Singleton3 getInstancia() {
    	return  InstanceHolder.instancia;
		
	}	
}