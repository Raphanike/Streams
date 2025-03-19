import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class StreamsTest {

    @Test
    public void testListaDeMulheresContemApenasMulheres() {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Carlos", 28, "Brasileiro", "Masculino"),
                new Pessoa("Ana", 24, "Brasileira", "Feminino"),
                new Pessoa("João", 30, "Brasileiro", "Masculino"),
                new Pessoa("Maria", 27, "Brasileira", "Feminino"),
                new Pessoa("Lucas", 25, "Brasileiro", "Masculino"),
                new Pessoa("Fernanda", 22, "Brasileira", "Feminino"),
                new Pessoa("Pedro", 29, "Brasileiro", "Masculino"),
                new Pessoa("Juliana", 31, "Brasileira", "Feminino")
        );

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.sexo.equals("Feminino"))
                .toList();

        // Verificar se todas as pessoas na lista de mulheres têm o sexo feminino
        assertTrue(mulheres.stream().allMatch(p -> p.sexo.equals("Feminino")),
                "A lista de mulheres contém pessoas de outro sexo.");
    }
}
