public abstract class ISekilOlusturucu {
    Sekil sekil;
    public abstract void KenarOlustur();
    public abstract void BaslangicKonumBelirle();
    public abstract void KenarUzunluklari();
    public abstract void KenarKalinliklari();
    public abstract void KenarRengi();
    public abstract void icRenk();
    public Sekil getSekil() {
        return sekil;
    }
}
