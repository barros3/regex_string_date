package barros.restaurante;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		
		App app = new App();
		app.gerador();
		
	}
	
	public void gerador(){
		
		Scanner cam = new Scanner(System.in);
		Integer opcao = 0;
		
		while (true) {
			
			Mesa mesa = new Mesa();
			Integer codGarcom = null;
			ContextoMesa contextoMesa = new ContextoMesa();
			System.out.println("--------------------------------------");
			System.out.println("Bem vindo!");
			System.out.println("--------------------------------------");
			System.out.println("1 - Cadastrar Nova Mesa: ");
			System.out.println("2 - Status do quadro do Funcionario: ");
		    
			opcao = cam.nextInt();
			
			switch (opcao) {
				case 1:

					System.out.println("Codigo do Garçom: "); codGarcom = cam.nextInt();
					System.out.println("Quantidade de Pessoas:"); mesa.setQuantidadePessoas(cam.nextInt());
					System.out.println("Preco da Mesa: "); mesa.setPrecoDaMesa(cam.nextDouble());
					System.out.println("Hora da Entrada: "); mesa.setHoraEntrada(cam.nextInt());
					System.out.println("Hora da Saida: "); mesa.setHoraSaida(cam.nextInt());
					
					contextoMesa = new ContextoMesa(mesa, codGarcom);
					
					contextoMesa.gerarContexto();
					
					break;

				case 2:
					contextoMesa.populaQuadroFuncionario();
					contextoMesa.quadroFuncionario();
				case 3:

			default:
				System.out.println("Reiniciando...");
				break;
			}			
			gerador();
		}
		
	}
	
}
