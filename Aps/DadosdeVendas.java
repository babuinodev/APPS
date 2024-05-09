package Aps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DadosdeVendas {
	Map<Integer, Funcionario> funcionarios = new TreeMap<Integer, Funcionario>();
	Map<Integer, List<Carro>> carrosPorFuncionario = new TreeMap<Integer, List<Carro>>();
	
	public void AddFuncionario(Funcionario f){
		this.funcionarios.put(f.getid(), f);
		this.carrosPorFuncionario.put(f.getid(), new ArrayList<Carro>());
	}
	public void AddCarroVendido(Carro c, int idfuncionario) {
		this.carrosPorFuncionario.get(idfuncionario).add(c);
	}
	
	public List<Carro> Carosporfun(int iddofuncionario) {
		return carrosPorFuncionario.get(iddofuncionario);
	}

}
