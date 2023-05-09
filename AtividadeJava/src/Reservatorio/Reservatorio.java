package Reservatorio;

public class Reservatorio {
	private int id;
	private String cidade;
	private double capacidadeMaxima;
	private double capacidadeAtual;
	private String situacao;

	public Reservatorio(int id, String cidade, double capacidadeMaxima, double capacidadeAtual, String situacao) {
		this.id = id;
		this.cidade = cidade;
		this.capacidadeMaxima = capacidadeMaxima;
		this.capacidadeAtual = capacidadeAtual;
		this.situacao = situacao;
	}

	public int getId() {
		return id;
	}

	public String getCidade() {
		return cidade;
	}

	public double getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public double getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public String getSituacao() {
		return situacao;
	}
	
	public double abastecer(double volumeAgua) {
		this.capacidadeAtual += volumeAgua;
		if(this.capacidadeAtual> this.capacidadeMaxima) {
		}
		return volumeAgua;
	}
	public String sangrar(String vazao, int minutos) {
		for(double i = 1; i <= minutos; i++) {
			if(vazao == "1") {
				this.capacidadeAtual -= 25000;
			}
			if(vazao == "2") {
				this.capacidadeAtual -= 50000;
			}
	}
	if(this.capacidadeAtual < 0) {
		capacidadeAtual = 0;
	}
	if(this.capacidadeAtual == 0) {
		return this.situacao = "vazio";
	}
	else if(this.capacidadeAtual <= this.capacidadeMaxima*0.25) {
		return this.situacao = "Mínimo";
	}
	else if(this.capacidadeAtual <= this.capacidadeMaxima*0.75) {
		return this.situacao =  "Médio";
	}
	else {}
		return this.situacao = "Máximo";
	}
}

