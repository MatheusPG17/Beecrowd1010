
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        //variaveis
        String linha, linha2;
        String[] lista, lista2;
        int A, B, A1, B1;
        double C, C1, VALOR;
        
        //entrada de dados lista1
        linha = leia.nextLine();
        lista = linha.split(" ");
        A = Integer.parseInt(lista[0]);
        B = Integer.parseInt(lista[1]);
        C = Double.parseDouble(lista[2]);
        //entrada de dados lista2
        linha2 = leia.nextLine();
        lista2 = linha2.split(" ");
        A1 = Integer.parseInt(lista2[0]);
        B1 = Integer.parseInt(lista2[1]);
        C1 = Double.parseDouble(lista2[2]);
        
        //processamento
        VALOR = B * C + B1 * C1;
        
        //saida de dados
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", VALOR);
        
    }
}
