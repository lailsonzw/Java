import java.util.Scanner;
import java.io.IOException;

public class calculator {
       
    public static int sum(int num1, int num2){
        return num1 + num2;
    }    
    
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }    
   
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }    
    
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao limpar a tela: " + e.getMessage());
        }
    }

    public static void menu(){
        System.out.println("MENU");
        System.out.println("1 - sum");
        System.out.println("2 - subtration");
        System.out.println("3 - division");
        System.out.println("4 - multiplication");
        System.out.println("5 - close");
        System.out.println("Type a option: ");
    }
    public static void main(String[] argumentos){
        //Iniciando as variaveis
        int num1 = 0, num2 = 0, option = 0;
        
        Scanner scanner = new Scanner(System.in);

        while(option != 5){
            menu();
            option = scanner.nextInt();
            scanner.nextLine();
            clearScreen();
            
            switch (option) {
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();
                    System.out.println("Digite o segundo numero: ");
                    num2 = scanner.nextInt();
                    clearScreen();
                    scanner.nextLine();

                    num1 = sum(num1, num2);
                    System.out.println(String.format("Resultado = %d", num1));
                    break;               
                
                case 2:
                   System.out.println("Digite o primeiro numero: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();
                    System.out.println("Digite o segundo numero: ");
                    num2 = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();

                    num1 = subtraction(num1, num2);   
                    System.out.println(String.format("Resultado = %d", num1));             
                    break;              
                
                case 3:
                   System.out.println("Digite o primeiro numero: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();
                    System.out.println("Digite o segundo numero: ");
                    num2 = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();

                    num1 = division(num1, num2); 
                    System.out.println(String.format("Resultado = %d", num1));  
                    break;               
                
                case 4:
                   System.out.println("Digite o primeiro numero: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();
                    System.out.println("Digite o segundo numero: ");
                    num2 = scanner.nextInt();
                    scanner.nextLine();
                    clearScreen();

                    num1 = multiplication(num1, num2);
                    System.out.println(String.format("Resultado = %d", num1));   
                    break;               
                
                
                case 5:
                    break;
            
                default:
                    System.out.println("opcao invalida");
                    break;
            }
        }
    }
}
    
