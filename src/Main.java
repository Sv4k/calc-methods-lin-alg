import func.FirstEquation;
import func.SecondEquation;
import func.ThirdEquation;

public class Main {
    public static void main(String[] args) {
        FirstEquation first = new FirstEquation();
        SecondEquation second = new SecondEquation();
        ThirdEquation third = new ThirdEquation();

        first.findSolution();
        second.findSolution();
        third.findSolution();
    }
}
