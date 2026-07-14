import java.io.IOException;


public class Main {

    public static void main (String [] args) throws IOException {     // only for Abstract class -> throws IOException

        // Practice: class Tree, enum TreeType (Classes and Objects, in the end Encapsulation)
/*
        Tree myFavoriteOakTreee = new Tree(25,5, TreeType.OAK);
        myFavoriteOakTreee.grow();
        //System.out.println(myFavoriteOakTreee.treeType); // to fix (now var is red) make "public" or delete "private" for double heightFt; double trunkDiameterInches; TreeType treeType;


        Tree myFavoriteOakTree = new Tree(120,12, TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(90,30, TreeType.MAPLE);

        //if (myFavoriteOakTree.heightFt > 100) { // to fix (now var is red) make "public" or delete "private" for double heightFt; double trunkDiameterInches; TreeType treeType;
        //    System.out.println("That's a tall " + myFavoriteOakTree.treeType + " tree!"); // to fix (now var is red) make "public" or delete "private" for double heightFt; double trunkDiameterInches; TreeType treeType;
        //}

        //if (myFavoriteMapleTree.heightFt > 100) { // to fix (now var is red) make "public" or delete "private" for double heightFt; double trunkDiameterInches; Tree
        //    System.out.println("That's a tall " + myFavoriteMapleTree.treeType + " tree!"); // to fix (now var is red) make "public" or delete "private" for double heightFt; double trunkDiameterInches; TreeType treeType;
        //}

        // optimized code upper with messaging "That's a tall tree" (class Main, rows 12-23)
        // via method announceTallTree in a class Tree (rows 21-24)
        //Tree myFavoriteOakTree = new Tree(120,12, TreeType.OAK);
        //Tree myFavoriteMapleTree = new Tree(90,30, TreeType.MAPLE);

        myFavoriteOakTree.announceTallTree();
        myFavoriteMapleTree.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR); // using static attribute from class Tree
        Tree.announceTree(); // using static method from class Tree

        // must be imported a built: import java.awt.Color;
        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue  = Color.BLUE;

        Color brightBlue = myDefaultBlue.brighter();

        // to fix (now var is red) make "public" or delete "private"
        // for double heightFt; double trunkDiameterInches; TreeType treeType;
        //System.out.println(myFavoriteMapleTree.treeType);
        //System.out.println(myFavoriteMapleTree.heightFT);
        //System.out.println(myFavoriteMapleTree.trunkDiameterInches);

        System.out.println(myFavoriteMapleTree.getTreeType());
        System.out.println(myFavoriteMapleTree.getHeightFT());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());

        //myFavoriteMapleTree.heightFt = 180; // heightFt is red cause it became private
        myFavoriteMapleTree.grow();
*/

        // Practice: class Employee (Classes and Objects)
/*
        // would be for creating Objects without constructor in class Employee
        //Employee employeeOne = new Employee();
        //Employee employeeTwo = new Employee();

        // for creating Objects with constructor in class Employee
        Employee employeeOne = new Employee("Matthias", 46, 5800, "Eschwege");
        Employee employeeTwo = new Employee("Mark", 49, 8900, "Altenstadt");

        employeeOne.raiseSalary();

        System.out.println("A salary of " + employeeOne.name + " is " + employeeOne.salary);
        System.out.println("A salary of " + employeeTwo.name + " is " + employeeTwo.salary);
*/

        // Practice: class BankAccount (Encapsulation)
/*
        BankAccount bankAccount = new BankAccount("Wonder Woman",1000);

        bankAccount.withdraw(500);
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
*/

        // Practice: super class EmployeeSuperClass, subclasses Salesperson ans Analyst (Inheritance)

        // Practice: to use built-in class in Java as superclass ArrayList, to create subclass ModArrayList
/*
        ModArrayList list = new ModArrayList();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.getUsingMod(1));
        System.out.println(list.getUsingMod(-2));
        System.out.println(list.getUsingMod(40));
 */

        // Practice: classes LovePassionWildFreedom and JoyrneyBerlinStralsund
        // (Encapsulation and Inheritance)
        // my own task with superclass LovePassionWildFreedom and childclass JoyrneyBerlinStralsund
/*
        LovePassionWildFreedom testK = new LovePassionWildFreedom("Ken", 52, "UK");
        String name = "Ken";
        int age = 52;
        String location = "UK";
        testK.makeYourChoice();

        JoyrneyBerlinStralsund testO = new JoyrneyBerlinStralsund("Helen", 39, "BSA",
                                                                  "Berlin -> Stralsund");
        String locationNew = "Berlin -> Stralsund";
        testO.startYourTrip();
*/

        // Practice: class OddArrayList (Polymorphism)
        // Writing reusable algorithms with runtime polymorphism
/*
        OddArrayList oddListy = new OddArrayList(1, 2, 3, 4, 7, 9, -13);

        System.out.println(oddListy);

        ArrayList<Integer> listy = new ArrayList<>();

        ModArrayList list = new ModArrayList();
        listy.add(1);
        listy.add(2);
        listy.add(3);
        listy.add(4);
        listy.add(7);
        listy.add(9);
        listy.add(-13);

        System.out.println(listy);
*/

        // Practice: class AddRandomNumber (Polymorphism)
        // Exploring different forms in a single object
        // works with UNcommented Practice: class OddArrayList (Polymorphism)
/*
        OddArrayList oddArrayList = new OddArrayList(7);
        oddListy.add(1);
        oddListy.add(2);
        AddRandomNumber.addRandomNumber(oddListy);
        System.out.println(oddListy.size());

        ArrayList<Integer> listyOdd = new ArrayList<>();
        listyOdd.add(1);
        listyOdd.add(2);
        AddRandomNumber.addRandomNumber(listyOdd);
        System.out.println(listyOdd.size());
*/

        // Practice: classes Contact and PhoneNumber (Polymorphism)
/*
        Contact contactOne = new Contact("Sally",
                new PhoneNumber("2637263737"));
        Contact contactTwo = new Contact("Maggie Smith",
                new PhoneNumber("9384713401"));
        Contact contactThree = new Contact("Roger Williams",
                new PhoneNumber("448474734929"));
        Contact contactFour = new Contact("David Jones",
                "david_jones@bluewire.com");
        Contact contactFive = new Contact("Sarah Brown",
                new PhoneNumber("2029384982"), "sarahb@tech.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);
*/

        // Practice: classes AbstractFileReader and DigitsOnlyFileReader, message.txt
        // (Abstraction)

        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());
    }
}
