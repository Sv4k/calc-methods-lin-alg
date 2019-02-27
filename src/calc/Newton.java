package calc;

import func.Func;

public class Newton implements Method {
    Func equation;

    public Newton(Func f) {
        equation = f;
    }

    @Override
    public void calc(double a, double b) {
        double result = b;
        double previous;
        int counter = 0;
        equation.printInfo(toString());
        do {
            previous = result;
            result = previous - equation.calc(previous) / equation.calcDer(previous);

            while(result <= a | result >= b) {
                result = (result + previous) * 0.5;
            }

            equation.printInfo("Итерация: " + counter +  " Значение: " + result);
            counter++;
        } while(Math.abs(equation.calc(result)) > 1e-12);
    }

    @Override
    public String toString() {
        return "Метод Ньютона: ";
    }
}
