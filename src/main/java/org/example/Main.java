package org.example;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {

        //Zadanie 1
        String userName = "Svetka Sokolova";
        String storeName = "Bely Lebed";
        int age = 30;
        double price = 99.99;
        int shubaNumber = 1;
        String location = "Horishni Plavni";
        String productName = "White shuba";


        System.out.println( "Dear "+ userName +"! Welcome to our store '" + storeName + "' in " + location + ". Our data indicates that today you turn " + age + " years old. " +
                "We offer you a special gift! With purchase on first " + productName + " above $" + price + ", you will get " + shubaNumber + " additional Black shuba for free");

        //Zadanie 2
        //Please, run each operation separately.
        //while running one operation rest tree should be commented

        int JanSalary = 10;
        int FebSalary = 5;

        // Summa
        int totalSalary = JanSalary + FebSalary;
        System.out.println(totalSalary);

        //subtraction
        int totalSalary = JanSalary - FebSalary;
        System.out.println(totalSalary);

        //multiplication
        int totalSalary = JanSalary * FebSalary;
        System.out.println(totalSalary);

        //division
        int totalSalary = JanSalary / FebSalary;
        System.out.println(totalSalary);


    }
}
