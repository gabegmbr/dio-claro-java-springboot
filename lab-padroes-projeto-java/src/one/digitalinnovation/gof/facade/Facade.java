package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.subsistema2.cep.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstance().recuperarCidade(cep);
        String estado =CepAPI.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
