package decorator.factory.calculator.wrapper;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.log.Logger;

public class CalculatorDecorator implements Calculable {
    private Calculable calc;
    private Logger logger;

    public CalculatorDecorator(Calculable calc, Logger logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("Summing " + calc.getResult() + " with " + arg);
        Calculable result = calc.sum(arg);
        logger.log("Result " + result.getResult());
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("Multiply " + calc.getResult() + " with " + arg);
        Calculable result = calc.multi(arg);
        logger.log("Result " + result.getResult());
        return result;
    }

    @Override
    public int getResult() {
        return calc.getResult();
    }
}
