
public class IntervalWorkout extends Exercises {
    int repetition = 4;
    int pause = 30;

    public IntervalWorkout(String name, String description, int duration, String position, int repetition, int pause) {
        super(name, description, duration, position);
    }

    public void printWorkout() {
        System.out.println("\n***************************** ");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("*****************************");
        System.out.println("=============================");

        for(int i=1; i<=repetition; i++){
            System.out.println("ROUND " +i);

            System.out.println(name);

            System.out.println("=============================");
            System.out.println("DO THE BREAK (" +pause+ " SECONDS)");
            System.out.println("=============================");
        }

        System.out.println("*****************************");
        System.out.println("CONGRATS - YOU ARE DONE !!!");
        System.out.println("*****************************");
    }
}
