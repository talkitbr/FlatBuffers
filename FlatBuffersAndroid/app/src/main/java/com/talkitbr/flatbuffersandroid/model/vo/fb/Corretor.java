// automatically generated, do not modify

package com.talkitbr.flatbuffersandroid.model.vo.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Corretor extends Table {
  public static Corretor getRootAsCorretor(ByteBuffer _bb) { return getRootAsCorretor(_bb, new Corretor()); }
  public static Corretor getRootAsCorretor(ByteBuffer _bb, Corretor obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Corretor __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String nome() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nomeAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String telefone() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer telefoneAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String creci() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer creciAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }

  public static int createCorretor(FlatBufferBuilder builder,
      int nome,
      int telefone,
      int creci) {
    builder.startObject(3);
    Corretor.addCreci(builder, creci);
    Corretor.addTelefone(builder, telefone);
    Corretor.addNome(builder, nome);
    return Corretor.endCorretor(builder);
  }

  public static void startCorretor(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addNome(FlatBufferBuilder builder, int nomeOffset) { builder.addOffset(0, nomeOffset, 0); }
  public static void addTelefone(FlatBufferBuilder builder, int telefoneOffset) { builder.addOffset(1, telefoneOffset, 0); }
  public static void addCreci(FlatBufferBuilder builder, int creciOffset) { builder.addOffset(2, creciOffset, 0); }
  public static int endCorretor(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

