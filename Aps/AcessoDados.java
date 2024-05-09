package Aps;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class AcessoDados {
// CRIANDO UM METODO ESTATICO DE LEITURA DE ARQUIVO	
    public static List<Carro> loadCarros(String filePath){
//CRIANDO UMA ARRAYLIST
        List<Carro> Carros = new ArrayList<>();
//
        try (   InputStream is = new FileInputStream(filePath);
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
            ){
        	
            String linha;
           
            while((linha = br.readLine()) != null){


                String[] palavras = linha.split(",");
                int id = Integer.parseInt(palavras[0]);                                                 
                String nomedocarro = palavras[1];
                String modelo = palavras[2];
                int ano = Integer.parseInt(palavras[3]);
                double preco = Double.parseDouble(palavras[4]);

                Carro carro1 = new Carro(id,nomedocarro, modelo, ano, preco);
                Carros.add(carro1);

            }

        }catch(IOException e){
            e.printStackTrace();
        }

        return Carros;

    }

    public static void saveCarros(List<Carro> carros, String filePath){

        try(    OutputStream os = new FileOutputStream(filePath/*, true*/);
                OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                PrintWriter pw = new PrintWriter(osw, true);
                ){
            for(Carro carro: carros){
                pw.println(carro.getid()+","+carro.getNomedocarro()+","+carro.getModelo()+","+carro.getAno()+","+carro.getPreco());
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }


}

