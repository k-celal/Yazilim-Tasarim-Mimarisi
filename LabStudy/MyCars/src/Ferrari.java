public class Ferrari extends Car implements IKlima,ITurbo{
    public Ferrari(){
        setHizlanma(20);
    }
    @Override
    public void TurboAc() {
        setHizlanma(gethizlanma()*2);
    }

    @Override
    public void KlimaAc() {
       setHizlanma(gethizlanma()*0.9);
    }

    @Override
    public void start() {
        setHiz(gethiz()+gethizlanma());
    }
    
}
