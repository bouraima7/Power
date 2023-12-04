public class Power {

    //Computes the value of base exponent
    //Recursive method public static int power ( int base, int exponent)
    // Using recursion to return the result
    //termination condition occurs when exponent is equal to 1

    public static int power(int base, int exponent) {
        // Base case: any number to the power of 1 is the number itself
        if (exponent == 1) {
            return base;
        } else {
            // Recursive case: base * base^(exponent-1)
            return base * power(base, exponent - 1);
        }
    }

}
