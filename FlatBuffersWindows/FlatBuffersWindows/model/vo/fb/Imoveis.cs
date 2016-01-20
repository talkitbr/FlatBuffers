// automatically generated, do not modify

namespace FlatBuffersWindows.model.vo.fb
{

using FlatBuffers;

public sealed class Imoveis : Table {
  public static Imoveis GetRootAsImoveis(ByteBuffer _bb) { return GetRootAsImoveis(_bb, new Imoveis()); }
  public static Imoveis GetRootAsImoveis(ByteBuffer _bb, Imoveis obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public static bool ImoveisBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "IMV3"); }
  public Imoveis __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public Casa GetCasas(int j) { return GetCasas(new Casa(), j); }
  public Casa GetCasas(Casa obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int CasasLength { get { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; } }
  public Apartamento GetAptos(int j) { return GetAptos(new Apartamento(), j); }
  public Apartamento GetAptos(Apartamento obj, int j) { int o = __offset(6); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int AptosLength { get { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; } }

  public static Offset<Imoveis> CreateImoveis(FlatBufferBuilder builder,
      VectorOffset casas = default(VectorOffset),
      VectorOffset aptos = default(VectorOffset)) {
    builder.StartObject(2);
    Imoveis.AddAptos(builder, aptos);
    Imoveis.AddCasas(builder, casas);
    return Imoveis.EndImoveis(builder);
  }

  public static void StartImoveis(FlatBufferBuilder builder) { builder.StartObject(2); }
  public static void AddCasas(FlatBufferBuilder builder, VectorOffset casasOffset) { builder.AddOffset(0, casasOffset.Value, 0); }
  public static VectorOffset CreateCasasVector(FlatBufferBuilder builder, Offset<Casa>[] data) { builder.StartVector(4, data.Length, 4); for (int i = data.Length - 1; i >= 0; i--) builder.AddOffset(data[i].Value); return builder.EndVector(); }
  public static void StartCasasVector(FlatBufferBuilder builder, int numElems) { builder.StartVector(4, numElems, 4); }
  public static void AddAptos(FlatBufferBuilder builder, VectorOffset aptosOffset) { builder.AddOffset(1, aptosOffset.Value, 0); }
  public static VectorOffset CreateAptosVector(FlatBufferBuilder builder, Offset<Apartamento>[] data) { builder.StartVector(4, data.Length, 4); for (int i = data.Length - 1; i >= 0; i--) builder.AddOffset(data[i].Value); return builder.EndVector(); }
  public static void StartAptosVector(FlatBufferBuilder builder, int numElems) { builder.StartVector(4, numElems, 4); }
  public static Offset<Imoveis> EndImoveis(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<Imoveis>(o);
  }
  public static void FinishImoveisBuffer(FlatBufferBuilder builder, Offset<Imoveis> offset) { builder.Finish(offset.Value, "IMV3"); }
};


}
