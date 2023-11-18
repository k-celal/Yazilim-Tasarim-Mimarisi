public abstract class Car {
    private double hiz;
    private double hizlanma;

    public Car() {
        setHiz(0);
    }

    public void setHiz(double hiz) {
        this.hiz = hiz;
    }

    public void setHizlanma(double hizlanma) {
        this.hizlanma = hizlanma;
    }

    public double gethiz() {
        return hiz;
    }

    public double gethizlanma() {
        return hizlanma;
    }

    public abstract void start();
}
