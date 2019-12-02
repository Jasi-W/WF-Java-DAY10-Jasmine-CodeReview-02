public class Exercises {
    String name;
    String description;
    int duration;
    String position;

    public Exercises(String name, String description, int duration, String position){
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public void printExercises(){
        System.out.println("\n" +name+ "\t\tDURATION: " +duration);
        System.out.println("--------------------------------------------");
        System.out.println("Description " +description);
    }
}
