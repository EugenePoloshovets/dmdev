package payau.core.blockwit.lesson1;

import java.util.Random;

public class ListsEvaluation {

    public void evalMyList(MyIntArrayList array) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= random.nextInt(100); i++) {
            int x = random.nextInt(100) + 1;
            array.add(x);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time of creation: " + (endTime - startTime));
    }
}
