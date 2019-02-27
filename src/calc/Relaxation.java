package calc;

import func.Func;

public class Relaxation implements Method {
    Func equation;

    public Relaxation(Func eq) {
        equation = eq;
    }

    @Override
    public void calc(double a, double b) {
        double t = equation.getT(a, b);
        double result = a;
        int counter = 0;
        equation.printInfo(toString());
        do {
            result = result + t * equation.calc(result);
            equation.printInfo("Итерация: " + counter + " Значение: " + result);
            counter++;
        } while(equation.calc(result) < 1e-12);
    }

    @Override
    public String toString() {
        return "Метод релаксации: ";
    }

}
