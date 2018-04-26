package Lesson7;

public class InnerLesson {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerStatic innerStatic = new OuterClass.InnerStatic();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }
}

class OuterClass {

    private static int staticInt = 2;
    private int notstaticInt = 1;

    public OuterClass() {
        InnerStatic innerStatic = new InnerStatic();
        System.out.println(innerStatic.InnerInt);
        //innerStatic.someVoid();
        InnerClass innerClass = new InnerClass();
        innerClass.innerVoid();
    }

    public Object voidWirhClass() {

        class LocalClass {

            public void localVoid() {
                System.out.println(staticInt);
                System.out.println(notstaticInt);
            }

        }
        return new LocalClass();
    }

    static class InnerStatic {

        private int InnerInt = 1;


        public static void someVoid() {
            // имеет доступ только к статическим методам внешнего класса
            staticInt++;

        }

    }

    class InnerClass {
        public void innerVoid() {
            System.out.println(notstaticInt);
            System.out.println(staticInt);
        }

    }
}

class ChildOuther extends OuterClass {

    public void someChildVoid() {

        InnerStatic.someVoid();
    }
}
