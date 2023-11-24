public interface IPrinter2 {
    void print();
    void Scan();
    void Fax();
    void DublePrint();
}
class SamsungPrinter2 implements IPrinter2{
    @Override
    public void print() {
        System.out.println("Samsung Printer");
    }
    @Override
    public void Scan() {
        System.out.println("Samsung Scan");
    }
    @Override
    public void Fax() {
        System.out.println("Samsung Fax");
    }
    @Override
    public void DublePrint() {
        System.out.println("Samsung DublePrint");
    }
}
class HpPrinter2 implements IPrinter2{
    @Override
    public void print() {
        System.out.println("Hp Printer");
    }
    @Override
    public void Fax() {
        System.out.println("Hp Fax");
    }
    @Override
    public void DublePrint() {
        System.out.println("Hp DublePrint");
    }
    @Override
    public void Scan() {
        throw new UnsupportedOperationException("Unimplemented method 'Scan'");
    }
}
class CanonPrinter2 implements IPrinter2{
    @Override
    public void print() {
        System.out.println("Canon Printer");
    }
    @Override
    public void Fax() {
        throw new UnsupportedOperationException("Unsupported");
    }
    @Override
    public void DublePrint() {
        System.out.println("Canon DublePrint");
    }
    @Override
    public void Scan() {
        throw new UnsupportedOperationException("Unimplemented method 'Scan'");
    }
}