public class App {
    public static void main(String[] args) throws Exception {
        Mercedes merso = new Mercedes();
        merso.start();
        merso.TurboAc();
        System.out.println(" Speed: " + merso.gethiz());
        Ferrari ferro = new Ferrari();
        ferro.start();
        ferro.KlimaAc();
        ferro.TurboAc();
        System.out.println(" Speed: " + ferro.gethiz());
        BMW bmw = new BMW();
        bmw.start();  
        bmw.KlimaAc();
        System.out.println(" Speed: " + bmw.gethiz());
    }
    
}
