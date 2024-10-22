import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();

        if (amount < 50) {
            System.out.println("Enter amount Greater than or Equal to fifty");
            return;
        }

        if(amount % 50 != 0){
            System.out.println("Invalid amount ! please enter an amount in multiples of 50");
            return;
        }

        int[] denomination = { 2000, 500, 200, 100, 50 };
        int[] noteCounter = new int[denomination.length];

        for (int i = 0; i < denomination.length; i++) {
            if (amount >= denomination[i]) {
                noteCounter[i] = amount / denomination[i];
                // left amount
                amount = amount % denomination[i];
            }
        }

        // note counter values
        System.out.println("AMOUNTS");
        for (int i = 0; i < denomination.length; i++) {
            if (noteCounter[i] > 0) {
                System.out.println("Rs:" + denomination[i] + " " + noteCounter[i] + "Note");
            }
        }

        // if (amount > 0) {
        //     System.out.println("unable to deposite remaining amount that is " + amount + "rs");
        // }
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the amout");
    // int input = sc.nextInt();

    // int twok = 0;
    // int fivehun = 0;
    // int hund = 0;
    // int twohund = 0;
    // int fif = 0;

    // int totalNotesAvail = 5;
    // int curr [] = new int[]

    // if (input >= 2000) {
    // twok = input / 2000;
    // input = input % 2000; // rem
    // }

    // if (input >= 500) {
    // fivehun = input / 500;
    // input = input % 500;
    // }

    // if (input >= 200) {
    // twohund = input / 200;
    // input = input % 200;
    // }

    // if (input >= 100) {
    // hund = input / 100;
    // input = input % 100;
    // }

    // if (input >= 50) {
    // fif = input / 50;
    // input = input % 50;
    // }

    // System.out.println("amount:");
    // if (twok > 0) {
    // System.out.print("2000 ->" + twok + " ");
    // }
    // if (fivehun > 0) {
    // System.out.print("500 ->" + fivehun + " ");
    // }
    // if (twohund > 0) {
    // System.out.print("200 ->" + twohund + " ");
    // }
    // if (hund > 0) {
    // System.out.print("100 ->" + hund + " ");
    // }
    // if (fif > 0) {
    // System.out.println("50 ->" + fif + " ");
    // }

    // }

}
