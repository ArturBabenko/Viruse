package Umbrella.INC;

public class Viruse {
    public static void main(String[] args) {
        long infected, death, tinfected, deathPercent;
        int counter, tday, infPercent;

        long people = 7772203580L;
        tinfected = 268065;
        tday = 110;
        death = 11187;

        infPercent = 268065 / 110;

        deathPercent = death*100/tinfected;

        System.out.println("Today is " + tday + " day from first case");
        System.out.println("Todays infected: " + tinfected + " people");
        System.out.println("Infected rate per day: " + infPercent + " people");
        System.out.println("Death rate is: " + deathPercent + " %");

    /*     counter = 1;
         for (infected = 1; infected <= 40000000; infected = infected + infPercent){
             death = (infected * deathPercent) / 100;
             System.out.println("Day " + counter + " infected people " + infected + " and death people " + death);
             counter++;
         }
 */




    }
}
