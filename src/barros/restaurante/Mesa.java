package barros.restaurante;

public class Mesa {

	private Integer codigoGarcon;
	
	private Integer quantidadePessoas;
	
	private Double precoDaMesa;
	
	private Double precoPorPessoa;
	
	private Double gorgeta;
	
	private Integer horaEntrada;
	
	private Integer horaSaida;

	Mesa() {
	}
	
	Mesa(Integer codigoGarcon, Integer quantidadePessoas, Double precoDaMesa,
			Double precoPorPessoa, Integer horaEntrada, Integer horaSaida) {
		this.codigoGarcon = codigoGarcon;
		this.quantidadePessoas = quantidadePessoas;
		this.precoDaMesa = precoDaMesa;
		this.precoPorPessoa = precoPorPessoa;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}

	public Integer getCodigoGarcon() {
		return codigoGarcon;
	}

	public void setCodigoGarcon(Integer codigoGarcon) {
		this.codigoGarcon = codigoGarcon;
	}

	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public Double getPrecoDaMesa() {
		return precoDaMesa;
	}

	public void setPrecoDaMesa(Double precoDaMesa) {
		this.precoDaMesa = precoDaMesa;
	}

	public Double getPrecoPorPessoa() {
		return precoPorPessoa;
	}

	public void setPrecoPorPessoa(Double precoPorPessoa) {
		this.precoPorPessoa = precoPorPessoa;
	}

	public Integer getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Integer horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Integer getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Integer horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	public Double getGorgeta() {
		return gorgeta;
	}
	
	public void setGorgeta(Double gorgeta) {
		this.gorgeta = gorgeta;
	}
}
