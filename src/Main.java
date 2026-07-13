import java.awt.Color;

public class Main {

    public static void main (String [] args) {
        Tree myFavoriteOakTreee = new Tree(25,5, TreeType.OAK);
        myFavoriteOakTreee.grow();
        System.out.println(myFavoriteOakTreee.treeType);

        /*
        Tree myFavoriteOakTree = new Tree(120,12, TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(90,30, TreeType.MAPLE);

        if (myFavoriteOakTree.heightFt > 100) {
            System.out.println("That's a tall " + myFavoriteOakTree.treeType + " tree!");
        }

        if (myFavoriteMapleTree.heightFt > 100) {
            System.out.println("That's a tall " + myFavoriteMapleTree.treeType + " tree!");
        }
*/
        // optimized code upper with messaging "That's a tall tree" (class Main, rows 8-19)
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

    }
}
