package func;

import calc.Bisection;
import calc.Newton;
import calc.Relaxation;

import java.util.ArrayList;

public abstract class Func {
    public abstract double calc(double x);
    public abstract double calcDer(double x);
    public abstract ArrayList getBorders();
    public void findSolution() {
        Bisection bis = new Bisection(this);
        Relaxation rel = new Relaxation(this);
        Newton newt = new Newton(this);

        ArrayList<Double> solBorders = getBorders();
        for(int i = 0; i < solBorders.size(); i += 2) {
            double a = solBorders.get(i);
            double b = solBorders.get(i + 1);
            bis.calc(a, b);
            //rel.calc(a, b);
            newt.calc(a, b);
        }
    }
    public abstract void printInfo(String info);
    public abstract double getT(double a, double b);
}
