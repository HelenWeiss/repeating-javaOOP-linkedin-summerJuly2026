import java.awt.*; // for static Color attribute

public class Tree {

    protected static Color trunkColor = new Color(102, 51, 0);
    // attributes of the class
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0); // static Color attribute

    // constructor
    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    // behavior (method)
    public void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    // behavior (method)
    public static void announceTree() {              // static method
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }

    // behavior (method)
    void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
    }
}
