package calc;

import func.Func;

public class Bisection implements Method{
    private Func equation;

    public Bisection(Func eq) {
        equation = eq;
    }

    @Override
    public void calc (double a, double b) {
        double result;
        int counter = 0;
        equation.printInfo(toString());
        do {
            result = (a + b) * 0.5;
            if(equation.calc(result) * equation.calc(b) > 0) {
                b = result;
            }
            else {
                a = result;
            }
            equation.printInfo("Итерация: " + counter + " Значение: " + result);
            counter++;
        } while(Math.abs(equation.calc(result)) > 1.0E-12);
    }

    @Override
    public String toString() {
        return "Метод биссекций:";
    }
}
