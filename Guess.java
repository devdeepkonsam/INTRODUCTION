package com.raptor.Projects;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Guessthenumber();

    }

    public static void Guessthenumber(){
        Scanner sc = new Scanner(System.in);
        int number =1+(int)(100*Math.random()),guess;
        int i=1;
        while (i<=5) {
            System.out.println("Please Enter A Number");
            guess = sc.nextInt();
            if (guess==number) {
                System.out.println("Congratulaiton You Have Guessed the Correct number ^_~");
                break;
            }
            else if(guess>number){
                System.out.println("Number is Lesser than "+guess);
            }
            else{
                System.out.println("Number is Higher than "+guess);
            }
            ++i;
        }
        sc.close();
        if (i>5) {
            System.out.println("You Have Exauhsted Your Trial\nPlease Try Again ");
        }
    }
    
}

