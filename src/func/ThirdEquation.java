package func;

import out.FileOutput;

import java.util.ArrayList;

public class ThirdEquation extends Func{
    private FileOutput out = new FileOutput("eq3_output.txt");

    @Override
    public double calc(double x) {
        return Math.exp(x) - 1.59 * x - 0.945;
    }

    @Override
    public double calcDer(double x) {
        return Math.exp(x) - 1.59;
    }

    @Override
    public ArrayList getBorders() {
        ArrayList<Double> borders = new ArrayList<>();

        borders.add(0.0);
        borders.add(0.45);

        borders.add(0.45);
        borders.add(1.0);

        return borders;
    }

    @Override
    public void printInfo(String info) {
        out.print(info);
    }

    @Override
    public double getT(double a, double b) {
        if(a == 0.0)
            return -3.2695765898;
        else
            return 1.8073475682;
    }
}
