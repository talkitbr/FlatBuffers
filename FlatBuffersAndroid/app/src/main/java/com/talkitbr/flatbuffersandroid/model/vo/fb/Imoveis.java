// automatically generated, do not modify

package com.talkitbr.flatbuffersandroid.model.vo.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Imoveis extends Table {
  public static Imoveis getRootAsImoveis(ByteBuffer _bb) { return getRootAsImoveis(_bb, new Imoveis()); }
  public static Imoveis getRootAsImoveis(ByteBuffer _bb, Imoveis obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public static boolean ImoveisBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "IMV3"); }
  public Imoveis __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public Casa casas(int j) { return casas(new Casa(), j); }
  public Casa casas(Casa obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int casasLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public Apartamento aptos(int j) { return aptos(new Apartamento(), j); }
  public Apartamento aptos(Apartamento obj, int j) { int o = __offset(6); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int aptosLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }

  public static int createImoveis(FlatBufferBuilder builder,
      int casas,
      int aptos) {
    builder.startObject(2);
    Imoveis.addAptos(builder, aptos);
    Imoveis.addCasas(builder, casas);
    return Imoveis.endImoveis(builder);
  }

  public static void startImoveis(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addCasas(FlatBufferBuilder builder, int casasOffset) { builder.addOffset(0, casasOffset, 0); }
  public static int createCasasVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startCasasVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addAptos(FlatBufferBuilder builder, int aptosOffset) { builder.addOffset(1, aptosOffset, 0); }
  public static int createAptosVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startAptosVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endImoveis(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishImoveisBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset, "IMV3"); }
};

