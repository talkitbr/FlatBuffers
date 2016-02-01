package com.talkitbr.flatbuffersandroid.model.vo.json;

public class CasaJSON extends ImovelJSON {
    private AreaJSON areaTerreno;
    private float areaConstruida;

    public AreaJSON getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(AreaJSON areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
}
