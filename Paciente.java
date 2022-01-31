package exercicioJava;

public class Paciente {

	private String nome;
	private String endereco;
	private String data;
	private String horario;
	private String medico;
	private String especialidade;
	
	public Paciente(String nome,String endereco,String data, String horario,String medico, String especialidade)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.data = data;
		this.horario = horario;
		this.medico = medico;
		this.especialidade = especialidade;
	}

	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getHorario() {
		return horario;
	}



	public void setHorario(String horario) {
		this.horario = horario;
	}



	public String getMedico() {
		return medico;
	}



	public void setMedico(String medico) {
		this.medico = medico;
	}



	public String getEspecialidade() {
		return especialidade;
	}



	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}



	public void imprimir() {
		System.out.println("Nome do paciente: "+nome+"\nEndereço do paciente: "+endereco+
				"\nData do atendimento: "+data+"\nHorário: "+horario+"\nMédico responsável pelo atendimento: "
				+medico+"\nEspecialidade: "+especialidade);
	}
	
	
}
