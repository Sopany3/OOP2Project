import java.util.*;

public class App{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Damn dawg, welcome to Rock Paper Scissors.");

        for (int i = 10; i <= 100; i+=10){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.print(" " + i + "%");
        }

        System.out.println("\nGame Ready!");

        System.out.println("\n-----------System------------");
        System.out.print("Choose your Character:\n[0]Seth\n[1]Seraph\n[2]Aurelius\n[3]Agnis\n[4]Verlierer\n[5]Fvyina\nChoose: ");
        int chooseCharacter = scanner.nextInt();
        scanner.nextLine();


    }
}