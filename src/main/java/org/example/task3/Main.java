package org.example.task3;


import java.util.ArrayList;
import java.util.List;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Main {
    public static void main(String[] args) {
    Books book1 = new Books("Евгений Онегин", "Пушкин", 268, 2022, 224);
    Books book2 = new Books("Евгений Онегин", "Пушкин", 500, 2004, 300);
    Books book3 = new Books("Герой нашего времени", "Лермонтов", 250, 2020, 240);
    Books book4 = new Books("Сборник стихов", "Ахматова", 320, 2018, 107);
    Books book5 = new Books("Повесть о Сонечке (сборник)", "Цветаева", 304, 2000, 97);

    List<Books> booksList = new ArrayList<>();
    booksList.add(book1);
    booksList.add(book2);
    booksList.add(book3);
    booksList.add(book4);
    booksList.add(book5);
    Byte k = 0;

    for (int i = 0; i < booksList.size(); i++) {
        Integer digit = booksList.get(i).getPages();
        String word = booksList.get(i).getAuthor().toLowerCase();
        if (((digit % 2 != 0) & (digit % 3 != 0) & (digit % 5 != 0) & (digit % 7 != 0)) &
        ((booksList.get(i).getYear() > 2009) & (booksList.get(i).getYear() < 2024)) & (word.indexOf('а') != -1)){
                k++;
                System.out.println(booksList.get(i).getName());
            }
    }

    if (k == 0) {System.out.println("Нет книги, удовлетворяющей условиям.");}

    }
}
