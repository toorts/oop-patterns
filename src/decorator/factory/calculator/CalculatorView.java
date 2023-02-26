package decorator.factory.calculator;

import java.util.Scanner;

public class CalculatorView {
    private final ICalculableFactory calculableFactory;

    public CalculatorView(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("¬ведите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("¬ведите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("¬ведите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("¬ведите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("–езультат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("≈ще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
