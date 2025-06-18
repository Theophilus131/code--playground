
	import java.util.Scanner;

public class SimpleMenstrualApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Menstrual App!");

        System.out.print("Enter the number of days since your last period started: ");
        int daysSinceLastPeriod = input.nextInt();

        System.out.print("Enter your average cycle length (e.g. 28): ");
        int cycleLength = input.nextInt();

        int daysUntilNextPeriod = cycleLength - daysSinceLastPeriod;
        int ovulationDay = cycleLength - 14;

        int fertileStart = ovulationDay - 5;
        int fertileEnd = ovulationDay + 1;

        System.out.println("\nYour menstrual predictions:");
        System.out.println("Next period in: " + daysUntilNextPeriod + " day(s)");
        System.out.println("Ovulation day is in: " + ovulationDay + " day(s)");
        System.out.println("Fertile window is between day " + fertileStart + " and day " + fertileEnd);
    }
}
