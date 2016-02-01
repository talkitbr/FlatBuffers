// automatically generated, do not modify

package com.talkitbr.flatbuffersandroid.model.vo.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Apartamento extends Table {
  public static Apartamento getRootAsApartamento(ByteBuffer _bb) { return getRootAsApartamento(_bb, new Apartamento()); }
  public static Apartamento getRootAsApartamento(ByteBuffer _bb, Apartamento obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Apartamento __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String endereco() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer enderecoAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public int numero() { int o = __offset(6); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public int numApto() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public String bairro() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer bairroAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public String cidade() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer cidadeAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public byte estado() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public float area() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0; }
  public int quartos() { int o = __offset(18); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public float valor() { int o = __offset(20); return o != 0 ? bb.getFloat(o + bb_pos) : 0; }
  public float valorCondominio() { int o = __offset(22); return o != 0 ? bb.getFloat(o + bb_pos) : 0; }
  public byte tipo() { int o = __offset(24); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean aceitaFGTS() { int o = __offset(26); return o != 0 ? 0!=bb.get(o + bb_pos) : true; }
  public String urlFoto() { int o = __offset(30); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer urlFotoAsByteBuffer() { return __vector_as_bytebuffer(30, 1); }
  public byte vendedorType() { int o = __offset(32); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table vendedor(Table obj) { int o = __offset(34); return o != 0 ? __union(obj, o) : null; }

  public static int createApartamento(FlatBufferBuilder builder,
      int endereco,
      int numero,
      int numApto,
      int bairro,
      int cidade,
      byte estado,
      float area,
      int quartos,
      float valor,
      float valorCondominio,
      byte tipo,
      boolean aceitaFGTS,
      int urlFoto,
      byte vendedor_type,
      int vendedor) {
    builder.startObject(16);
    Apartamento.addVendedor(builder, vendedor);
    Apartamento.addUrlFoto(builder, urlFoto);
    Apartamento.addValorCondominio(builder, valorCondominio);
    Apartamento.addValor(builder, valor);
    Apartamento.addArea(builder, area);
    Apartamento.addCidade(builder, cidade);
    Apartamento.addBairro(builder, bairro);
    Apartamento.addEndereco(builder, endereco);
    Apartamento.addNumero(builder, numero);
    Apartamento.addVendedorType(builder, vendedor_type);
    Apartamento.addAceitaFGTS(builder, aceitaFGTS);
    Apartamento.addTipo(builder, tipo);
    Apartamento.addQuartos(builder, quartos);
    Apartamento.addEstado(builder, estado);
    Apartamento.addNumApto(builder, numApto);
    return Apartamento.endApartamento(builder);
  }

  public static void startApartamento(FlatBufferBuilder builder) { builder.startObject(16); }
  public static void addEndereco(FlatBufferBuilder builder, int enderecoOffset) { builder.addOffset(0, enderecoOffset, 0); }
  public static void addNumero(FlatBufferBuilder builder, int numero) { builder.addShort(1, (short)(numero & 0xFFFF), 0); }
  public static void addNumApto(FlatBufferBuilder builder, int numApto) { builder.addByte(2, (byte)(numApto & 0xFF), 0); }
  public static void addBairro(FlatBufferBuilder builder, int bairroOffset) { builder.addOffset(3, bairroOffset, 0); }
  public static void addCidade(FlatBufferBuilder builder, int cidadeOffset) { builder.addOffset(4, cidadeOffset, 0); }
  public static void addEstado(FlatBufferBuilder builder, byte estado) { builder.addByte(5, estado, 0); }
  public static void addArea(FlatBufferBuilder builder, float area) { builder.addFloat(6, area, 0); }
  public static void addQuartos(FlatBufferBuilder builder, int quartos) { builder.addByte(7, (byte)(quartos & 0xFF), 0); }
  public static void addValor(FlatBufferBuilder builder, float valor) { builder.addFloat(8, valor, 0); }
  public static void addValorCondominio(FlatBufferBuilder builder, float valorCondominio) { builder.addFloat(9, valorCondominio, 0); }
  public static void addTipo(FlatBufferBuilder builder, byte tipo) { builder.addByte(10, tipo, 0); }
  public static void addAceitaFGTS(FlatBufferBuilder builder, boolean aceitaFGTS) { builder.addBoolean(11, aceitaFGTS, true); }
  public static void addUrlFoto(FlatBufferBuilder builder, int urlFotoOffset) { builder.addOffset(13, urlFotoOffset, 0); }
  public static void addVendedorType(FlatBufferBuilder builder, byte vendedorType) { builder.addByte(14, vendedorType, 0); }
  public static void addVendedor(FlatBufferBuilder builder, int vendedorOffset) { builder.addOffset(15, vendedorOffset, 0); }
  public static int endApartamento(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 34);  // vendedor
    return o;
  }
};

