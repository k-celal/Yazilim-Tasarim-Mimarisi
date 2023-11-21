// interface FonksiyonelYazici {
//     void Yazdir();

//     void Tara();
// }

// class Yazici1:FonksiyonelYazici
// {

//     public void Yazdir()
//         {
//             Console.WriteLine("Yazici1 Yazdir");
//         }

//     public void Tara() {
//         Console.WriteLine("Yazici1 Tara");
//     }
// }

// class Yazici2:FonksiyonelYazici
// {

//     public void Yazdir()
//         {
//             Console.WriteLine("Yazici2 Yazdir");
//         }

//     public void Tara() {
//         throw new Exception("Yazici2 sinifinin tarayici özelligi yoktur.");
//     }
// }

// class YaziciProcess {
//     FonksiyonelYazici FK;

//     public YaziciProcess(FonksiyonelYazici yazici) {
//         FK = yazici;
//     }

//     public void Yazdir() {
//         FK.Yazdir();
//     }

//     public void Tara()
//         {
//             if (!(FK is Yazici2))
//                 FK.Tara();
//         }
// }

// class Program {
//     static void Main(string[] args) {
//         YaziciProcess p = new YaziciProcess(new Yazici1());
//         p.Yazdir();
//         p.Tara();

//         p = new YaziciProcess(new Yazici2());
//         p.Yazdir();
//         p.Tara();

//         Console.ReadKey();
//     }
// }