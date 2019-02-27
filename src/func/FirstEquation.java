package func;

import out.FileOutput;

import java.util.ArrayList;

public class FirstEquation extends Func{
    private FileOutput out = new FileOutput("eq1_output.txt");

    @Override
    public double calc(double x) {
        return (Math.cos(x) - x);
    }

    @Override
    public double calcDer(double x) {
        return -Math.sin(x) - 1;
    }

    @Override
    public ArrayList getBorders() {
        ArrayList<Double> borders = new ArrayList<>();
        borders.add(0.0);
        borders.add(1.0);
        return borders;
    }

    @Override
    public void printInfo(String info) {
        out.print(info);
    }

    @Override
    public double getT(double a, double b) {
        return 0.7039774727;
    }
}
