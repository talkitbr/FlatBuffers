// automatically generated, do not modify

namespace FlatBuffersWindows.model.vo.fb
{

using FlatBuffers;

public sealed class Imobiliaria : Table {
  public static Imobiliaria GetRootAsImobiliaria(ByteBuffer _bb) { return GetRootAsImobiliaria(_bb, new Imobiliaria()); }
  public static Imobiliaria GetRootAsImobiliaria(ByteBuffer _bb, Imobiliaria obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public Imobiliaria __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public string Nome { get { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; } }
  public string Endereco { get { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; } }
  public ushort Numero { get { int o = __offset(8); return o != 0 ? bb.GetUshort(o + bb_pos) : (ushort)0; } }
  public string Bairro { get { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; } }
  public string Cidade { get { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; } }
  public Estado Estado { get { int o = __offset(14); return o != 0 ? (Estado)bb.GetSbyte(o + bb_pos) : (Estado)0; } }
  public string Telefone { get { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; } }

  public static Offset<Imobiliaria> CreateImobiliaria(FlatBufferBuilder builder,
      StringOffset nome = default(StringOffset),
      StringOffset endereco = default(StringOffset),
      ushort numero = 0,
      StringOffset bairro = default(StringOffset),
      StringOffset cidade = default(StringOffset),
      Estado estado = (Estado)0,
      StringOffset telefone = default(StringOffset)) {
    builder.StartObject(7);
    Imobiliaria.AddTelefone(builder, telefone);
    Imobiliaria.AddCidade(builder, cidade);
    Imobiliaria.AddBairro(builder, bairro);
    Imobiliaria.AddEndereco(builder, endereco);
    Imobiliaria.AddNome(builder, nome);
    Imobiliaria.AddNumero(builder, numero);
    Imobiliaria.AddEstado(builder, estado);
    return Imobiliaria.EndImobiliaria(builder);
  }

  public static void StartImobiliaria(FlatBufferBuilder builder) { builder.StartObject(7); }
  public static void AddNome(FlatBufferBuilder builder, StringOffset nomeOffset) { builder.AddOffset(0, nomeOffset.Value, 0); }
  public static void AddEndereco(FlatBufferBuilder builder, StringOffset enderecoOffset) { builder.AddOffset(1, enderecoOffset.Value, 0); }
  public static void AddNumero(FlatBufferBuilder builder, ushort numero) { builder.AddUshort(2, numero, 0); }
  public static void AddBairro(FlatBufferBuilder builder, StringOffset bairroOffset) { builder.AddOffset(3, bairroOffset.Value, 0); }
  public static void AddCidade(FlatBufferBuilder builder, StringOffset cidadeOffset) { builder.AddOffset(4, cidadeOffset.Value, 0); }
  public static void AddEstado(FlatBufferBuilder builder, Estado estado) { builder.AddSbyte(5, (sbyte)(estado), 0); }
  public static void AddTelefone(FlatBufferBuilder builder, StringOffset telefoneOffset) { builder.AddOffset(6, telefoneOffset.Value, 0); }
  public static Offset<Imobiliaria> EndImobiliaria(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<Imobiliaria>(o);
  }
};


}
