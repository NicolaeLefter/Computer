package Lectia2.src.computer.componente;

public class Keybouard {

    private String modelul;
    private int numberoftaste;

    public Keybouard(String modelul, int numberoftaste) {
        this.numberoftaste = numberoftaste;
        this.modelul = modelul;
    }

    public String getModelul() {

        return modelul;
    }

    public int getNumberoftaste() {
        return numberoftaste;
    }

    public void setModelul(String modelul) {
        this.modelul = modelul;

    }


}