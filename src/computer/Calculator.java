package Lectia2.src.computer;

import Lectia2.src.computer.componente.*;


public class Calculator {
    private MotherBoard motherBoard;
    private Cpu cpu;
    private Mouse mouse;
    private Keybouard keybouard;
    private Screen screen;
    private String nume;

    //Constructor
    public Calculator(MotherBoard motherBoard, Cpu cpu, Mouse mouse, Keybouard keybouard, Screen screen) {
        this.motherBoard = motherBoard;
        this.cpu = cpu;
        this.mouse = mouse;
        this.keybouard = keybouard;
        this.screen = screen;
    }

    //getters pentru fiecare componenta
    public String getNume(){
        return  nume;
    }
    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keybouard getKeybouard() {
        return keybouard;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getCpuModle() {
        return cpu.getModel();
    }

    public int getMotherBoardPrice() {
        return motherBoard.getPrice();
    }

    public String getMouseTip() {
        return mouse.getTipul();
    }
    // setters pentru fiecare componenta

    public void setNume(String nume){
        this.nume = nume;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setKeybouard(Keybouard keybouard) {
        this.keybouard = keybouard;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;

    }

    public void setKeybouardModel(String model) {
        this.keybouard.setModelul(model);
    }

    public void setScreenInch(int marime) {
        this.screen.setInch(marime);
    }

    public void setMotherBouardProducator(String producator) {
        this.motherBoard.setProducator(producator);
    }

    public void setCpuModel(String model) {
        //Aici se va face verificare daca modelul de Cpu este compatibil cu motherbouard, daca nu este compatibil nu se va seta Cpu-ul
        this.cpu.setModel(model);
        //Comentariu calculator
    }
}



