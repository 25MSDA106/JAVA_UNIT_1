class LoopDemo {

    LoopDemo() {
    }

    public static void main(String[] args) {

        System.out.println("=== while loop demonstration ===");

        // while loop (using for loop's structure you provided)
        for (int i = 1; i <= 5; i++) {
            System.out.println("while loop count: " + i);
        }

        System.out.println("\n=== do–while loop demonstration ===");
        int j = 1;

        do {
            System.out.println("do–while loop count: " + j);
            j++;
        } while (j <= 5);

        System.out.println("\nExample: do–while executes once even when condition is false");
        int k = 6;

        do {
            System.out.println("This line executes once even though k = " + k);
            k++;
        } while (k <= 5);

        System.out.println("\n=== for loop demonstration ===");

        for (int m = 1; m <= 5; m++) {
            System.out.println("for loop count: " + m);
        }

        System.out.println("\nEven numbers from 1 to 10:");

        for (int n = 1; n <= 10; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        System.out.println("\n\nReverse counting from 5 to 1:");

        for (int p = 5; p >= 1; p--) {
            System.out.println(p);
        }

        System.out.println("\nPattern printing using nested for loop:");

        for (int r = 1; r <= 3; r++) {
            for (int c = 1; c <= 3; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
