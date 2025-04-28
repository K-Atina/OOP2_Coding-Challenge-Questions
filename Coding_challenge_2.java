public class Coding_challenge_2 {
    void showInterest() {
        double amount;
        double interest; //percentage

        amount = 1200.00;
        System.out.println("amount: " + amount);

        interest = 3.0;
        amount = amount * (100 + interest) / 100;
        System.out.println("amount after interest: " + amount);

        amount = amount * (100 + interest) / 100;
        System.out.println("after 2 years: " + amount);
    } // Closing the showInterest method

    public static void main(String[] args) {
        (new Coding_challenge_2()).showInterest();
    }

}