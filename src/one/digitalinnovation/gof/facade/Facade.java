package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1Crm.CrmService;
import one.digitalinnovation.gof.subsistema2Cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
