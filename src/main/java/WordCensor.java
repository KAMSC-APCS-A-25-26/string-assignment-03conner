import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String Censored, Words;
        System.out.println("Enter a word: ");
        Words = sc.nextLine();
        Censored = Words.replace("dang", "***") .replace("yikes", "***").replace("nuts", "***") .replace("oops", "***");



        System.out.println("Censored: " + Censored);



    }
}
