package controller;

import java.util.ArrayList;

public interface Icontroller {
	
	public void addPessoa(Pessoa p);
	public ArrayList<Pessoa> listarPessoa();
	public ArrayList<Cliente> listarCliente();
	public ArrayList<Funcionario> listarFuncionario();
	public boolean removerPessoa(String cpf);
	
	public void addVeiculo(Veiculo v);
	public ArrayList<Veiculo> listarVeiculo();
	public Veiculo listarVeiculo(String placa);
	public ArrayList<Veiculo> listarVeiculoDisponivel(String placa);
	public boolean removerVeiculo(String placa);
	
	public void realizarLocacao(Locacao l);
	public ArrayList<Locacao> listarLocacoes();
	public ArrayList<Locacao> listarLocacao(Pessoa p);
	public ArrayList<Locacao> listarLocacao(Veiculo v);
	public Locacao listarLocacao(int id);
	public boolean removerLocacao(int id);
	
	

}
