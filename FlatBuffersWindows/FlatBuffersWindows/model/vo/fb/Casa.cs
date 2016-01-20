// automatically generated, do not modify

namespace FlatBuffersWindows.model.vo.fb
{

using FlatBuffers;

public sealed class Casa : Table {
  public static Casa GetRootAsCasa(ByteBuffer _bb) { return GetRootAsCasa(_bb, new Casa()); }
  public static Casa GetRootAsCasa(ByteBuffer _bb, Casa obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public Casa __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public string Endereco { get { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; } }
  public ushort Numero { get { int o = __offset(6); return o != 0 ? bb.GetUshort(o + bb_pos) : (ushort)0; } }
  public string Bairro { get { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; } }
  public string Cidade { get { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; } }
  public Estado Estado { get { int o = __offset(12); return o != 0 ? (Estado)bb.GetSbyte(o + bb_pos) : (Estado)0; } }
  public Area AreaTerreno { get { return GetAreaTerreno(new Area()); } }
  public Area GetAreaTerreno(Area obj) { int o = __offset(14); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  public float AreaConstruida { get { int o = __offset(16); return o != 0 ? bb.GetFloat(o + bb_pos) : (float)0; } }
  public byte Quartos { get { int o = __offset(18); return o != 0 ? bb.Get(o + bb_pos) : (byte)0; } }
  public Tipo Tipo { get { int o = __offset(20); return o != 0 ? (Tipo)bb.GetSbyte(o + bb_pos) : (Tipo)0; } }
  public float Valor { get { int o = __offset(22); return o != 0 ? bb.GetFloat(o + bb_pos) : (float)0; } }
  public bool AceitaFGTS { get { int o = __offset(24); return o != 0 ? 0!=bb.Get(o + bb_pos) : (bool)true; } }
  public string UrlFoto { get { int o = __offset(28); return o != 0 ? __string(o + bb_pos) : null; } }
  public Vendedor VendedorType { get { int o = __offset(30); return o != 0 ? (Vendedor)bb.Get(o + bb_pos) : (Vendedor)0; } }
  public TTable GetVendedor<TTable>(TTable obj) where TTable : Table { int o = __offset(32); return o != 0 ? __union(obj, o) : null; }

  public static void StartCasa(FlatBufferBuilder builder) { builder.StartObject(15); }
  public static void AddEndereco(FlatBufferBuilder builder, StringOffset enderecoOffset) { builder.AddOffset(0, enderecoOffset.Value, 0); }
  public static void AddNumero(FlatBufferBuilder builder, ushort numero) { builder.AddUshort(1, numero, 0); }
  public static void AddBairro(FlatBufferBuilder builder, StringOffset bairroOffset) { builder.AddOffset(2, bairroOffset.Value, 0); }
  public static void AddCidade(FlatBufferBuilder builder, StringOffset cidadeOffset) { builder.AddOffset(3, cidadeOffset.Value, 0); }
  public static void AddEstado(FlatBufferBuilder builder, Estado estado) { builder.AddSbyte(4, (sbyte)(estado), 0); }
  public static void AddAreaTerreno(FlatBufferBuilder builder, Offset<Area> areaTerrenoOffset) { builder.AddStruct(5, areaTerrenoOffset.Value, 0); }
  public static void AddAreaConstruida(FlatBufferBuilder builder, float areaConstruida) { builder.AddFloat(6, areaConstruida, 0); }
  public static void AddQuartos(FlatBufferBuilder builder, byte quartos) { builder.AddByte(7, quartos, 0); }
  public static void AddTipo(FlatBufferBuilder builder, Tipo tipo) { builder.AddSbyte(8, (sbyte)(tipo), 0); }
  public static void AddValor(FlatBufferBuilder builder, float valor) { builder.AddFloat(9, valor, 0); }
  public static void AddAceitaFGTS(FlatBufferBuilder builder, bool aceitaFGTS) { builder.AddBool(10, aceitaFGTS, true); }
  public static void AddUrlFoto(FlatBufferBuilder builder, StringOffset urlFotoOffset) { builder.AddOffset(12, urlFotoOffset.Value, 0); }
  public static void AddVendedorType(FlatBufferBuilder builder, Vendedor vendedorType) { builder.AddByte(13, (byte)(vendedorType), 0); }
  public static void AddVendedor(FlatBufferBuilder builder, int vendedorOffset) { builder.AddOffset(14, vendedorOffset, 0); }
  public static Offset<Casa> EndCasa(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    builder.Required(o, 14);  // areaTerreno
    builder.Required(o, 32);  // vendedor
    return new Offset<Casa>(o);
  }
};


}
