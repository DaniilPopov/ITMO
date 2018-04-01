package Calculator;

public class Umn extends Operation {
    @Override
    protected int execute(int a, int b) {
        System.out.println("Umn execute = " + (a * b));
        return a * b;
    }
}
