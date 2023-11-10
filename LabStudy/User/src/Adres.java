class Adres {
    private String il;
    private String ilçe;
    public Adres(){}
    public Adres(String il, String ilçe) {
        this.il = il;
        this.ilçe = ilçe;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlçe() {
        return ilçe;
    }

    public void setIlçe(String ilçe) {
        this.ilçe = ilçe;
    }
}