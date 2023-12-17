import java.util.Hashtable;

public class Sekil {
    private String sekilTipi;
    private Hashtable<String, Object> sekilBilgileri= new Hashtable<String,Object>();
    public  Sekil(String sekilTipi){
        this.sekilTipi=sekilTipi;
    }
    public Object get(String key) {
        return sekilBilgileri.get(key);
    }

    public void set(String key, Object value) {
        sekilBilgileri.put(key, value);
    }
    public void SekliYazdir(){
        System.out.println("Sekil tipi: "+sekilTipi);
        System.out.println("Sekil bilgileri: "+sekilBilgileri);
    }

}
