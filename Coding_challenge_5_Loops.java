import java.util.Scanner;

class Coding_challenge_5_Loops {
    Scanner sc = new Scanner(System.in);

    void showHello(){
        String choice;

        System.out.println("For hello,type h ,anything else to stop:");
        choice = sc.next();
        while ("h".equals(choice)){
            System.out.println("Hello");
            choice = sc.next();
        }
    }

    public static void main(String[] args) {
        (new Coding_challenge_5_Loops()).showHello();
    }
}