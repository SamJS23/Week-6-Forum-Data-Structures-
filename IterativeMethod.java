public class IterativeMethod {
    // Method for converting a decimal number to binary using an iterative approach
    static void iterativeMethod(int decimalNumber) {
        // Initialize the binary number string as empty
        String binaryNumber = "";

        // Continue the loop until the decimal number is greater than 0
        while (decimalNumber > 0) {
            // Calculate the remainder by dividing the decimal number by 2
            int remainder = decimalNumber % 2;
            // Add the remainder to the beginning of the binary number string
            binaryNumber = remainder + binaryNumber;
            // Update the decimal number by dividing it by 2
            decimalNumber = decimalNumber / 2;
        }

        // Print the binary number to the console
        System.out.println(binaryNumber);
    }

    // Main method to test the iterativeMethod
    public static void main(String[] args) {
        // Test the function with decimal numbers: 10, 200, 1000, 1024, and 2000
        iterativeMethod(10);
        iterativeMethod(200);
        iterativeMethod(1000);
        iterativeMethod(1024);
        iterativeMethod(2147483647); //maximum input because of integer data type range
        iterativeMethod(2147483648); //Error
}
}
