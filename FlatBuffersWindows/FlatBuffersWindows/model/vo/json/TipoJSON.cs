using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace FlatBuffersWindows.model.vo.json
{

    [JsonConverter(typeof(StringEnumConverter))]
    public enum TipoJSON
    {
        [EnumMember(Value = "compra")]
        Compra,

        [EnumMember(Value = "aluguel")]
        Aluguel
    };

}
