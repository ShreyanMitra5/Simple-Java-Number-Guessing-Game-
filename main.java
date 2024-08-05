// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value;
        
        do{
            System.out.println("Guess your number: ");
            value = scanner.nextInt();
            
            if (value > 25){
                System.out.println("Too High!\n");
            }
            else if (value < 25){
                System.out.println("Too Low!\n");
            } 
        }
        while (value != 25);
        
        
        
        
        System.out.println("You guessed the correct number!");
        
    }
}
