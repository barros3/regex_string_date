package barros.restaurante;

public class Garcom {
	
	private Integer codigoGarcom;
	
	private String nome;
	
	private Integer quantidadeVendas;
	
	private Double lucroParaEmpresa;
	
	Garcom() {
	}

	Garcom(Integer codigoGarcom, String nome) {
		this.codigoGarcom = codigoGarcom;
		this.nome = nome;
	}
	
	Garcom(Integer codigoGarcom, String nome, Integer quantidadeVendas) {
		this.codigoGarcom = codigoGarcom;
		this.nome = nome;
		this.quantidadeVendas = quantidadeVendas;
	}
	
	public Integer getCodigoGarcom() {
		return codigoGarcom;
	}

	public void setCodigoGarcom(Integer codigoGarcom) {
		this.codigoGarcom = codigoGarcom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public void setQuantidadeVendas(Integer quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}
	
	public Double getLucroParaEmpresa() {
		return lucroParaEmpresa;
	}
	
	public void setLucroParaEmpresa(Double lucroParaEmpresa) {
		this.lucroParaEmpresa = lucroParaEmpresa;
	}
	
}
