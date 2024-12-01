import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
       /* int[] numeros = new int[10]; // declarei o vetor como inteiro e atribui 10 indices a ele.
        //[0] [1] [2] [3]
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        for(int i = 0; i < numeros.length; i++){ // estrutura de repetição para imprimir os números do array
            System.out.println(numeros[i]);
        }*/

        /*String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";
        for(int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }*/

        /*String[] letras = {"A", "B", "C", "D", "E"}; // Não pereciso definir o tamanho do array
        for(int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        System.out.println(Arrays.toString(letras));*/


        // -------------------------------------------------------------------
        int[] numeros = {10, 30, 40, 50, 20};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            media =+ numeros[i]; // (=+) tema função de " somar e depois atribuir "
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numeros.length);
    }
}
