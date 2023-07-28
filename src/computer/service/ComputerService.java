package Lectia2.src.computer.service;

import Lectia2.src.computer.Calculator;

public class ComputerService {

    public void afisareDateCalculator(Calculator calculator){
        System.out.println("Informatii despre Calculator1");
        System.out.println("MotherBoard: " + calculator.getMotherBoard().getProducator());
        System.out.println("Price: " + calculator.getMotherBoardPrice());
        System.out.println("CPU: " + calculator.getCpuModle());
        System.out.println("Mouse: " + calculator.getMouseTip() + " , " + "anul produceri: " + calculator.getMouse().getAnul());
        System.out.println("Keybouard: " + calculator.getKeybouard().getModelul() + "," + "numarul de taste: " + calculator.getKeybouard().getNumberoftaste());
        System.out.println("Screen: " + calculator.getScreen().getInch());
    }
    public void reparareCalculator(Calculator calculator){
        System.out.println("Calculatorul de model: " +calculator.getNume() + " este in reparatie!");
    }
}
