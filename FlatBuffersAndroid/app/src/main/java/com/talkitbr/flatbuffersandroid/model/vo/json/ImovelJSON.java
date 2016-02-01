package com.talkitbr.flatbuffersandroid.model.vo.json;

public abstract class ImovelJSON {
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private EstadoJSON estado;
    private int quartos;
    private TipoJSON tipo;
    private float valor;
    private boolean aceitaFGTS = true;
    private VendedorJSON vendedor;
    private String urlFoto;

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

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public TipoJSON getTipo() {
        return tipo;
    }

    public void setTipo(TipoJSON tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isAceitaFGTS() {
        return aceitaFGTS;
    }

    public void setAceitaFGTS(boolean aceitaFGTS) {
        this.aceitaFGTS = aceitaFGTS;
    }

    public VendedorJSON getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorJSON vendedor) {
        this.vendedor = vendedor;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
