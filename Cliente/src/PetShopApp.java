import java.util.*;



public class PetShopApp {
    static Scanner sc = new Scanner(System.in);
    static List<Cliente> clientes = new ArrayList<>();
    static List<Pet> pets = new ArrayList<>();
    static List<Serviço> servicos = new ArrayList<>();

    public static void main(String[] args) {
        // Serviços pré-cadastrados
        servicos.add(new Serviço(40.0));
        servicos.add(new Serviço(50.0));

        int opcao;
        do {
            System.out.println("\n=== PetShop ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Pet");
            System.out.println("3. Cadstrar Serviços");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Listar Pets");
            System.out.println("6. Listar Serviços");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch(opcao) {
                case 1 -> cadastrarCliente();
                case 2 -> cadastrarPet();
                case 3 -> cadastrarServiço();
                case 4 -> listarClientes();
                case 5 -> listarPets();
                case 6 -> listarServicos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    private static void cadastrarServiço() {
        System.out.print("Tipo de Serviços: ");
        double preco = sc.nextDouble();

        servicos.add(new Serviço(preco));
        System.out.println("Serviço Cadastrado!");

    }

    private static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        clientes.add(new Cliente(nome, telefone, endereco));
        System.out.println("Cliente cadastrado!");
    }

    private static void cadastrarPet() {
        if(clientes.isEmpty()) {
            System.out.println("Cadastre primeiro um cliente!");
            return;
        }

        System.out.print("Nome do Pet: ");
        String nome = sc.nextLine();
        System.out.print("Espécie: ");
        String especie = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Selecione o dono:");
        for(int i=0; i<clientes.size(); i++) {
            System.out.println((i+1) + ". " + clientes.get(i).getNome());
        }
        int donoIndex = sc.nextInt()-1;
        sc.nextLine();

        pets.add(new Pet(nome, especie, idade, clientes.get(donoIndex)));
        System.out.println("Pet cadastrado!");
    }

    private static void listarClientes() {
        if(clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for(Cliente c : clientes) {
            System.out.println("- " + c.getNome() + " (" + c.getTelefone() + ")");
        }
    }

    private static void listarPets() {
        if(pets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }
        for(Pet p : pets) {
            System.out.println("- " + p.getNome() + " (" + p.getEspecie() + ") - Dono: " + p.getDono().getNome());
        }
    }

    private static void listarServicos() {
        for(Serviço s : servicos) {
            System.out.println("- " + s.getNome() + " R$ " + s.getPreco());


        }
    }
}