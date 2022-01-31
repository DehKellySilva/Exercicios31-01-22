package exercicioJava;

public class Aviao {
	
	private String partida;
	private String destino;
	private int capacidadePassageiros;
	
	public Aviao(String partida, String destino,int capacidadePassageiros)
	{
		this.partida = partida;
		this.destino = destino;
		this.capacidadePassageiros = capacidadePassageiros;
	}
	

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	
	public void imprimir()
	{
		System.out.println("O voo está partindo de: "+partida+"\nO "
				+ "seu destino é:"+destino+"\nA capacidade passageiros é: "+capacidadePassageiros);
	}
	
	

}
