public class Satici extends Kullanici{
    private String vkn;

    public Satici(String vkn) {
        this.vkn = vkn;
    }

    public String getVkn() {
        return vkn;
    }
    public void setVkn(String vkn) {
        this.vkn = vkn;
    }

    public void urunleriListele(){
        System.out.println("Urunler listelendi");
    }
}
