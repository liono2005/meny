package org.example;


import org.example.fere.AutorEntity;
import java.io.FileWriter;
import java.awt.print.Book;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=0;
        do {    Menu.mainMenu();
            a= scanner.nextInt();


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./text.txt", true));

            System.out.print("Введите год издания книги: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введите издательство: ");
            String publisher = scanner.nextLine();

            System.out.print("Введите автора: ");
            String author = scanner.nextLine();

            writer.write("Год издания: " + year + ", Издательство: " + publisher + ", Автор: " + author);
            writer.newLine();

            writer.close();
            System.out.println("Книга успешно добавлена в библиотеку");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
}while (a !=5 );
//
//      int a=0;
//
//
//         do {
//             Menu.mainMenu();
//             a= scanner.nextInt();
////             }
//         }while (a !=5 );
//
//    }
}}