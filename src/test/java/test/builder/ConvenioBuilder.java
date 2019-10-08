package test.builder;

import domain.cliente.ConvenioEntity;

public class ConvenioBuilder {

    private ConvenioBuilder(){}

    public static ConvenioEntity SIAPE(){
        ConvenioEntity convenio = new ConvenioEntity();
        convenio.setDescricao("SIAPE");
        convenio.setIdConvenio(1L);
        return convenio;
    }

    public static ConvenioEntity INSS(){
        ConvenioEntity convenio = new ConvenioEntity();
        convenio.setIdConvenio(2L);
        convenio.setDescricao("INSS");
        return convenio;
    }
}
