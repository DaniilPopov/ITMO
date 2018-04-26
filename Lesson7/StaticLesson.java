package Lesson7;

interface StaticIntarface {
    static void staticVoid() {
        System.out.println("staticVoid Interface");
    }
}

public class StaticLesson {
    public static void main(String[] args) {

        System.out.println(StaticExample.staticVar);
        StaticExample staticExample = new StaticExample();
        StaticExample staticExample1 = new StaticExample();
        StaticExample staticExample2 = new StaticExample();

        System.out.println(staticExample.getNotStaticVar());
        System.out.println(staticExample.getStaticVar());

        System.out.println(staticExample1.getNotStaticVar());
        System.out.println(staticExample1.getStaticVar());

        System.out.println(staticExample2.getNotStaticVar());
        System.out.println(staticExample2.getStaticVar());

        StaticExample.StaticVoid();

        StaticIntarface.staticVoid();
    }
}

class StaticExample implements StaticIntarface {
    static int staticVar = 0;
    int notStaticVar = 0;

    public StaticExample() {
        staticVar++;
        notStaticVar++;
    }

    static void StaticVoid() {

        System.out.println(staticVar);

    }

    public int getStaticVar() {
        return staticVar;
    }

    public int getNotStaticVar() {
        return notStaticVar;
    }
}

