package Poo;

public class Rai {
    private int info;
    private Rai prox;

    public Rai(int info) {
        this.info = info;
        this.prox = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Rai getProx() {
        return prox;
    }

    public void setProx(Rai prox) {
        this.prox = prox;
    }
}
    

