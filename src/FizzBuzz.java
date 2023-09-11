/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while(i < 100) { //i starts at one, increases by 1 until it reaches 100

            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0; //sees if i divisible by 3
        boolean divisibleBy5 = i % 5 == 0; //sees if i divisible by 5

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { //&& means and

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) { //elif branch

            System.out.println("Fizz");

        } else if (divisibleBy5) { //elif branch

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }

        // increment by 1
        i += 1;
        return i;
    }
}
