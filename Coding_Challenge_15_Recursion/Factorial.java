public class Factorial{
    public static int factorial (int n){
        // Base Case
        if (n == 0 || n ==1){
            return 1;
        }else{
            //Recursive case: n * factorial(n-1)
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5); //calculates the factorial of 5
        System.out.println("Factorial: " + result);
    }
}