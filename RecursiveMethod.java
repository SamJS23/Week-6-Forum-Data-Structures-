public class RecursiveMethod
{

    static int find(int num) { //function to convert decimal to binary using recursive method
        if (num == 0) {
            return 0; //base case
        } else {

            return (num % 2 + 10 *
                    find(num / 2)); //general case
        }
    }


    public static void main(String[] args)
    {
        //initialize the inputs
        int num1 = 2; //first input
        int num2 = 13; //second input
        int num3 = 1023; //maximum input before producing incorrect output
        int num4 = 1024; //incorrect output as the result is out of the range of int
        System.out.println(find(num1));
        System.out.println(find(num2));
        System.out.println(find(num3));
        System.out.println(find(num4));
    }

}

