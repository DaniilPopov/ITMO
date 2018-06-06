package Library;


public class Book {
    public String author;
    public String title;
    public int pagesNum;
    int kolvo;

    public Book(String author, String title, int pagesNum) {
        this.author = author;
        this.title = title;
        this.pagesNum = pagesNum;
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