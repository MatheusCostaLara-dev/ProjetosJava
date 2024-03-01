package exercicios;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //informações do funcionário

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeorDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //Tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false; // true

        //Tipo caractere
        char status = 'A'; //ativo

        //Dias de Empresa
        System.out.println(anosDeEmpresa * 365);

        //Número de Viagens
        System.out.println(numeorDeVoos/2);

        //pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id + "ganha -> " + salario);
        System.out.println("ferias -> ?" +estaDeFerias);
        System.out.println(status);
    }
}
