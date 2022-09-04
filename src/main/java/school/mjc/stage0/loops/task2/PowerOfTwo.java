package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int counter = 0;
            while (counter <= power) {
                long helper = (long)Math.pow(2, counter);
                if (helper < 0) {
                    System.out.println("too much power");
                    break;
                } else {
                    System.out.println(helper);
                }
                counter++;
            }
        }
    }
}
