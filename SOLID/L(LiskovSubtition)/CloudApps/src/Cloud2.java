abstract class Cloud2 {
    public abstract void translate();

    public abstract void machineLearning();
}

class AWS2 extends Cloud2 {
    @Override
    public void translate() {
        System.out.println("AWS2 Translate");
    }

    @Override
    public void machineLearning() {
        System.out.println("AWS2 Machine Learning");
    }
}

class Azure2 extends Cloud2 {
    @Override
    public void translate() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void machineLearning() {
        System.out.println("Azure2 Machine Learning");
    }
}

class Google2 extends Cloud2 {
    @Override
    public void translate() {
        System.out.println("Google2 Translate");
    }

    @Override
    public void machineLearning() {
        System.out.println("Google2 Machine Learning");
    }
}
