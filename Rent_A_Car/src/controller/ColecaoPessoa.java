package controller;

import java.util.ArrayList;

public class ColecaoPessoa {
	private ArrayList<Pessoa> pessoas=new  ArrayList<Pessoa>();

	public ColecaoPessoa(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public ColecaoPessoa() {

		this.pessoas = new ArrayList<Pessoa>();
	}

	public void addPessoa(Pessoa p){
		if(!pessoas.contains(p)){
			pessoas.add(p);
		}

	}

	public ArrayList<Pessoa> listarPessoa(){

		if(!pessoas.isEmpty()){
			return pessoas;
		}
		return null;
	}

	public ArrayList<Cliente> listarClientes(){
		ArrayList<Cliente> clientes=new ArrayList<Cliente>();

		for (Pessoa pessoa : pessoas) {

			if(pessoa instanceof Cliente){
				clientes.add((Cliente) pessoa);

			}
		}
		return clientes;

	} 

	public boolean removerPessoa(String cpf) {

		for (Pessoa pessoa : pessoas) {
			if(pessoa.getCpf().equals(cpf)){
				pessoas.remove(pessoa);
			}
		}


		return true;

	}





}
