// automatically generated, do not modify

namespace FlatBuffersWindows.model.vo.fb
{

using FlatBuffers;

public sealed class Corretor : Table {
  public static Corretor GetRootAsCorretor(ByteBuffer _bb) { return GetRootAsCorretor(_bb, new Corretor()); }
  public static Corretor GetRootAsCorretor(ByteBuffer _bb, Corretor obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public Corretor __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public string Nome { get { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; } }
  public string Telefone { get { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; } }
  public string Creci { get { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; } }

  public static Offset<Corretor> CreateCorretor(FlatBufferBuilder builder,
      StringOffset nome = default(StringOffset),
      StringOffset telefone = default(StringOffset),
      StringOffset creci = default(StringOffset)) {
    builder.StartObject(3);
    Corretor.AddCreci(builder, creci);
    Corretor.AddTelefone(builder, telefone);
    Corretor.AddNome(builder, nome);
    return Corretor.EndCorretor(builder);
  }

  public static void StartCorretor(FlatBufferBuilder builder) { builder.StartObject(3); }
  public static void AddNome(FlatBufferBuilder builder, StringOffset nomeOffset) { builder.AddOffset(0, nomeOffset.Value, 0); }
  public static void AddTelefone(FlatBufferBuilder builder, StringOffset telefoneOffset) { builder.AddOffset(1, telefoneOffset.Value, 0); }
  public static void AddCreci(FlatBufferBuilder builder, StringOffset creciOffset) { builder.AddOffset(2, creciOffset.Value, 0); }
  public static Offset<Corretor> EndCorretor(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<Corretor>(o);
  }
};


}
