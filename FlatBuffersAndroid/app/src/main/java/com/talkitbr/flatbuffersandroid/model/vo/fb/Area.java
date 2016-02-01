// automatically generated, do not modify

package com.talkitbr.flatbuffersandroid.model.vo.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Area extends Struct {
  public Area __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public float largura() { return bb.getFloat(bb_pos + 0); }
  public float comprimento() { return bb.getFloat(bb_pos + 4); }

  public static int createArea(FlatBufferBuilder builder, float largura, float comprimento) {
    builder.prep(4, 8);
    builder.putFloat(comprimento);
    builder.putFloat(largura);
    return builder.offset();
  }
};

