import java.io.*;
import java.util.Scanner;


public class Exercicio1 {
    public static void main(String [] args){
        int cont = 0, i = 0, tamanho = 0;
        try (Scanner entrada = new Scanner (System.in)) {
            String nomeArquivo;

            System.out.println("Digite o nome do arquivo: ");
            nomeArquivo = entrada.next();
   
            try{
                FileInputStream arquivo = new FileInputStream(nomeArquivo+".txt");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader  br =  new BufferedReader(input);

                String linha;
                do { 
                    linha = br.readLine();
                    tamanho = linha.length();

              
                        for(i=0; i < tamanho; i++){
                            if (linha.charAt(i)=='v'){
                                //System.out.println(linha.charAt(i));
                                cont++;
                            }
                        }
                    
                } while (linha!=null);
                br.close();
                 
            }
            catch(Exception e){
                System.out.println(cont);
            }
        }
    }
}
