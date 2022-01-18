import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;


public class Exercicio2 {
    public static void copyFile(File sourceFile, File destFile) throws IOException {
        if(!destFile.exists()) {
            destFile.createNewFile();
        }
    
        FileChannel source = null;
        FileChannel destination = null;
    
        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        }
        finally {
            if(source != null) {
                source.close();
            }
            if(destination != null) {
                destination.close();
            }
        }
    }
    public static void main(String [] args){
        int cont = 0, i = 0, tamanho = 0;
        try (Scanner entrada = new Scanner (System.in)) {
            String nomeArquivo1, nomeArquivo2;

            System.out.println("Digite os nomes dos arquivos: ");
            nomeArquivo1 = entrada.next();
            nomeArquivo2 = entrada.next();
            Exercicio2 Ex2 = new Exercicio2();

            try{
                File arquivo1 = new File(nomeArquivo1+".txt");
                File arquivo2 = new File(nomeArquivo2+".txt");
                Ex2.copyFile(arquivo1, arquivo2);
                System.out.println("Arquivo copiado com sucesso");
        }
        catch(Exception e){
            System.out.println("Erro, arquivo nao encontrado!");
        }
    }
}
}
