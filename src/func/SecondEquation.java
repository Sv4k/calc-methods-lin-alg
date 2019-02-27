package func;


import out.FileOutput;

import java.util.ArrayList;

public class SecondEquation extends Func{
    private FileOutput out = new FileOutput("eq2_output.txt");

    @Override
    public double calc(double x) {
        return Math.pow(x, 3) - 1.44 * Math.pow(x, 2) + 0.6203 * x - 0.07866;
    }

    @Override
    public double calcDer(double x) {
        return 3 * Math.pow(x, 2) - 1.44 * 2 * x + 0.6203;
    }

    @Override
    public ArrayList getBorders() {
        ArrayList<Double> borders = new ArrayList<>();

        borders.add(0.0);
        borders.add(0.3);

        borders.add(0.3);
        borders.add(0.48);

        borders.add(0.48);
        borders.add(1.0);

        return borders;
    }

    @Override
    public  void printInfo(String info) {
        out.print(info);
    }

    @Override
    public double getT(double a, double b) {
        if(a == 0.0)
            return 3.0945381402;
        if(a == 0.3)
            return -44.8430493274;
        else
            return 2.9890898221;
    }
}
