package Subsistema2.cep;

public class CepApi {
	
	private static CepApi instancia= new CepApi();
	
	private CepApi() {
		super();
	}
		
    public static CepApi getInstancia() {
    	return instancia;
		
	}	
    
    public String recuperarCidade(String cep) {
    	return "Santo Andre";
    }
    	
    public String recuperarEstado(String cep) {
        	return "SP";
     }
    }
