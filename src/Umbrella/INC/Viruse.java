package Umbrella.INC;
import java.util.Scanner;

public class Viruse {
    public static void main(String[] args) {
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

        System.out.println("Today is " + tday + " day from first case");
        System.out.println("Todays infected: " + tinfected + " people");
        System.out.println("Infected rate per day from the beginning: " + infPercent + " people");
        System.out.println("Death rate is: " + deathPercent + " %");

        System.out.println("IF YOU WANT TO SEE STATISTIC PER SELECTED DAY TYPE '1' KEY OR '0' TO EXIT  ");
        byte S = in.nextByte();

        if (S == 1) {

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

                counter++;
            }
        }
        else {
            System.out.println("DON'T PANIC!");
        }

    }
}