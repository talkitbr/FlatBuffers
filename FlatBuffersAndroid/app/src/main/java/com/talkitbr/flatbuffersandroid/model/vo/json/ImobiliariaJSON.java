package com.talkitbr.flatbuffersandroid.model.vo.json;

public class ImobiliariaJSON extends VendedorJSON {
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private EstadoJSON estado;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public EstadoJSON getEstado() {
        return estado;
    }

    public void setEstado(EstadoJSON estado) {
        this.estado = estado;
    }
}
