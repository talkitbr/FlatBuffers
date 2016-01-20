// automatically generated, do not modify

namespace FlatBuffersWindows.model.vo.fb
{

using FlatBuffers;

public sealed class Area : Struct {
  public Area __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public float Largura { get { return bb.GetFloat(bb_pos + 0); } }
  public float Comprimento { get { return bb.GetFloat(bb_pos + 4); } }

  public static Offset<Area> CreateArea(FlatBufferBuilder builder, float Largura, float Comprimento) {
    builder.Prep(4, 8);
    builder.PutFloat(Comprimento);
    builder.PutFloat(Largura);
    return new Offset<Area>(builder.Offset);
  }
};


}
