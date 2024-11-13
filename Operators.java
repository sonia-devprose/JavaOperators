

public class Operators {

    public static void main (String [] args)

    {
        /* Initialize two integer variables */
       int a = 10;
       int b = 3;
       int sum = a+b;
       int diff = a-b;
       int prod = a*b;
       int quot = a/b;
       // To convert int to float
       // float con_a = (float)a;
        //float con_b = (float)b;
      // float quot = con_a/con_b;
       int rem = a%b;

       // Arithmetic operations
        // Formatted strings - that's when we use printf
        System.out.printf("Arithmetic operators:%n");
        System.out.printf("a+b= %d%n", sum);
        System.out.printf("a-b= %d%n", diff);
        System.out.printf("a*b= %d%n", prod);
        // Case - when float datatype is used
       // System.out.printf("a/b= %.2f%n", quot);
        System.out.printf("a/b= %d%n", quot);
        System.out.printf("a%%b= %d%n", rem);



        // Relational Operators
        System.out.printf("Relational Operators: %n");
        System.out.printf("a == b: %b%n", (boolean)(a==b)); // Equality
        System.out.printf("a != b: %b%n" , (boolean)(a != b)); // Not equal
        System.out.printf("a > b: %b%n" , (boolean)(a > b));   // Greater than
        System.out.printf("a < b: %b%n" , (boolean)(a < b));   // Less than
        System.out.printf("a >= b: %b%n" , (boolean)(a >= b)); // Greater than or equal to
        System.out.printf("a <= b: %b%n" , (boolean)(a <= b)); // Less than or equal to

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.printf("Logical Operators: %n");
        System.out.printf("x AND y: %b%n", (x && y));
        System.out.printf("x OR y: %b%n", (x || y));
        System.out.printf("NOT x: %b%n", (!x));

        // Bitwise operators
        int c = 5; // bitwise it is 0101
        int d = 3; // bitwise it is 0011
        System.out.printf("c AND d: %d%n", (c&d));
        System.out.printf("c OR d: %d%n", (c|d));
        System.out.printf("c XOR d: %d%n", (c^d));
        System.out.printf("complement c: %d%n", (~c));
        System.out.printf("c << 1: %d%n", (c << 1));
        System.out.printf("c >> 1: %d%n", (c >> 1));
        System.out.printf("c >>> 1: %d%n", (c >>> 1));

        int g = 10;
        int h = 3;

        System.out.printf("g = h then, %d%n", (g = h));    // Assign b to a, then print a
        System.out.printf("g += h then, %d%n", (g += h));  // Add b to a, then print a
        System.out.printf("g -= h then, %d%n", (g -= h));  // Subtract b from a, then print a
        System.out.printf("g /= h then, %d%n", (g /= h));  // Divide a by b, then print a
        System.out.printf("g *= h then, %d%n", (g *= h));  // Multiply a by b, then print a
        System.out.printf("g %% h then, %d%n", (g %= h));  // Modulo operation, then print a

        // Ternary operator
       String result = (a>8) ? "Yes, the number is greater than 8" : "No, the number is less than or equal to 8";
        System.out.printf("Is the number greater than 8: %s%n", result);

        // Increment and decrement operators
        int f = 12;
        f++; //13
        System.out.printf("The current value of f: %d%n", f);
        f--; //12
        System.out.printf("The current value of f: %d%n", f);
        ++f; //13
        System.out.printf("The current value of f: %d%n", f);
        --f; // 12
        System.out.printf("The current value of f: %d%n", f);


    }
}
