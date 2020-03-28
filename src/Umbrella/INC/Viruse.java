package Umbrella.INC;
import java.util.Scanner;

public class Viruse {
    public static void main(String[] args)
            throws java.io.IOException  {
        long infected, death, tinfected, deathPercent;
        int counter, infPercent, tday;

        long people = 7772203580L;
        /*tinfected = 268065;
        tday = 110;
        death = 11187; */

        Scanner in = new Scanner(System.in);

        System.out.println("Write a day from the first infection: ");
        int intday = in.nextInt();
        if (intday <= 0) {
            System.out.println("Today can't be a day 'Zero' ");
        }

        tday = intday;

        System.out.println("Write a number of infected today: ");
        int intinfected = in.nextInt();
        if (intinfected <= 0) {
            System.out.println("Infected can't be less or equal to Zero ");
        }
        tinfected = intinfected;

        infPercent = (int) (tinfected / tday);

        System.out.println("Write a number of death today: ");
        int indeath = in.nextInt();
        if (indeath <= 0) {
            System.out.println("Death number can't be less or equal to Zero ");
        }

        death = indeath;

        deathPercent = (death * 100) / tinfected;

        System.out.printf("Today is %d day from first case \n", tday ); //just show that i knew about printf
        System.out.printf("Today infected: %d people \n", tinfected); // but i don't see for now that printf better than sout + tab
        System.out.printf("Infected rate per day from the beginning: %d people \n", infPercent);
        System.out.println("Death rate is: " + deathPercent + " %");
        System.out.println("   ");
        System.out.println("IF YOU WANT TO SEE STATISTIC PER SELECTED DAY TYPE 's' KEY OR 'ANY' TO EXIT  ");

        char letter;
        letter = (char) System.in.read(); //another input method but it's use only 1 sign from buffering

        if (letter == 's') {

            System.out.println("Write a day number to see statistics: ");
            int dstat = in.nextInt();

            counter = 1;
            for (infected = 1; infected <= people; infected = infected + infPercent) {
                death = (infected * deathPercent) / 100;
                tinfected = dstat * infPercent;
                long perpeople = ( (long) tinfected * 100) / people;
                if (dstat == counter) {
                    System.out.println("Day " + counter + " infected people " + tinfected + " " +
                            " this is " + perpeople + " % of all people " + "and death people " + death);
                }
               // if (infected == people) {
               //     System.out.println("All people will be infected in " + counter + " days!");
               // }

                counter++;
            }
        }
        else {
            System.out.println("DON'T PANIC!");

        }

    }
}