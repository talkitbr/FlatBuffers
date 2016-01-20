using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FlatBuffersWindows.model.vo.json
{
    class ImobiliariaJSON : VendedorJSON
    {
        public string endereco { get; set; }
		public int numero { get; set; }
		public string bairro { get; set; }
		public string cidade { get; set; }
		public EstadoJSON estado { get; set; }
    }
}
