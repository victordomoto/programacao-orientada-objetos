import java.io.*;

public class Escritor {
    public void ler () throws IOException{
        InputStream is = getClass().getResourceAsStream("/Documents/testepoo.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String linha;

        while ((linha = br.readLine())!=null){
            System.out.println(linha);
        }
        br.close();
    } 

    public static void main(String [] args) throws IOException{
        try{
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println("Linha1Coluna1; linha1Coluna2; linha1Coluna3");
            pr.println("Linha2Coluna2; linha2Coluna2; linha2Coluna3");
            pr.println("Linha3Coluna2; linha3Coluna2; linha3Coluna3");

            pr.close();
            arquivo.close();

        }
        catch(Exception e){
            System.out.println("Erro");
        }
    }
}