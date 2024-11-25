public class OperadorecoesBooleanas {
    public static void main(String[] args) {
    boolean tvLigada = true;
    boolean gameLigado = true;

    // ultilização do && -> como operador logico
    boolean vamosJogarGame = tvLigada && gameLigado; // usei um "&&" para avaliar as duas condições que irá ver se eu posso jogar videogame

        System.out.println(vamosJogarGame);


        // Operador Ternário

        // A var gameLigado tem o valor de true, pois o resultado será true (O game está ligado).
        String anuncio = gameLigado ? "O game está ligado" : "O game não está ligado";
        System.out.println(anuncio);
    }
}

    // Tabela Verdade

    // Operador && (AND)
    // true && true = true;
    // true && false = false;
    // false && true = false;
    // false && false = false;

    // Operador || (OR)
    // true || true = true
    // true || false = true
    // false || true = true
    // false || false = false



