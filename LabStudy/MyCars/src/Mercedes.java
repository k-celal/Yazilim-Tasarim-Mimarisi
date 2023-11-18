public class Mercedes extends Car implements ITurbo{
    public Mercedes(){
        setHizlanma(30);
    }

    @Override
    public void TurboAc() {
       setHizlanma(gethizlanma()*2);
    }

    @Override
    public void start() {
       setHiz(gethiz()+gethizlanma());
    }
    
}