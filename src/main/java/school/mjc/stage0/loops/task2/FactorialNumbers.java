package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        int fact = 1;
        int count = 1;
        while (count <= printToInclusive) {
            fact *= count;
            System.out.println(fact);
            count++;
        }
    }
}
