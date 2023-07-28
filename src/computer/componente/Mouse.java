package Lectia2.src.computer.componente;

public class Mouse {

   private String tipul;
   private int anul;

    public Mouse(String tipul, int anul) {

        this.tipul = tipul;
        this.anul = anul;
    }

    public String getTipul() {
        return tipul;
    }
    public int getAnul(){
        return anul;
    }

    public void setTipul(String tipul) {

        this.tipul = tipul;
    }
    public void setAnul(int anul){
        this.anul = anul;
    }
}