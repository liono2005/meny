package org.example;


import org.example.fere.AutorEntity;
import org.example.fere.PubleherEntity;

import java.awt.*;
import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
      int a=0;
        Book book = new Book();

         do {
             Menu.mainMenu();
             a= scanner.nextInt();

             switch (a){
                 case (1):System.out.println("1 Добавить книгу");
                     AutorEntity autor=new AutorEntity();

                    // PubleherEntity publeher=new PubleherEntity();
                     System.out.println("Название издательство");

                    // publeher.setPubleher(scanner.nextLine());
                     break;
                 case (2):System.out.println("2 УДАЛИТЬ");break;
                 case (3):System.out.println("3 Поиск");break;


             }
         }while (a !=5 );

    }
}