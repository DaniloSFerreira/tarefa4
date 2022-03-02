package um;

import um.Carro;

import java.util.Scanner;


public class Main { 
	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pneus: ");
		int quantidadePneus = scanner.nextInt();
		
		System.out.print("Informe a quantidade de calotas: ");
		int quantidadeCalotas = scanner.nextInt();
	
		int quantidadeParafusosPneu = quantidadePneus * 4;
		
		System.out.print("Informe a quantidade de portas 3 ou 5: ");
		int quantidadePortas = scanner.nextInt();
		
		System.out.print("Informe a cor desejada: ");
		String cor = scanner.next();
		
		System.out.print("Deseja dire��o hidr�ulica? Sim ou N�o ");
		String direcaoHidraulica = scanner.next();
		
		System.out.print("Deseja banco de couro? Sim ou N�o ");
		String bancoCouro = scanner.next();
		
		System.out.print("Deseja c�mbio autom�tico? Sim ou N�o ");
		String cambioAutomatico = scanner.next();
		
		System.out.print("Deseja teto solar? Sim ou N�o ");
		String tetoSolar = scanner.next();
		
		System.out.print("Informe a se deseja ar condicionado? Sim ou N�o ");
		String arCondicionado = scanner.next();
		
		
		Carro novoCarro = new Carro();
		novoCarro.setQuantidadePneus(quantidadePneus);
		novoCarro.setQuantidadeCalotas(quantidadeCalotas);
		novoCarro.setQuantidadeParafusosPneu(quantidadeParafusosPneu);
		novoCarro.setQuantidadePortas(quantidadePortas);
		novoCarro.setCor(cor);
		novoCarro.setDirecaoHidraulica(direcaoHidraulica);
		novoCarro.setBancoCouro(bancoCouro);
		novoCarro.setCambioAutomatico(cambioAutomatico);
		novoCarro.setTetoSolar(tetoSolar);
		novoCarro.setArCondicionado(arCondicionado);
		
		System.out.println("Carro montado com sucesso!");
		System.out.println("Quantidade de pneus: " + novoCarro.getQuantidadePneus());
		System.out.println("Quantidade de calotas: " + novoCarro.getQuantidadeCalotas());
		System.out.println("Quantidade de parafusos: " + novoCarro.getQuantidadeParafusosPneu());
		System.out.println("Quantidade de portas: " + novoCarro.getQuantidadePortas());
		System.out.println("A cor do carro �: " + novoCarro.getCor());
		System.out.println("Dire��o hidr�ulica: " + novoCarro.getDirecaoHidraulica());
		System.out.println("Banco de couro: " + novoCarro.getBancoCouro());
		System.out.println("C�mbio autom�tico: " + novoCarro.getCambioAutomatico());
		System.out.println("Teto solar: " + novoCarro.getTetoSolar());
		System.out.println("Ar-condicionado: " + novoCarro.getArCondicionado());
		
		
		
		
		
		
			}

}
 