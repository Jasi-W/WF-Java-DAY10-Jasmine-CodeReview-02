import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Exercises exercise1 = new Exercises("Push-ups", "Place your hands on the floor. \nRaise up onto your toes so that all of your body weight is on your hands and your feet. \nBend your elbows and lower your chest down toward the floor. \nThen, push off the floor and extend them so that you return to starting position.", 30, "floor");
        Exercises exercise2 = new Exercises("Planks", "Start on the floor on your hands and knees. \nLower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. \nMaintain a straight line from heels through the top of your head, looking down at the floor. \nNow, tighten your abs and hold.", 90, "floor");
        Exercises exercise3 = new Exercises("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. \nExtend arms out straight so they are parallel with the ground, palms facing down.  \nGoto a squat and exhale, then explode back up to standing, driving through heels.", 45, "standup");
        Exercises exercise4 = new Exercises("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. \nYour back is straight. Lift your leg up, and straighten it. \nForm a 90 degree angle in the ankle. \nRaise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. \nReturn to the starting position and repeat.", 60, "floor");
        Exercises exercise5 = new Exercises("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. \nStay for 15 seconds, then repeat with your other leg.", 90, "standup");
        Exercises exercise6 = new Exercises("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. \nRepeat with other hand.", 60, "standup");

        ArrayList<Exercises> arrExercises = new ArrayList<Exercises>();
        arrExercises.add(exercise1);
        arrExercises.add(exercise2);
        arrExercises.add(exercise3);
        arrExercises.add(exercise4);
        arrExercises.add(exercise5);
        arrExercises.add(exercise6);

        ArrayList<IntervalWorkout> arrWorkout = new ArrayList<IntervalWorkout>();
        //arrWorkout.add();
        //arrWorkout.add();
        //arrWorkout.add();

        int input = -1;

        while(input != 0){
            System.out.println("\nMENU");
            System.out.println("1 - All Exercises");
            System.out.println("2 - All floor Exercises");
            System.out.println("3 - Floor Exercises > 1 minute");
            System.out.println("4 - Workout");
            System.out.println("0 - Exit");

            System.out.print("YOUR CHOISE: ");
            input = scan.nextInt();

            switch(input){
                case 0: System.out.println("Goodbye!"); continue;
                case 1: printExercises(arrExercises); break;
                case 2: printExercisesFloor(arrExercises); break;
                case 3: printExercisesFloorLong(arrExercises); break;
                case 4: printWorkouts(arrWorkout); break;
                default: break;
            }
        }
    }

    public static void printExercises(ArrayList<Exercises> arrExercises){
        for(Exercises e: arrExercises){
            e.printExercises();
        }
    }

    public static void printExercisesFloor(ArrayList<Exercises> arrExercises){
        for(Exercises e: arrExercises){
            if(e.position == "floor"){
                e.printExercises();
            }
        }
    }

    public static void printExercisesFloorLong(ArrayList<Exercises> arrExercises){
        for(Exercises e: arrExercises){
            if((e.position == "floor") && (e.duration > 60)) {
                e.printExercises();
            }
        }
    }

    public static void printWorkouts(ArrayList<IntervalWorkout> arrWorkout){
        for(IntervalWorkout w: arrWorkout){
            w.printWorkout();
        }
    }
}
