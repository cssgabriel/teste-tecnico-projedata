package TesteTecnicoProjedata;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {

        // 3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
        Funcionario[] funcionarios =  {
            new Funcionario("Maria", "18/10/2000", new BigDecimal("2009.44"), "Operador"),
            new Funcionario("João", "12/05/1990", new BigDecimal("2284.38"), "Operador"),
            new Funcionario("Caio", "02/05/1961", new BigDecimal("9836.14"), "Coordenador"),
            new Funcionario("Miguel", "14/10/1988", new BigDecimal("19119.88"), "Diretor"),
            new Funcionario("Alice", "05/01/1995", new BigDecimal("2234.68"), "Recepcionista"),
            new Funcionario("Heitor", "19/11/1999", new BigDecimal("1582.72"), "Operador"),
            new Funcionario("Arthur", "31/03/1993", new BigDecimal("4071.84"), "Contador"),
            new Funcionario("Laura", "08/07/1994", new BigDecimal("3017.45"), "Gerente"),
            new Funcionario("Heloísa", "24/05/2003", new BigDecimal("1606.85"), "Eletricista"),
            new Funcionario("Helena", "02/09/1996", new BigDecimal("2799.93"), "Gerente")
        };

        // 3.3 Imprimir todos os funcionários com todas suas informações
        // • informação de data deve ser exibido no formato dd/mm/aaaa;
        System.out.println("\n### Lista de funcionários completa ###\n");
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.print(funcionarios[i].nome + " | ");
            System.out.print(funcionarios[i].data_nascimento + " | ");
            System.out.print(funcionarios[i].salario + " | ");
            System.out.print(funcionarios[i].funcao + "\n");
        }

        // 3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].setSalario(funcionarios[i].salario.multiply(new BigDecimal("1.1")));
        }

        System.out.print("\n### Agrupados por função ###\n");

        // 3.6 – Imprimir os funcionários, agrupados por função.
        String[] funcoes = {
            "Operador",
            "Coordenador",
            "Eletricista",
            "Recepcionista",
            "Contador",
            "Gerente",
        };
        for (String func : funcoes) {
            System.out.println("> " + func + ":");
            for (Funcionario funcionario : funcionarios) {
                if (Objects.equals(funcionario.funcao, func)) System.out.print("- " + funcionario.nome + "\n");
            }
        }

        System.out.print("\n### Funcionários que fazem aniversário no mes 10 e 12 ###\n");

        // 3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
        Stream<Funcionario> mes10e12 = Arrays.stream(funcionarios).filter(funcionario -> funcionario.data_nascimento.contains("/10/") || funcionario.data_nascimento.contains("/12/"));
        mes10e12.forEach(funcionario -> System.out.println(funcionario.nome + ": " + funcionario.data_nascimento));
    }
}
