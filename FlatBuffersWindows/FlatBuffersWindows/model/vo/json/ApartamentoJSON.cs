using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FlatBuffersWindows.model.vo.json
{
    class ApartamentoJSON : ImovelJSON
    {
        public int numApto { get; set; }
        public float area { get; set; }
    }
}
