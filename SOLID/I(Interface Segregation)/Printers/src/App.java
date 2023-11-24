public class App {
    public static void main(String[] args) throws Exception {
        SamsungPrinter2 sp2=new SamsungPrinter2();
        sp2.Scan();
        HpPrinter2 hp2= new HpPrinter2();
        hp2.Scan();

        SamsungPrinter sp=new SamsungPrinter();
        sp.Print();
        sp.Scan();
        HpPrinter hp = new HpPrinter();
        hp.Print();
        
    }
}
