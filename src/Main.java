import java.awt.Color;

public class Main {

    public static void main (String [] args) {

        // Practice: class Tree, enum TreeType
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
        Tree myFavoriteOakTree = new Tree(120,12, TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(90,30, TreeType.MAPLE);

        myFavoriteOakTree.announceTallTree();
        myFavoriteMapleTree.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR); // using static attribute from class Tree
        Tree.announceTree(); // using static method from class Tree

        // must be imported a built: import java.awt.Color;
        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue  = Color.BLUE;

        Color brightBlue = myDefaultBlue.brighter();

        //System.out.println(myFavoriteMapleTree.treeType); // to fix (now var is red) make "public" or delete "private" for double heightFt; double trunkDiameterInches; TreeType treeType;
        //System.out.println(myFavoriteMapleTree.heightFT); // to fix (now var is red) make "public" or delete "private" for double heightFt; double trunkDiameterInches; TreeType treeType;
        //System.out.println(myFavoriteMapleTree.trunkDiameterInches); // to fix (now var is red) make "public" or delete "private" for double heightFt; double trunkDiameterInches; TreeType treeType;
*/
        // Practice, class Employee
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

    }
}
