public class p13powerfun {

        // Power function without using built-in methods
        public static double power(double base, int exponent) {
            // If the exponent is zero, return 1
            if (exponent == 0) {
                return 1;
            }
    
            // Handle negative exponents by converting them to positive
            // and using reciprocal later
            int positiveExponent = exponent;
            if (exponent < 0) {
                positiveExponent = -exponent; // Convert negative to positive (unary minus)
            }
    
            // Calculate the power for the positive exponent
            double result = 1;
            for (int i = 0; i < positiveExponent; i++) {
                result *= base;
            }
    
            // If the exponent was negative, return the reciprocal
            if (exponent < 0) {
                result = 1 / result;
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            // Test cases
            System.out.println(power(2, 3));   // Output: 8.0
            System.out.println(power(2, -3));  // Output: 0.125
            System.out.println(power(5, 0));   // Output: 1.0
            System.out.println(power(-2, 3));  // Output: -8.0
            System.out.println(power(-2, -3)); // Output: -0.125
        }
    }
    

