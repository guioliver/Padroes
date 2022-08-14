package Facade;

import Subsistema.crm.CrmService;
import Subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente (String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		
		CrmService.GravarCliente(nome, cep, cidade, estado);
 }

}