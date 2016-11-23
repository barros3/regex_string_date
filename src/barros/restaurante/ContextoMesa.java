package barros.restaurante;

import java.util.ArrayList;
import java.util.List;

public class ContextoMesa {

	Mesa mesa;
	
	Integer codGarcom;
	
	static final Garcom joao = new Garcom(1, "Joao");
	static final Garcom maria = new Garcom(2, "Maria");
	static final Garcom jose = new Garcom(3, "Jose");

	static final List<Garcom> listGarcom = new ArrayList<Garcom>();
	
	Double contadorDeVendas;
	
	int localQuantidadeVendas;
	
	public int getLocalQuantidadeVendas() {
		return localQuantidadeVendas;
	}
	
	public void setLocalQuantidadeVendas(int localQuantidadeVendas) {
		this.localQuantidadeVendas = localQuantidadeVendas;
	}
	
	ContextoMesa() {

	}
	
	ContextoMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
	ContextoMesa(Mesa mesa, Integer codGarcom) {
		this.mesa = mesa;
		this.codGarcom = codGarcom;
	}
	
	// gera o contexto do sistema
	public void gerarContexto(){
		System.out.println("---------- DESCRICAO -------------");
		System.out.println("Total: " + mesa.getPrecoDaMesa());
		System.out.println("----------------------------------");
		calculaValorPagarPorPessoa();
		calculaGorgeta();
		contadorDeVendas();
		calculaMaior();
		populaQuadroFuncionario();
		quantidadeDeLucroPorGarcom();
		
	}
	
	// calcular gorgeta
	public void calculaGorgeta(){
		System.out.println("10% do Garçon: R$" + mesa.getPrecoDaMesa()*0.10);
	}
	
	// valor a pagar por pessoa
	public void calculaValorPagarPorPessoa(){
		System.out.println("Valor à pagar por (" + mesa.getQuantidadePessoas() +") pessoas: R$ " + mesa.getPrecoDaMesa()/mesa.getQuantidadePessoas());
	}
	
	// calcula o lucro por garcom
	public void quantidadeDeLucroPorGarcom(){
		for(int i = 0; i < listGarcom.size(); i++){
			 if(listGarcom.get(i).getCodigoGarcom().equals(codGarcom)){
				 
				 if(listGarcom.get(i).getLucroParaEmpresa() == null){
					 listGarcom.get(i).setLucroParaEmpresa(0.0);
				 }
				 
				 Double r = listGarcom.get(i).getLucroParaEmpresa() + mesa.getPrecoDaMesa();
				 listGarcom.get(i).setLucroParaEmpresa(r);
				 
				 System.out.println("Lucro : " + listGarcom.get(i).getLucroParaEmpresa());
			 }
		 }
	}
	
	// validador
	public void validadorNull(){
		if(jose.getQuantidadeVendas() == null){
			jose.setQuantidadeVendas(0);
		}
		if(joao.getQuantidadeVendas() == null){
			joao.setQuantidadeVendas(0);
		}
		if(maria.getQuantidadeVendas() == null){
			maria.setQuantidadeVendas(0);
		}
		
	}
	
	// gera o quadro de funcionario
	public void quadroFuncionario(){
		for(int i = 0; i < listGarcom.size(); i++){
			System.out.println("COD: " + listGarcom.get(i).getCodigoGarcom());
			System.out.println("NOME: " + listGarcom.get(i).getNome());
			System.out.println("LUCRO: " + listGarcom.get(i).getLucroParaEmpresa());
			System.out.println("TOTAL EM VENDAS: " + listGarcom.get(i).getQuantidadeVendas());
		}	
	}
	
	public void populaQuadroFuncionario() {
		if(listGarcom.size() == 0){
			listGarcom.add(joao);
			listGarcom.add(maria);
			listGarcom.add(jose);
		}
	}
	
	// contador de vendas
	public void contadorDeVendas(){
		if(codGarcom == 1){
			if(joao.getQuantidadeVendas() == null){
				joao.setQuantidadeVendas(1);
			}else{				
				joao.setQuantidadeVendas(joao.getQuantidadeVendas() +1);
			}
		}
		if(codGarcom == 2){
			if(maria.getQuantidadeVendas() == null){
				maria.setQuantidadeVendas(1);
			}
			else{				
				maria.setQuantidadeVendas(maria.getQuantidadeVendas() +1);
			}
		}
		if(codGarcom == 3){
			if(jose.getQuantidadeVendas() == null){
				jose.setQuantidadeVendas(1);
			}
			else{				
				jose.setQuantidadeVendas(jose.getQuantidadeVendas() +1);
			}
		}
		validadorNull();
	}
	
	// calcula o total vendido no dia
//	public void calcularValorPorIntervaloDeTempo(){
//		System.out.printf("Total Vendido no dia: ", contadorDeVendas =+ mesa.getPrecoDaMesa());
//	}
	
	// garcom com mais atendimentos
	public void calculaMaior() {
		if(jose.getQuantidadeVendas() > joao.getQuantidadeVendas()){
			if(jose.getQuantidadeVendas() > maria.getQuantidadeVendas()){
				System.out.println("Maior vendedor: " + jose.getNome()  + " Quantidade de Vendas: " + jose.getQuantidadeVendas());
			} else if(joao.getQuantidadeVendas() < maria.getQuantidadeVendas()){
						System.out.println("Maior vendendor: " + maria.getNome() + " Quantidade de Vendas: " + maria.getQuantidadeVendas());
			} else if(jose.getQuantidadeVendas() == maria.getQuantidadeVendas()){
						System.out.println(jose.getNome() + " e " + maria.getNome() + " estão empatados -> Quantidade de Vendas: " + maria.getQuantidadeVendas());
				}	
		} else if(jose.getQuantidadeVendas() < joao.getQuantidadeVendas()){
					if(joao.getQuantidadeVendas() > maria.getQuantidadeVendas()){
						System.out.println("Maior vendedor: " + joao.getNome() + " Quantidade de Vendas: " + joao.getQuantidadeVendas());
					} else if(joao.getQuantidadeVendas() < maria.getQuantidadeVendas()){						
								System.out.println("Maior vendedor: " + maria.getNome() + " Quantidade de Vendas: " + maria.getQuantidadeVendas());
							}else if(joao.getQuantidadeVendas() == maria.getQuantidadeVendas()){
									System.out.println(maria.getNome() + " e " + joao.getNome() + " estão empatados -> Quantidade de Vendas: " + joao.getQuantidadeVendas());
								}
		} else if(jose.getQuantidadeVendas() == joao.getQuantidadeVendas()){
					if(jose.getQuantidadeVendas() > maria.getQuantidadeVendas()){
						System.out.println("Jose e Joao estão empatados -> Quantidade de Vendas: " + joao.getQuantidadeVendas());
					} else if(jose.getQuantidadeVendas() < maria.getQuantidadeVendas()){
						System.out.println("Maior vendedor: " + maria.getNome() + " Quantidade de Vendas: " + maria.getQuantidadeVendas());			
					}else if(jose.getQuantidadeVendas() == maria.getQuantidadeVendas()){
						System.out.println("Jose, Maria e Joao estão empatados -> Quantidade de Vendas: " + joao.getQuantidadeVendas());				
					}
			}
		}

}