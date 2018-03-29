package Library;


public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book books = new Book("someAuthor", "someTitle", 90);
        Book books1 = new Book("someAuthor1", "someTitle1", 80);
        Book books2 = new Book("someAuthor2", "someTitle2", 70);
        library.put(books, 20);
        library.get(books, 5);
        library.put(books1, 30);
        library.get(books1, 40);
        library.put(books2, 40);
        library.get(books2, 1);
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