// automatically generated, do not modify

package com.talkitbr.flatbuffersandroid.model.vo.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Imobiliaria extends Table {
  public static Imobiliaria getRootAsImobiliaria(ByteBuffer _bb) { return getRootAsImobiliaria(_bb, new Imobiliaria()); }
  public static Imobiliaria getRootAsImobiliaria(ByteBuffer _bb, Imobiliaria obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Imobiliaria __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String nome() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nomeAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String endereco() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer enderecoAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public int numero() { int o = __offset(8); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public String bairro() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer bairroAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public String cidade() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer cidadeAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public byte estado() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public String telefone() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer telefoneAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }

  public static int createImobiliaria(FlatBufferBuilder builder,
      int nome,
      int endereco,
      int numero,
      int bairro,
      int cidade,
      byte estado,
      int telefone) {
    builder.startObject(7);
    Imobiliaria.addTelefone(builder, telefone);
    Imobiliaria.addCidade(builder, cidade);
    Imobiliaria.addBairro(builder, bairro);
    Imobiliaria.addEndereco(builder, endereco);
    Imobiliaria.addNome(builder, nome);
    Imobiliaria.addNumero(builder, numero);
    Imobiliaria.addEstado(builder, estado);
    return Imobiliaria.endImobiliaria(builder);
  }

  public static void startImobiliaria(FlatBufferBuilder builder) { builder.startObject(7); }
  public static void addNome(FlatBufferBuilder builder, int nomeOffset) { builder.addOffset(0, nomeOffset, 0); }
  public static void addEndereco(FlatBufferBuilder builder, int enderecoOffset) { builder.addOffset(1, enderecoOffset, 0); }
  public static void addNumero(FlatBufferBuilder builder, int numero) { builder.addShort(2, (short)(numero & 0xFFFF), 0); }
  public static void addBairro(FlatBufferBuilder builder, int bairroOffset) { builder.addOffset(3, bairroOffset, 0); }
  public static void addCidade(FlatBufferBuilder builder, int cidadeOffset) { builder.addOffset(4, cidadeOffset, 0); }
  public static void addEstado(FlatBufferBuilder builder, byte estado) { builder.addByte(5, estado, 0); }
  public static void addTelefone(FlatBufferBuilder builder, int telefoneOffset) { builder.addOffset(6, telefoneOffset, 0); }
  public static int endImobiliaria(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

