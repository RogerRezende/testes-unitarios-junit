package one.innovation.digital.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {
    @Test
    public void validarCalculoIdade() {
        Pessoa anakin = new Pessoa("Anakin", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(2, anakin.getIdade());
    }

    @Test
    public void validarCalculoIdadeIncorreto() {
        Pessoa leia = new Pessoa("Leia", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(3, leia.getIdade());
    }

    @Test
    public void deveRetornarMaiorDeIdade(){
        Pessoa luke = new Pessoa("Luke", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(luke.eMaiorDeIdade());
    }

    @Test
    public void deveRetornarMenorDeIdade(){
        Pessoa han = new Pessoa("Han", LocalDate.of(2021, 1, 1));
        Assertions.assertTrue(han.eMaiorDeIdade());
    }
}
