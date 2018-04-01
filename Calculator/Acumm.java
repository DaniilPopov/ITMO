package Calculator;

public class Acumm {
    private int value;
    private Operation operation;

    public Acumm(Operation operation, int value) {
        this.operation = operation;
        this.value = value;
    }

    public static void main(String[] args) {
        Acumm acc = new Acumm(new Sum(), 3);
        System.out.println(acc.getValue());
        acc.accum(5);
        Acumm acc2 = new Acumm(new Del(), 6);
        System.out.println(acc2.getValue());
        acc2.accum(3);
        Acumm acc3 = new Acumm(new Umn(), 10);
        System.out.println(acc3.getValue());
        acc3.accum(9);

    }

    protected void accum(int someInt) {
        this.value = this.operation.execute(this.value, someInt);
    }

    public int getValue() {
        return this.value;
    }
}
