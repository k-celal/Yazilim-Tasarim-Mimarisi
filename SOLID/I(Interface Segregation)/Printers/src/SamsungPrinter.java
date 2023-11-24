public class SamsungPrinter implements IPrint,IScan,IDublePrint{
    @Override
    public void Print() {
        System.out.println("Samsung Printer");
    }
    @Override
    public void Scan() {
        System.out.println("Samsung Scan");
    }
    @Override
    public void DublePrint() {
        System.out.println("Samsung DublePrint");
    }
}
