package com.talkitbr.flatbuffersandroid.model.vo.json;

public class ApartamentoJSON extends ImovelJSON {
    private float area;
    private int numApto;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getNumApto() {
        return numApto;
    }

    public void setNumApto(int numApto) {
        this.numApto = numApto;
    }
}
