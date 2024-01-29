public interface FYazici {
    void Yazdir();
}

interface Tarayabilir {
    void Tara();
}

class Yazici1 implements FYazici, Tarayabilir {
    public void Yazdir() {
        System.out.println("Yazici1 Yazdir");
    }

    public void Tara() {
        System.out.println("Yazici1 Tara");
    }
}

class Yazici2 implements FYazici {

    @Override
    public void Yazdir() {
        System.out.println("Yazici2 Yazdir");
    }
}
class YaziciProcess {
    FYazici yazici;

    public YaziciProcess(FYazici yazici) {
        this.yazici = yazici;
    }
    public void Yazdir() {
        yazici.Yazdir();
    }

    public void Tara() {
        if (!(yazici instanceof Tarayabilir)) {
            System.out.println("Bu yazici tarama yapamaz");
            
        }
        ((Tarayabilir) yazici).Tara();
    }
}
class Program {
    public static void main(String[] args) {
        YaziciProcess p = new YaziciProcess(new Yazici1());
        p.Yazdir();
        p.Tara();
        p = new YaziciProcess(new Yazici2());
        p.Yazdir();
        p.Tara();
        
    }
}