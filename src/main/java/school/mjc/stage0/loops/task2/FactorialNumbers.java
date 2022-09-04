package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int fact = 1;
        int count = 1;
        while (fact <= printToInclusive) {
            fact *= count;
            System.out.println(fact);
            count++;
        }
    }
}
