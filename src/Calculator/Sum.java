package Calculator;

public class Sum extends Operation {

    @Override
    protected int execute(int a, int b) {
        System.out.println("Sum execute = " + (a + b));
        return a + b;
    }
}
