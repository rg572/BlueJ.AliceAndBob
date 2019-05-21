/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        
        if(name.equals("Alice")){
            System.out.println("Hello Alice.");
        } else if(name.equals("Bob")){
            System.out.println("Hello Bob.");
        } else if(name.equalsIgnoreCase("Alice")){
            System.out.println("Proper capitalization is important, Alice.");
        } else if(name.equalsIgnoreCase("Bob")){
            System.out.println("Proper capitalization is important, Bob.");
        } else {
            System.out.println("You are not Alice and/or Bob.");
            System.out.println("Piss off, " + name + ".");
        }

    }
}
