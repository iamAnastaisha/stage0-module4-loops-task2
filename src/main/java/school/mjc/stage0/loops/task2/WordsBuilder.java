package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String result = "";
        int count = 0;
        while (count < chars.length) {
            result += chars[count];
            System.out.println(result);
            count++;
        }
    }
}
