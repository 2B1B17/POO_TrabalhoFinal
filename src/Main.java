package ui;

import model.Artista;
import model.ArtistaNacional;
import model.ArtistaInternacional;
import service.Festival;
import service.OrcamentoInsuficienteException;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double orcamento = 1000.00;
        Festival festival = new Festival(orcamento);

        List<Artista> todosArtistas = ui.ArtistaLoader.carregarArtistas();

        System.out.println("Bem-vindo ao Simulador de Festival!");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Selecionar artistas");
            System.out.println("2. Filtrar artistas");
            System.out.println("3. Mostrar lineup");
            System.out.println("4. Apresentar shows");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    selecionarArtistas(scanner, festival, todosArtistas);
                    break;
                case 2:
                    filtrarArtistas(scanner, todosArtistas);
                    break;
                case 3:
                    festival.mostrarFestival();
                    service.ArtistaWriter.escreverLineup(festival.getArtistas());
                    System.out.println("\nLineup do Festival:");
                    service.ArtistaWriter.lerLineup();
                    break;
                case 4:
                    festival.apresentarShows();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    // Método para selecionar artistas e escolher o dia de apresentação
    // Método para selecionar artistas e escolher o dia de apresentação
    private static void selecionarArtistas(Scanner scanner, Festival festival, List<Artista> todosArtistas) {
        Map<Artista, String> diasSelecionados = new HashMap<>();

        System.out.println("\nSelecione os artistas a serem adicionados ao festival:");

        for (int i = 0; i < todosArtistas.size(); i++) {
            Artista artista = todosArtistas.get(i);
            System.out.println((i + 1) + ". " + artista.getNome() + " - Cache: R$ " + artista.getCache());
        }

        System.out.println("Digite o número dos artistas que você deseja selecionar (separados por vírgula, exemplo: 1, 3, 5):");
        String escolha = scanner.nextLine();
        String[] indices = escolha.split(",");

        try {
            for (String indice : indices) {
                int index = Integer.parseInt(indice.trim()) - 1;
                if (index >= 0 && index < todosArtistas.size()) {
                    Artista artista = todosArtistas.get(index);
                    System.out.println("Você selecionou o artista: " + artista.getNome() + " - Cache: R$ " + artista.getCache());

                    // Escolher o dia
                    System.out.println("Escolha o dia de apresentação (1. Sexta, 2. Sábado, 3. Domingo): ");
                    int dia = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    String diaEscolhido = escolherDia(dia);

                    // Adicionar ao festival
                    festival.adicionarArtista(artista);
                    diasSelecionados.put(artista, diaEscolhido);
                    System.out.println(artista.getNome() + " foi adicionado ao festival para o dia " + diaEscolhido);
                } else {
                    System.out.println("Índice inválido para o artista.");
                }
            }
        } catch (OrcamentoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }



    private static void filtrarArtistas(Scanner scanner, List<Artista> todosArtistas) {
        System.out.println("\nEscolha um filtro:");
        System.out.println("1. Filtrar por gênero");
        System.out.println("2. Filtrar por cache");

        int filtro = scanner.nextInt();
        scanner.nextLine();

        switch (filtro) {
            case 1:
                System.out.println("Digite o gênero para filtrar (exemplo: RAP, MPB, Pop, Samba): ");
                String genero = scanner.nextLine();
                todosArtistas.stream()
                        .filter(artista -> artista.getGenero().equalsIgnoreCase(genero))
                        .forEach(artista -> System.out.println(artista.getNome() + " - Cache: R$ " + artista.getCache()));
                break;
            case 2:
                System.out.println("Digite o valor mínimo de cache para filtrar: ");
                double cacheMinimo = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer
                todosArtistas.stream()
                        .filter(artista -> artista.getCache() >= cacheMinimo)
                        .forEach(artista -> System.out.println(artista.getNome() + " - Cache: R$ " + artista.getCache()));
                break;
            default:
                System.out.println("Opção de filtro inválida.");
        }
    }

    private static String escolherDia(int dia) {
        switch (dia) {
            case 1:
                return "Sexta";
            case 2:
                return "Sábado";
            case 3:
                return "Domingo";
            default:
                return "Dia inválido";
        }
    }
}
