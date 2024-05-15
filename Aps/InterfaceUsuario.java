package Aps;
import java.util.List;
import java.util.Scanner;


public class InterfaceUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = Acess.loadFuncionarios("file/Funcionarios.csv");
        List<Carro> carrosVendidos = AcessoDados.loadCarros("file/carros.csv");

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Pesquisar funcionário por ID");
            System.out.println("2. Registrar venda de carro");
            System.out.println("3. Listar carros vendidos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do funcionário: ");
                    int idFuncionario = scanner.nextInt();
                    pesquisarFuncionarioPorId(funcionarios, idFuncionario);
                    break;
                case 2:
                    System.out.print("Digite o ID do funcionário que vendeu o carro: ");
                    int idFuncionarioVenda = scanner.nextInt();
                    System.out.print("Digite o nome do carro vendido: ");
                    scanner.nextLine();  // Consume newline left-over
                    String nomeCarro = scanner.nextLine();
                    System.out.print("Digite o preço do carro vendido: ");
                    double precoCarro = scanner.nextDouble();
                    System.out.print("Digite o ano do carro vendido: ");
                    int anoCarro = scanner.nextInt();
                    carrosVendidos.add(new Carro(idFuncionarioVenda, nomeCarro, nomeCarro, anoCarro, precoCarro));
                    AcessoDados.saveCarros(carrosVendidos, "file/carros.csv");
                    System.out.println("Venda registrada com sucesso.");
                    break;
                case 3:
                    System.out.println("Carros vendidos:");
                    for (Carro carro : carrosVendidos) {
                        System.out.println(carro);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...\n até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }

    public static void pesquisarFuncionarioPorId(List<Funcionario> funcionarios, int id) {
        boolean encontrado = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getid() == id) {
                System.out.println("Funcionário encontrado:");
                System.out.println(funcionario);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }
    }
}
