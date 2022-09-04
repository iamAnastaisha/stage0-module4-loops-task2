package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive >= 2) {
            System.out.println(2);
        }
        if (printToInclusive >= 3) {
            System.out.println(3);
        }
        int counter = 4;
        while (counter < printToInclusive) {
            boolean isPrimeNumber = true;
            int helper = counter - 1;
            while (helper > 1) {
                if (counter % helper == 0) {
                    isPrimeNumber = false;
                }
                helper--;
            }
            if (isPrimeNumber) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
