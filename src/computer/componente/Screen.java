package Lectia2.src.computer.componente;

import javax.script.ScriptEngine;

public class Screen {
    private int inch;

    public Screen(int inch) {
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {

        this.inch = inch;
    }
}