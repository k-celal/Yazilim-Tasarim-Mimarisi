package Builder;

public class Main {
    public static void main(String[] args) {
        ISekilBuilder builder = new SekilBuilder1();
        SekilDirector director = new SekilDirector(builder);

        Sekil sekil = director.olustur();

        System.out.println(sekil);
    }
}
