public class CanonPrinter implements IPrint,IFax{
    @Override
    public void Print() {
        System.out.println("Canon Printer");
    }
    @Override
    public void Fax() {
        System.out.println("Canon Fax");
    }
}
