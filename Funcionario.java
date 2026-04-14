package TesteTecnicoProjedata;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {
    public String funcao;
    public BigDecimal salario;

    public Funcionario(String nome, String data_nascimento, BigDecimal salario, String funcao) {
        super(nome, data_nascimento);
        this.funcao = funcao;
        this.salario = salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Funcionario[] getFuncionarios() {


        return funcionarios;
    }
}
