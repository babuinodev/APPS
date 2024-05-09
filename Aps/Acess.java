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

	public class Acess {
	// CRIANDO UM METODO ESTATICO DE LEITURA DE ARQUIVO	
	    public static List<Funcionario> loadFuncionarios(String filePath){
	//CRIANDO UMA ARRAYLIST
	        List<Funcionario> Funcionarios = new ArrayList<>();
	//
	        try (   InputStream is = new FileInputStream(filePath);
	                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
	                BufferedReader br = new BufferedReader(isr);
	            ){
	        	
	            String linha;
	           
	            while((linha = br.readLine()) != null){


	                String[] palavras = linha.split(",");
	                int id = Integer.parseInt(palavras[0]);                     
	                String nome = palavras[1];
	                double salario = Double.parseDouble(palavras[2]);
	                
	                

	                Funcionario funcionario1 = new Funcionario(id,nome, salario);
	                Funcionarios.add(funcionario1);

	            }

	        }catch(IOException e){
	            e.printStackTrace();
	        }

	        return Funcionarios;

	    }

	    public static void saveCarros(List<Funcionario> Funcionarios, String filePath){

	        try(    OutputStream os = new FileOutputStream(filePath/*, true*/);
	                OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
	                PrintWriter pw = new PrintWriter(osw, true);
	                ){
	            for(Funcionario funcionario: Funcionarios){
	                pw.println(funcionario.getid()+","+funcionario.getnome()+","+funcionario.getsalario());
	            }

	        }catch(IOException e){
	            e.printStackTrace();
	        }

	    }


	}



