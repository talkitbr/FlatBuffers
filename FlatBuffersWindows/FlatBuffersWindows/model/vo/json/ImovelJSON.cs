using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FlatBuffersWindows.model.vo.json
{
    abstract class ImovelJSON
    {
        public string endereco { get; set; }
		public int numero { get; set; }
		public string bairro { get; set; }
		public string cidade { get; set; }
		public EstadoJSON estado { get; set; }
		public int quartos { get; set; }
		public TipoJSON tipo { get; set; }
		public float valor { get; set; }
        public bool aceitaFGTS { get; set; } = true;
        public VendedorJSON vendedor { get; set; }
        public string urlFoto { get; set; }
    }
}
