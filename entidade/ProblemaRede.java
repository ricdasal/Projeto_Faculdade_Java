package entidade;

public class ProblemaRede implements TipoProblema {

	//private String título;
	private String descripcionProblema;
	//private String status;
	private String tipoConexao;
	private String enderecoRede;
	
	

	public String getTipoConexao() {
		return tipoConexao;
	}



	public void setTipoConexao(String tipoConexao) {
		this.tipoConexao = tipoConexao;
	}



	public String getEnderecoRede() {
		return enderecoRede;
	}



	public void setEnderecoRede(String enderecoRede) {
		this.enderecoRede = enderecoRede;
	}



	@Override
	public String getdescripcionProblema() {
		
		return this.descripcionProblema;
	}

	

}
