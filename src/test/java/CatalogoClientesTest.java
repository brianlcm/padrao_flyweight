import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatalogoClientesTest {

    @Test
    void deveRetornarAlunos() {
        CatalogoClientes catalogo = new CatalogoClientes();
        catalogo.cadastrar("Lewis Hamilton", "Nubank", "260");
        catalogo.cadastrar("George Russel", "Banco do Brasil", "001");
        catalogo.cadastrar("Sebastian Vettel", "Itaú", "341");

        List<String> saida = Arrays.asList(
                "Aluno{nome='Lewis Hamilton', banco='Nubank', codigo='260'}",
                "Aluno{nome='George Russel', banco='Banco do Brasil', codigo='001'}",
                "Aluno{nome='Sebastian Vettel', banco='Itaú', codigo='341'}");

        assertEquals(saida, catalogo.obterUsuarios());
    }

    @Test
    void deveRetornarTotalCidades() {
        CatalogoClientes catalogo = new CatalogoClientes();
        catalogo.cadastrar("Pierre Gasly", "Bradesco", "260");
        catalogo.cadastrar("Carlos Sainz", "Bradesco", "001");
        catalogo.cadastrar("Sebastian Vettel", "Itaú", "341");

        assertEquals(2, ContaBancariaFactory.getTotalContatos());
    }

}