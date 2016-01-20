// automatically generated, do not modify

namespace FlatBuffersWindows.model.vo.fb
{

using FlatBuffers;

public sealed class Apartamento : Table {
  public static Apartamento GetRootAsApartamento(ByteBuffer _bb) { return GetRootAsApartamento(_bb, new Apartamento()); }
  public static Apartamento GetRootAsApartamento(ByteBuffer _bb, Apartamento obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public Apartamento __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public string Endereco { get { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; } }
  public ushort Numero { get { int o = __offset(6); return o != 0 ? bb.GetUshort(o + bb_pos) : (ushort)0; } }
  public byte NumApto { get { int o = __offset(8); return o != 0 ? bb.Get(o + bb_pos) : (byte)0; } }
  public string Bairro { get { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; } }
  public string Cidade { get { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; } }
  public Estado Estado { get { int o = __offset(14); return o != 0 ? (Estado)bb.GetSbyte(o + bb_pos) : (Estado)0; } }
  public float Area { get { int o = __offset(16); return o != 0 ? bb.GetFloat(o + bb_pos) : (float)0; } }
  public byte Quartos { get { int o = __offset(18); return o != 0 ? bb.Get(o + bb_pos) : (byte)0; } }
  public float Valor { get { int o = __offset(20); return o != 0 ? bb.GetFloat(o + bb_pos) : (float)0; } }
  public float ValorCondominio { get { int o = __offset(22); return o != 0 ? bb.GetFloat(o + bb_pos) : (float)0; } }
  public Tipo Tipo { get { int o = __offset(24); return o != 0 ? (Tipo)bb.GetSbyte(o + bb_pos) : (Tipo)0; } }
  public bool AceitaFGTS { get { int o = __offset(26); return o != 0 ? 0!=bb.Get(o + bb_pos) : (bool)true; } }
  public string UrlFoto { get { int o = __offset(30); return o != 0 ? __string(o + bb_pos) : null; } }
  public Vendedor VendedorType { get { int o = __offset(32); return o != 0 ? (Vendedor)bb.Get(o + bb_pos) : (Vendedor)0; } }
  public TTable GetVendedor<TTable>(TTable obj) where TTable : Table { int o = __offset(34); return o != 0 ? __union(obj, o) : null; }

  public static Offset<Apartamento> CreateApartamento(FlatBufferBuilder builder,
      StringOffset endereco = default(StringOffset),
      ushort numero = 0,
      byte numApto = 0,
      StringOffset bairro = default(StringOffset),
      StringOffset cidade = default(StringOffset),
      Estado estado = (Estado)0,
      float area = 0,
      byte quartos = 0,
      float valor = 0,
      float valorCondominio = 0,
      Tipo tipo = (Tipo)0,
      bool aceitaFGTS = true,
      StringOffset urlFoto = default(StringOffset),
      Vendedor vendedor_type = (Vendedor)0,
      int vendedor = 0) {
    builder.StartObject(16);
    Apartamento.AddVendedor(builder, vendedor);
    Apartamento.AddUrlFoto(builder, urlFoto);
    Apartamento.AddValorCondominio(builder, valorCondominio);
    Apartamento.AddValor(builder, valor);
    Apartamento.AddArea(builder, area);
    Apartamento.AddCidade(builder, cidade);
    Apartamento.AddBairro(builder, bairro);
    Apartamento.AddEndereco(builder, endereco);
    Apartamento.AddNumero(builder, numero);
    Apartamento.AddVendedorType(builder, vendedor_type);
    Apartamento.AddAceitaFGTS(builder, aceitaFGTS);
    Apartamento.AddTipo(builder, tipo);
    Apartamento.AddQuartos(builder, quartos);
    Apartamento.AddEstado(builder, estado);
    Apartamento.AddNumApto(builder, numApto);
    return Apartamento.EndApartamento(builder);
  }

  public static void StartApartamento(FlatBufferBuilder builder) { builder.StartObject(16); }
  public static void AddEndereco(FlatBufferBuilder builder, StringOffset enderecoOffset) { builder.AddOffset(0, enderecoOffset.Value, 0); }
  public static void AddNumero(FlatBufferBuilder builder, ushort numero) { builder.AddUshort(1, numero, 0); }
  public static void AddNumApto(FlatBufferBuilder builder, byte numApto) { builder.AddByte(2, numApto, 0); }
  public static void AddBairro(FlatBufferBuilder builder, StringOffset bairroOffset) { builder.AddOffset(3, bairroOffset.Value, 0); }
  public static void AddCidade(FlatBufferBuilder builder, StringOffset cidadeOffset) { builder.AddOffset(4, cidadeOffset.Value, 0); }
  public static void AddEstado(FlatBufferBuilder builder, Estado estado) { builder.AddSbyte(5, (sbyte)(estado), 0); }
  public static void AddArea(FlatBufferBuilder builder, float area) { builder.AddFloat(6, area, 0); }
  public static void AddQuartos(FlatBufferBuilder builder, byte quartos) { builder.AddByte(7, quartos, 0); }
  public static void AddValor(FlatBufferBuilder builder, float valor) { builder.AddFloat(8, valor, 0); }
  public static void AddValorCondominio(FlatBufferBuilder builder, float valorCondominio) { builder.AddFloat(9, valorCondominio, 0); }
  public static void AddTipo(FlatBufferBuilder builder, Tipo tipo) { builder.AddSbyte(10, (sbyte)(tipo), 0); }
  public static void AddAceitaFGTS(FlatBufferBuilder builder, bool aceitaFGTS) { builder.AddBool(11, aceitaFGTS, true); }
  public static void AddUrlFoto(FlatBufferBuilder builder, StringOffset urlFotoOffset) { builder.AddOffset(13, urlFotoOffset.Value, 0); }
  public static void AddVendedorType(FlatBufferBuilder builder, Vendedor vendedorType) { builder.AddByte(14, (byte)(vendedorType), 0); }
  public static void AddVendedor(FlatBufferBuilder builder, int vendedorOffset) { builder.AddOffset(15, vendedorOffset, 0); }
  public static Offset<Apartamento> EndApartamento(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    builder.Required(o, 34);  // vendedor
    return new Offset<Apartamento>(o);
  }
};


}
