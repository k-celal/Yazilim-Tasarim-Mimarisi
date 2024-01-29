public class DergiKapakUret  implements KapakArayuz{
    private KapakRengi kr;
    private KapakBoyutu kb;
    
    public DergiKapakUret(KapakRengi kr, KapakBoyutu kb) {
        this.kr = kr;
        this.kb = kb;
    }

    @Override
    public void KapakUret() {
        kr.Boya();
        kb.BoyutaGoreKes();
    }
    
}
