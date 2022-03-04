package um;

public class Carro {
//obrigatórios
	private int quantidadeRetrovisor;
	private int quantidadePneus;
	private int cintoSeguranca;
	private int quantidadeParafusosPneu;
//opcionais	
	private int quantidadeCalotas;
	private int quantidadePortas;
	private String cor;
	private String arCondicionado;
	private String direcaoHidraulica;
	private String bancoCouro;
	private String cambioAutomatico;
	private String tetoSolar;
	
	public Carro(int quantidadeRetrovisor, int quantidadePneus, int cintoSeguranca, int quantidadeParafusosPneu) {
		this.quantidadeRetrovisor = quantidadeRetrovisor;
		this.quantidadePneus = quantidadePneus;
		this.cintoSeguranca = cintoSeguranca;
		this.quantidadeParafusosPneu = quantidadePneus * 4;
	}

	public int getQuantidadeRetrovisor() {
		return quantidadeRetrovisor;
	}
	public int getQuantidadePneus() {
		return quantidadePneus;
	}
	public int getCintoSeguranca() {
		return cintoSeguranca;
	}
	public int getQuantidadeParafusosPneu() {
		return quantidadeParafusosPneu;
	}
	public int getQuantidadeCalotas() {
		return quantidadeCalotas;
	}

	public void setQuantidadeCalotas(int quantidadeCalotas) {
		this.quantidadeCalotas = quantidadeCalotas;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public String getDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(String direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public String getBancoCouro() {
		return bancoCouro;
	}

	public void setBancoCouro(String bancoCouro) {
		this.bancoCouro = bancoCouro;
	}

	public String getCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(String cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public String getTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(String tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	
	
}
