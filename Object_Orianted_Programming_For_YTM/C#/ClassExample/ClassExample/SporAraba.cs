using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassExample
{
    public class SporAraba : Araba
    {
        public bool Turbo { get; set; }

        public SporAraba(string marka, string model, bool turbo) : base(marka, model)
        {
            Turbo = turbo;
        }
        public override void HareketEt()
        {
            Console.WriteLine("Spor araba hızlı bir şekilde hareket ediyor.");
        }
    }
}
