package org.example;

public class Book {
    private String title;
    private Author[] authors;
    private int year;

    // Конструктор
    public Book(String title, Author[] authors, int year) {
        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Название книги не может быть пустым.");
        }
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        if (authors != null && authors.length > 0) {
            this.authors = authors;
        } else {
            System.out.println("Книга должна иметь хотя бы одного автора.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Год издания должен быть положительным числом.");
        }
    }

    @Override
    public String toString() {
        StringBuilder authorsList = new StringBuilder();
        for (Author author : authors) {
            authorsList.append(author.toString()).append(", ");
        }
        authorsList.setLength(authorsList.length() - 2);

        return "Название книги: " + title + ", Авторы: " + authorsList + ", Год издания: " + year;
    }
}
