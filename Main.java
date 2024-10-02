import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your name: ");
        String userName = scan.nextLine();
        Letter someLetter = new Letter(userName);

        someLetter.writeLetter("sophie");
        someLetter.writeLetter("sophie2");
        someLetter.writeLetter("sophie3");
        someLetter.writeLetter("sophie4");

    }
 }
 