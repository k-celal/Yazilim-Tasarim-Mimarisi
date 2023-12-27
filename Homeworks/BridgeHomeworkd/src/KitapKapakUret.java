public class KitapKapakUret implements KapakArayuz{
    private KapakRengi kr;
    private KapakBoyutu kb;
    
    public KitapKapakUret(KapakRengi kr, KapakBoyutu kb) {
        this.kr = kr;
        this.kb = kb;
    }
    @Override
    public void KapakUret() {
        kr.Boya();
        kb.BoyutaGoreKes();
    }
    
}
