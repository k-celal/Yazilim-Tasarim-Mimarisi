public class SporAraba  extends Araba/*İnheritance */ {
    boolean turbo;
    
    public SporAraba(String marka, String model, boolean turbo) {
        super(marka, model);
        this.turbo = turbo;
    }
    public void hareketEt() {
        System.out.println("Spor araba hızlı bir şekilde hareket ediyor.");
    }
}
