public class LacosNumericos {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){ // Dentro do for eu faço a condição, i+=2 -> ele vai de 2 em 2.
            for(int j = 1; j <= 10; j++){
                System.out.println(j + "x" + i + " = " + j * i); // Tabuada de Multiplicação
                // 1x1 = 1
                // 1x2 = 2
                //
            }
        }
    }
}

// int i = 1 -> Iniciei a minha Var em 1
// i <= 10 -> Faço a comparação com o numero seguinte, se i(1) for menor que 10 eu executo o loop
// i++ -> (++) incremento
// toda vez que 1 for menor que 10, ele vai incrementar +1, ou seja, após as comparações, ele vai adicionando mais um numero.
