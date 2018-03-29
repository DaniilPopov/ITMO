package Library;


public class Library {
    int a = 0;

    public int get(Book book, int quantity) {
        if (a > 0 && quantity <= book.kolvo) {
            a -= quantity;
            book.kolvo -= quantity;
            System.out.println("Данной книги осталось " + book.kolvo + " штук");
        } else System.out.println("Столько книг нет");
        return quantity;
    }

    public void put(Book book, int quantity) {
        if (a <= 50 && quantity <= 50) {
            a += quantity;
            book.kolvo += quantity;
            System.out.println("Данная кника в количестве  " + book.kolvo + " штук");
        } else System.out.println("Места в библиотеке нет");

    }

}

/*
Сделать библиотеку, которая ведет учет книг. Должно быть как минимум два класса: Book и Library.
Library имеет два метода: void put(Book book, int quantity) и int get(Book book, int quantity).
Каждой книге в библиотеке соответствует счетчик, показывающий количество хранящихся книг, при добавлении книги -
счетчик увеличивается, при извлечении - уменьшается на число quantity.
Поля класса Book: author, title, pagesNum.
Библиотека хранит ограниченное число книг, сколько - на ваше усмотрение.
 */