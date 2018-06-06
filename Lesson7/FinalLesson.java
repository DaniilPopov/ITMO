package Lesson7;

public class FinalLesson {

    public static void main(String[] args) {

    }
}

class FinalExample {
    final int finalVar = 9;
    int someInt;

    final void finalVoid() {

        System.out.println("finalVoid");
    }

    public void someVoid(final int a) {
        if (a == 9) {
            this.someInt = a;
        }
        final int localVar = 0;
    }
}



