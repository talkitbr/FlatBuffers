package com.talkitbr.flatbuffersandroid.model.vo.json;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TipoJSON {
    COMPRA("compra"), ALUGUEL("aluguel");

    private final String tipoStr;

    TipoJSON(String tipoStr) {
        this.tipoStr = tipoStr;
    }

    @JsonCreator
    public static TipoJSON fromString(String tipoStr) {
        TipoJSON tipo = null;
        TipoJSON[] tipos = TipoJSON.values();

        for (int i = 0; (i < tipos.length) && (tipo == null); i++) {
            if (tipos[i].tipoStr.equals(tipoStr)) {
                tipo = tipos[i];
            }
        }

        return tipo;
    }
}
