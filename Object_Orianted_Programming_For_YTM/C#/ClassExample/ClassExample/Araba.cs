using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassExample
{
    public class Araba : ISurulebilir
    {
        public string Marka { get; set; }
        public string Model { get; set; }

        private string renk { get; set; }
        
        public Araba(string marka, string model)
        {
            Marka = marka;
            Model = model;
        }
        public void Calistir()
        {
            Console.WriteLine("Araba çalıştı.");
        }
        public Araba() { }
        public virtual void HareketEt()
        {
            Console.WriteLine("Araba hareket ediyor.");
        }
        public void ucakModuAktif()
        {
            Console.WriteLine("Araba ucmaya hazirlaniyor");
        }
    }
}
