package entidade;

public class TipoChamado {
	private String titulo;
	//private String descricao;
	private Integer prioridade;
	private String status;
	private TipoProblema tipoProblema;
	
	
	
	public TipoChamado(String titulo, Integer prioridade, String status, TipoProblema tipoProblema) {
		super();
		this.titulo = titulo;
		//this.descricao = descricao;
		this.prioridade = prioridade;
		this.status = status;
		this.tipoProblema = tipoProblema;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTituo(String titulo) {
		this.titulo = titulo;
	}
	
	public Integer getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public TipoProblema getTipoProblema() {
		return tipoProblema;
	}
	public void setTipoProblema(TipoProblema tipoProblema) {
		this.tipoProblema = tipoProblema;
	}
	

}
