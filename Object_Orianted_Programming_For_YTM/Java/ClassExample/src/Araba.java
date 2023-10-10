public class Araba implements Surulebilir{
    public String marka;
    String model; //default olarak public
    private int km; //Encapsulation
    
    public Araba(){}

    public Araba(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }
    public int getKM(){ 
        return km;
    }
    public void calistir() {
        System.out.println(marka + " Araba çalıştı.");
    }
    public void hareketEt() {
        System.out.println("Araba hareket ediyor.");
    }
    public void ucakModuAktif(){
        System.out.println("Araba ucmaya hazirlaniyor");
    }
}
