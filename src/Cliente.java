import java.util.Scanner;
public class Cliente {
    Scanner scan = new Scanner(System.in);
    String nome;
    int idade;
    String cpf;
    String senha;
    public void criarCliente() {
        System.out.println("Nome do Cliente: ");
        nome = scan.nextLine();

        System.out.println("Senha Cliente: ");
        senha = scan.nextLine();

        System.out.println("CPF Cliente: ");
        cpf = scan.nextLine();

        System.out.println("Idade do Cliente: ");
        idade = scan.nextInt();

        System.out.println("Confirmando seus dados:");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Idade do Cliente: " + idade);
        System.out.println("cpf Cliente: " + cpf);
        System.out.println("Senha Cliente: " + senha);
    }
}
