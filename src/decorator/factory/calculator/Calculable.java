package decorator.factory.calculator;

public interface Calculable {
    Calculable sum(int arg);

    Calculable multi(int arg);

    int getResult();
}
