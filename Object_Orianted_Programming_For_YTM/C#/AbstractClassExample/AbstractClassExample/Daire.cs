using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractClassExample
{
    public class Daire : Sekil
    {
        public double YariCap { get; set; }

        public Daire(double yariCap)
        {
            YariCap = yariCap;
        }

        public override double AlanHesapla()
        {
            return Math.PI * YariCap * YariCap;
        }
    }
}
