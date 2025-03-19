import java.util.*;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Carlos", 28, "Brasileiro", "Masculino"),
                new Pessoa("Ana", 24, "Brasileira", "Feminino"),
                new Pessoa("João", 30, "Brasileiro", "Masculino"),
                new Pessoa("Maria", 27, "Brasileira", "Feminino"),
                new Pessoa("Lucas", 25, "Brasileiro", "Masculino"),
                new Pessoa("Fernanda", 22, "Brasileira", "Feminino"),
                new Pessoa("Pedro", 29, "Brasileiro", "Masculino"),
                new Pessoa("Juliana", 31, "Brasileira", "Feminino")
        );

        List<Pessoa> homens = pessoas.stream()
                .filter(p -> p.sexo.equals("Masculino"))
                .collect(Collectors.toList());

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.sexo.equals("Feminino"))
                .collect(Collectors.toList());

        System.out.println("Lista de Homens:");
        homens.forEach(System.out::println);

        System.out.println("\nLista de Mulheres:");
        mulheres.forEach(System.out::println);
    }
}
