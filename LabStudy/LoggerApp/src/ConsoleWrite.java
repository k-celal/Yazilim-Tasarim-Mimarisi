public class ConsoleWrite implements ILogYazdir{

    @Override
    public void Yazdir(Log lg) {
        System.out.println("Konsola log yaziliyor" + lg.getMesaj());
    }
    
}
