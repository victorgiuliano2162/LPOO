package clinica;


public class Main {
    public static void main(String[] args) {

        Paciente p1 = new Paciente("Caio", "", "Gay", "11/10/00","HapVida", null, "AB-");

        System.out.println(p1.codigo);
        System.out.println(p1.nome);
        System.out.println(p1.sexo);
        System.out.println(p1.dataNascimento);
        System.out.println(p1.plano);
        System.out.println(p1.alergia);
        System.out.println(p1.tipoSanguineo);

        System.out.println("--------------------------");

        System.out.println(p1.toString());

    }
}
