import java.util.Scanner;
class Coding_challenge_4_Inputs {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge() {
        String name;
        int age;
        System.out.print("Enter your name: ");
        name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        age = scanner.nextInt();                

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    public static void main(String[] args) {
        (new Coding_challenge_4_Inputs()).readNameAndAge();
    }

}