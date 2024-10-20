package org.example;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");
        Author author3 = new Author("Александр", "Пушкин");
        Author author4 = new Author("Антон", "Чехов");
        Author author5 = new Author("Иван", "Тургенев");
        Author[] authorsForBook1 = {author1};
        Author[] authorsForBook2 = {author2};
        Author[] authorsForBook3 = {author3};
        Author[] authorsForBook4 = {author4, author1};
        Author[] authorsForBook5 = {author5};
        Book book1 = new Book("Война и мир", authorsForBook1, 1869);
        Book book2 = new Book("Преступление и наказание", authorsForBook2, 1866);
        Book book3 = new Book("Евгений Онегин", authorsForBook3, 1833);
        Book book4 = new Book("Человек в футляре", authorsForBook4, 1898);
        Book book5 = new Book("Отцы и дети", authorsForBook5, 1862);
        Book[] books = {book1, book2, book3, book4, book5};
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
