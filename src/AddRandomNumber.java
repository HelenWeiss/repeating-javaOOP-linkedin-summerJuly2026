import java.util.ArrayList;
import java.util.Random;

public class AddRandomNumber {

    public static void addRandomNumber(ArrayList<Integer> list) {
        int originalSize = list.size();
        Random random = new Random();
        while (originalSize + 1 != list.size()) {
            int n = random.nextInt() % 1000;
            list.add(n);
        }
    }
}
