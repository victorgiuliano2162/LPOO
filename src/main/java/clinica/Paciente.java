package clinica;

import java.util.Scanner;

public class Paciente {

    String codigo;
    String nome;
    String sexo;
    String dataNascimento;
    String plano;
    String alergia;
    String tipoSanguineo;

    public Paciente(String nome, String codigo, String sexo, String dataNascimento, String plano, String alergia,
                    String tipoSanguineo) {
        this.nome = nome;
        this.codigo = codigo;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.plano = plano;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;

        if (alergia == null || alergia.isBlank()) {
            this.alergia = "nenhuma";
        }
    }

    @Override
    public String toString() {
        return codigo + "\n" + nome + "\n" + sexo + "\n" + dataNascimento + "\n" + plano + "\n" + alergia;
    }
}
