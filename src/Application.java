package Lectia2.src;

import Lectia2.src.computer.Calculator;
import Lectia2.src.computer.componente.*;
import Lectia2.src.computer.service.ComputerService;

public class Application {
    public static void main(String[] args) {
        // Creem componentele si atribuim valori
        MotherBoard motherBoard1 = new MotherBoard();
        motherBoard1.setProducator("Asus");
        motherBoard1.setPrice(90);
        Cpu cpu1 = new Cpu("Intel Core i5");
        Mouse mouse1 = new Mouse("Fara fir", 2020);
        Keybouard keybouard1 = new Keybouard("USA", 66);
        Screen screen1 = new Screen(16);

        MotherBoard motherBoard2 = new MotherBoard();
        motherBoard2.setPrice(100);
        motherBoard2.setProducator("HP");
        Cpu cpu2 = new Cpu("AMD");
        Mouse mouse2 = new Mouse("Cu fir", 2019);
        Keybouard keybouard2 = new Keybouard("For Games", 104);
        Screen screen2 = new Screen(14);

        //Creem calcualtorul si setam componentele

        Calculator calculator1 = new Calculator(motherBoard1, cpu1, mouse1, keybouard1, screen1);
        calculator1.setScreenInch(18);
        calculator1.setCpuModel("");
        calculator1.setNume("Calculator1");
        Calculator calculator2 = new Calculator(motherBoard2, cpu2, mouse2, keybouard2, screen2);
        calculator2.setKeybouardModel("For Study");
        calculator2.setScreenInch(22);
        calculator2.setNume("Calculator2");
        // Afisam informatii despre calculator1
        ComputerService computerService = new ComputerService();
        computerService.afisareDateCalculator(calculator1);
        computerService.afisareDateCalculator(calculator2);

        // Afisam informatii despre calculatorul2

        calculator2.setMotherBouardProducator("Lenovo");
       computerService.afisareDateCalculator(calculator2);
       computerService.reparareCalculator(calculator1);
       computerService.reparareCalculator(calculator2);
// adfsdfsdfsdf
// Comentariu doi
    }

}
