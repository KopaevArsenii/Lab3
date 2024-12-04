import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {

    public static void main(String[] args) {
        int iterations = 100000;  // Количество операций для теста
        // Тестируем ArrayList
        System.out.println("Testing ArrayList:");
        testListPerformance(new ArrayList<>(), iterations);

        // Тестируем LinkedList
        System.out.println("\nTesting LinkedList:");
        testListPerformance(new LinkedList<>(), iterations);
    }

    private static void testListPerformance(List<Integer> list, int iterations) {
        // add() test
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("add() method - " + iterations + " operations: " + (endTime - startTime) + " nanoseconds");

        // get() test
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("get() method - " + iterations + " operations: " + (endTime - startTime) + " nanoseconds");

        // remove() test
        startTime = System.nanoTime();
        for (int i = iterations - 1; i >= 0; i--) {
            list.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("remove() method - " + iterations + " operations: " + (endTime - startTime) + " nanoseconds");
    }
}
