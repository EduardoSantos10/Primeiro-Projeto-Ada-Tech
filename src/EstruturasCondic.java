public class EstruturasCondic {
    public static void main(String[] args) {
        int nota = 10;
        String avaliacao;

        // Condição do if-else
        /*if(nota >= 8){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Não Aprovado");
        }*/

        // Condição else-if

        // A-> 8, B->7, C->6 e D->0
        if(nota >= 8){
            avaliacao = "A";
        } else if (nota < 8 && nota >= 7) {
            avaliacao = "B";
        } else if (nota < 7 && nota >= 6) {
            avaliacao = "C";
        } else if (nota < 6 && nota >= 0) {
            avaliacao = "D";
        }else {
            avaliacao = "";
        }

        // Usando o Switch / Case
        switch (avaliacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
            break;

            case "C":
            case "D":
                System.out.println("Não Aprovado");
            break;
            default:
                System.out.println("Avaliação Inválida");
        }
    }
}
