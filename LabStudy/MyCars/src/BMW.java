public class BMW extends Car implements IKlima{

    public BMW(){
        setHizlanma(51);
    }
    
    @Override
    public void start() {
        setHiz(gethiz()+gethizlanma());
    }

    @Override
    public void KlimaAc() {
        setHizlanma(gethizlanma()*0.9);
    }

}
