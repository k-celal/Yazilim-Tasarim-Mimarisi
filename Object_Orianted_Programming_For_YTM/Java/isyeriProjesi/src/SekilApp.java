abstract class Sekil {
    abstract double alan();
}

class Ucgen extends Sekil {
    double taban, yukseklik;

    Ucgen(double taban, double yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }

    double alan() {
        return 0.5 * taban * yukseklik;
    }
}

class Kare extends Sekil {
    double kenar;

    Kare(double kenar) {
        this.kenar = kenar;
    }

    double alan() {
        return kenar * kenar;
    }
}

class Dikdortgen extends Sekil {
    double uzunKenar, kisaKenar;

    Dikdortgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    double alan() {
        return uzunKenar * kisaKenar;
    }
}

public class SekilApp {
    public static void main(String[] args) {
        Ucgen ucgen = new Ucgen(3, 4);
        Kare kare = new Kare(4);
        Dikdortgen dikdortgen = new Dikdortgen(5, 10);

        System.out.println("Üçgenin alanı: " + ucgen.alan());
        
        System.out.println("Karenin alanı: " + kare.alan());

        System.out.println("Dikdörtgenin alanı: " + dikdortgen.alan());
    }
}
