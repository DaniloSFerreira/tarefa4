package um;

import um.Carro;

import java.util.Scanner;


public class Main { 
	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pneus: ");
		int quantidadePneus = scanner.nextInt();
		
		System.out.print("Informe o total de espelhos retrovisores: ");
		int quantidadeRetrovisor = scanner.nextInt();
		
		System.out.print("Informe a quantidade de passageiros protegidos pelo cinto de segurança: ");
		int cintoSeguranca = scanner.nextInt();
		
		System.out.print("Informe a quantidade de calotas: ");
		int quantidadeCalotas = scanner.nextInt();
	
		int quantidadeParafusosPneu = quantidadePneus * 4;
		
		System.out.print("Informe a quantidade de portas 3 ou 5: ");
		int quantidadePortas = scanner.nextInt();
		
		System.out.print("Informe a cor desejada: ");
		String cor = scanner.next();
		
		System.out.print("Deseja direção hidráulica? Sim ou Não ");
		String direcaoHidraulica = scanner.next();
		
		System.out.print("Deseja banco de couro? Sim ou Não ");
		String bancoCouro = scanner.next();
		
		System.out.print("Deseja câmbio automático? Sim ou Não ");
		String cambioAutomatico = scanner.next();
		
		System.out.print("Deseja teto solar? Sim ou Não ");
		String tetoSolar = scanner.next();
		
		System.out.print("Informe a se deseja ar condicionado? Sim ou Não ");
		String arCondicionado = scanner.next();
		
		
		Carro novoCarro = new Carro(quantidadeRetrovisor, quantidadePneus, cintoSeguranca, quantidadeParafusosPneu);
		
		novoCarro.setQuantidadeCalotas(quantidadeCalotas);
		
		novoCarro.setQuantidadePortas(quantidadePortas);
		novoCarro.setCor(cor);
		novoCarro.setDirecaoHidraulica(direcaoHidraulica);
		novoCarro.setBancoCouro(bancoCouro);
		novoCarro.setCambioAutomatico(cambioAutomatico);
		novoCarro.setTetoSolar(tetoSolar);
		novoCarro.setArCondicionado(arCondicionado);
		
		System.out.println("Carro montado com sucesso!");
		System.out.println("Seu carro possui " + novoCarro.getQuantidadePneus() + " pneus e " + novoCarro.getQuantidadeParafusosPneu() + " parafusos para rodas");
		System.out.println("Quantidade de calotas: " + novoCarro.getQuantidadeCalotas());
		System.out.println("O carro possui cinto de segurança para " + novoCarro.getCintoSeguranca() + " pessoas.");
		System.out.println("O carro possui " + novoCarro.getQuantidadeRetrovisor() + " retrovisores");
		System.out.println("Quantidade de portas: " + novoCarro.getQuantidadePortas());
		System.out.println("A cor do carro é: " + novoCarro.getCor());
		System.out.println("Direção hidráulica: " + novoCarro.getDirecaoHidraulica());
		System.out.println("Banco de couro: " + novoCarro.getBancoCouro());
		System.out.println("Câmbio automático: " + novoCarro.getCambioAutomatico());
		System.out.println("Teto solar: " + novoCarro.getTetoSolar());
		System.out.println("Ar-condicionado: " + novoCarro.getArCondicionado());
		
		
		
		
		
		
			}

}
 