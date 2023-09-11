public class Multiples {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 1; i < 1000; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                counter += 1;
            } else if (divisibleBy3) {
                counter += 1;
            } else if (divisibleBy5) {
                counter += 1;
            }
        }

        System.out.println(counter + " numbers are multiples of 3 or 5.");

    }
}
