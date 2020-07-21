/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;

/**
 *
 * @author Richard
 */
public class ClienteEmpresa implements Pessoa, Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private Empresa empresa;
    private long cpf;
    private String nome;
    private long telefone;

    public ClienteEmpresa(Integer codigo, Empresa empresa, long cpf, String nome, long telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
        this.empresa = empresa;
        this.cpf = cpf;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Contrato: " + empresa.getNumeroContrato()
                + " - Nome Empresa:" + empresa.getNomeEmpresa() + " - Cliente: "
                + getCpf() + " - " + getNome();
    }

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public long getTelefone() {
		
		return this.telefone;
	}

	@Override
	public void setTelefone(long telefone) {
		this.telefone = telefone;
		
	}

}
