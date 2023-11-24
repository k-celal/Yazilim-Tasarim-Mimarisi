public class DatabaseWrite implements IDatabaseConn,ILogYazdir{
    Database database = new Database();

    public DatabaseWrite(Database database) {
        this.database = database;
    }

    @Override
    public void Yazdir(Log lg) {
        baglantiAc();
        database.DBKaydet();
        baglantiKapa();
    }

    @Override
    public void baglantiAc() {
        System.out.println("Baglanti Acildi");
    }

    @Override
    public void baglantiKapa() {
        System.out.println("Baglanti Kapandi");

    }
}
