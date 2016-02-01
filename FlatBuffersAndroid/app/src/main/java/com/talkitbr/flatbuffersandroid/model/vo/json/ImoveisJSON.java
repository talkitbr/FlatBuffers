package com.talkitbr.flatbuffersandroid.model.vo.json;

import java.util.List;

public class ImoveisJSON {
    private List<ApartamentoJSON> aptos;
    private List<CasaJSON> casas;

    public List<ApartamentoJSON> getAptos() {
        return aptos;
    }

    public void setAptos(List<ApartamentoJSON> aptos) {
        this.aptos = aptos;
    }

    public List<CasaJSON> getCasas() {
        return casas;
    }

    public void setCasas(List<CasaJSON> casas) {
        this.casas = casas;
    }
}
