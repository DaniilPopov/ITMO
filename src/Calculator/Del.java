package Calculator;

public class Del extends Operation {

    @Override
    protected int execute(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Делить на ноль нельзя!");
        } else System.out.println("Del execute = " + (a / b));
        return a / b;
    }
}
