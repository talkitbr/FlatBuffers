package com.talkitbr.flatbuffersandroid.model.vo.json;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum EstadoJSON {
    AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO;

    @JsonCreator
    public static EstadoJSON fromString(String estadoStr) {
        EstadoJSON estado = null;
        EstadoJSON[] estados = EstadoJSON.values();

        for (int i = 0; (i < estados.length) && (estado == null); i++) {
            if (estados[i].name().equals(estadoStr)) {
                estado = estados[i];
            }
        }

        return estado;
    }
}
