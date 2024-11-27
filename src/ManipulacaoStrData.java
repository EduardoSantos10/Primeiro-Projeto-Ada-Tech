
import java.time.LocalDate; // importei o pacote localDate para utilixar função
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class ManipulacaoStrData {
    public static void main(String[] args) {
        String nome = "Eduardo";

        //ISO 8601
        LocalDate hoje = LocalDate.now(); // utilizo a função LOcalDate para conferir a data do dia que estou
        Locale brasil = new Locale("pt", "BR"); // coloco o tipo de tradução no meu texto e a localidade
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); // chamo a função
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now(); // Essa função me dá uma saudação, de acordo com a hora do dia, conforme seus parametros.
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Olá.";
        }

        // Nesse caso existe uma condição IF-ELSE, para atender.

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase()); // PrintF() -> formata e imprime string com valores sobstituidos
        // getDayOfWeek() -> verifico qual dia da semana que estou



        //<------------------------------------------------------------------------------------------------------------>

        /*System.out.println(nome.toUpperCase()); // Função que faz as letras do texto virar letras maiuculas
        System.out.println(nome.toLowerCase()); // Função que faz as letras serem minusculas
        System.out.println(nome.length()); // Função que consulta quantos caracteres tem a string

        String nomeDif = "Eduardo";
       // System.out.println(nome.equals(nomeDif)); // Função que compara as String do meu texto.

        // equals -> compara se uma string é igual a outra

        System.out.println(nome.equalsIgnoreCase(nomeDif)); // Função que ignora a sensibilidade de nome diferenciação de letra (Eduardo) = (eduardo)]

        // equalsIgnoreCase -> compara se há diferenciação nas letras*/
    }
}
