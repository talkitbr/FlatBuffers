using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FlatBuffersWindows.model.vo.json
{
    class CasaJSON : ImovelJSON
    {
        public AreaJSON areaTerreno { get; set; }
        public float areaConstruida { get; set; }
    }
}
