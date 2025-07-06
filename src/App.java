import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        var name = scanner.next();

        System.out.println("Informe a sua idade: ");
        int age = scanner.nextInt();

        var isEmancipated = false;
        if (age >= 16 && age <= 17) {
            System.out.printf("Você é emancipado, %s! (s/n)\n", name);
            isEmancipated = scanner.next().equalsIgnoreCase("s");
        } else if(age <= 15){
            System.out.printf("Desculpe %s, você é muito jovem para dirigir.\n", name);
        }
        // Se a pessoa for emancipado ou tiver 18 anos ou mais, pergunta se é habilitado
        if (age >= 18 || isEmancipated) {
            System.out.println("Você é habilitado? (s/n)");
            var isHabilitated = scanner.next().equalsIgnoreCase("s");
            if (isHabilitated) {
                System.out.printf("Parabéns, %s! Você pode dirigir.\n", name);
            } else {
                System.out.printf("Desculpe, %s. Você não pode dirigir.\n", name);
            }
        }
        scanner.close();
    }
}
