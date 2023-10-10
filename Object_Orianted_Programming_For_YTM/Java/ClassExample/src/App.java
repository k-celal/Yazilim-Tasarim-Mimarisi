
public class App {
    public static void main(String[] args) throws Exception {
        Araba araba1 = new Araba(); //şuan boş olan constuctor çağırılıyor eğer constructor var fakat boş constructor tanımlanmamış ise hata verir
        araba1.marka = "Honda";
        araba1.model = "Civic";
        araba1.calistir();
        Araba araba2= new Araba("Fiat","Egea");
        araba2.calistir();
    }
}
