// automatically generated, do not modify

package com.talkitbr.flatbuffersandroid.model.vo.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Casa extends Table {
  public static Casa getRootAsCasa(ByteBuffer _bb) { return getRootAsCasa(_bb, new Casa()); }
  public static Casa getRootAsCasa(ByteBuffer _bb, Casa obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Casa __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String endereco() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer enderecoAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public int numero() { int o = __offset(6); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public String bairro() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer bairroAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String cidade() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer cidadeAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public byte estado() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Area areaTerreno() { return areaTerreno(new Area()); }
  public Area areaTerreno(Area obj) { int o = __offset(14); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  public float areaConstruida() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0; }
  public int quartos() { int o = __offset(18); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public byte tipo() { int o = __offset(20); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public float valor() { int o = __offset(22); return o != 0 ? bb.getFloat(o + bb_pos) : 0; }
  public boolean aceitaFGTS() { int o = __offset(24); return o != 0 ? 0!=bb.get(o + bb_pos) : true; }
  public String urlFoto() { int o = __offset(28); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer urlFotoAsByteBuffer() { return __vector_as_bytebuffer(28, 1); }
  public byte vendedorType() { int o = __offset(30); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table vendedor(Table obj) { int o = __offset(32); return o != 0 ? __union(obj, o) : null; }

  public static void startCasa(FlatBufferBuilder builder) { builder.startObject(15); }
  public static void addEndereco(FlatBufferBuilder builder, int enderecoOffset) { builder.addOffset(0, enderecoOffset, 0); }
  public static void addNumero(FlatBufferBuilder builder, int numero) { builder.addShort(1, (short)(numero & 0xFFFF), 0); }
  public static void addBairro(FlatBufferBuilder builder, int bairroOffset) { builder.addOffset(2, bairroOffset, 0); }
  public static void addCidade(FlatBufferBuilder builder, int cidadeOffset) { builder.addOffset(3, cidadeOffset, 0); }
  public static void addEstado(FlatBufferBuilder builder, byte estado) { builder.addByte(4, estado, 0); }
  public static void addAreaTerreno(FlatBufferBuilder builder, int areaTerrenoOffset) { builder.addStruct(5, areaTerrenoOffset, 0); }
  public static void addAreaConstruida(FlatBufferBuilder builder, float areaConstruida) { builder.addFloat(6, areaConstruida, 0); }
  public static void addQuartos(FlatBufferBuilder builder, int quartos) { builder.addByte(7, (byte)(quartos & 0xFF), 0); }
  public static void addTipo(FlatBufferBuilder builder, byte tipo) { builder.addByte(8, tipo, 0); }
  public static void addValor(FlatBufferBuilder builder, float valor) { builder.addFloat(9, valor, 0); }
  public static void addAceitaFGTS(FlatBufferBuilder builder, boolean aceitaFGTS) { builder.addBoolean(10, aceitaFGTS, true); }
  public static void addUrlFoto(FlatBufferBuilder builder, int urlFotoOffset) { builder.addOffset(12, urlFotoOffset, 0); }
  public static void addVendedorType(FlatBufferBuilder builder, byte vendedorType) { builder.addByte(13, vendedorType, 0); }
  public static void addVendedor(FlatBufferBuilder builder, int vendedorOffset) { builder.addOffset(14, vendedorOffset, 0); }
  public static int endCasa(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 14);  // areaTerreno
    builder.required(o, 32);  // vendedor
    return o;
  }
};

