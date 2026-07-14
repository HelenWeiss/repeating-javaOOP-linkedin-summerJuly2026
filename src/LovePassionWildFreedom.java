import java.util.Scanner;

// Superclass (parent) for Subclass (child class) JoyrneyBerlinStralsund

public class LovePassionWildFreedom {

    private String name;
    private int age;
    private String location;
    private String song;
    private String frequency;

    // constructor
    LovePassionWildFreedom (String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.song = song;
        this.frequency = frequency;
    }

    // getters
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public String getLocation() { return this.location; }
    public String getSong() { return this.song; }
    public String getFrequency() { return this.frequency; }

    public void playSong() {
        System.out.println("oskar med k - Make Me Feel (Official Video)");
    }

    public void applyFrequency() {
        System.out.println("Repeat once per week;)");
    }

    public void makeYourChoice() {

        System.out.println("Please enter your name, age, location");

        Scanner inputOfUser = new Scanner(System.in);
        String input = inputOfUser.nextLine();

        // to compare logic: input vs correctAnswer to find a logical mistake
        System.out.println(input);
        System.out.println(this.name + this.age + this.location);
        System.out.println(input.toLowerCase());

        if ((name.equals(this.name)) &&
           (age == this.age) &&
           (location.equals(this.location))) {
           playSong();
           applyFrequency();
        }
    }
}
