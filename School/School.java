package School;

import java.io.IOException;

public class School {
    public static void main(String[] args) throws IOException {

        Teacher teacher = new Teacher();
        Classs classs = new Classs();
        String s = classs.getClasss();
        String s1 = teacher.getName();
        System.out.println("Классный руководитель " + s + " класса: " + s1);

        Students students = new Students();
        students.getName();
        System.out.println("У преподователя " + s1 + " " + students.getCount() + " студентов " + "\n" + "Все они в " + s + " классе");


    }
}
