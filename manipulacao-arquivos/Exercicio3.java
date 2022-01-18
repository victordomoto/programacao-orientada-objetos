import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;


public class Exercicio3 {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        int i = 0, quant = 0;
        String [] frase = new String[100];
        int [] posFrase = new int[100];
        //Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> mapaNomes = new HashMap<Integer, String>();


        System.out.println("Digite a quantidade de palavras: ");
        quant = entrada.nextInt();



        System.out.println("Digite cada palavra e seu respectivo contador: ");

        for(i=1; i<=quant; i++){
            frase[i] = entrada.next();
            posFrase[i] = entrada.nextInt();
            mapaNomes.put(posFrase[i], frase[i]);
        }
            //System.out.println(mapaNomes.get(posFrase[0]));

            try{
                FileOutputStream arquivo = new FileOutputStream("arquivo3.txt");
                PrintWriter pr = new PrintWriter(arquivo);

                for(i=1; i<=quant; i++){
                    pr.println(mapaNomes.get(i)+ " " + posFrase[i]);
                }
    
                pr.close();
                arquivo.close();
    
            }
            catch(Exception e){
                System.out.println("Erro");
            }
        

    }
}
