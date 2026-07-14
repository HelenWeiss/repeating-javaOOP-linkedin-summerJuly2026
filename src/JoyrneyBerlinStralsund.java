import java.util.Scanner;

// Subclass of a Superclass LovePassionWildFreedom

public class JoyrneyBerlinStralsund extends LovePassionWildFreedom{

    private String locationNew;

    // constructor
    public JoyrneyBerlinStralsund(String name, int age, String location, String locationNew) {
        super(name, age, location);
        this.locationNew = locationNew;
    }

    // getter
    public String getLocationNew() { return this.locationNew; }

    public void startYourTrip(){

        System.out.println("Please enter your new location");

        Scanner inputOfUser = new Scanner(System.in);
        String input = inputOfUser.nextLine();

        // to compare logic: input vs correctAnswer to find a logical mistake
        System.out.println(input);
        System.out.println(this.locationNew);
        System.out.println(input.toLowerCase());

        if (locationNew.equals(this.locationNew)) {
            System.out.println("Book finally tickets, pack your suitcase and enjoy the summer 2026");
        }
    }

}
