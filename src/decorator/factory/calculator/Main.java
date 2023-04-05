package decorator.factory.calculator;

import decorator.factory.calculator.factory.CalculableFactoryWithLog;

// ������� ����������� ��������, ��� ������ Calculator. ����� Calculator �� ������ ���������.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactoryWithLog();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();
    }
}
