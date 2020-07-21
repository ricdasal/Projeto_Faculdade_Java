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
public class Tecnico implements Pessoa, Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private long telefone;


    @Override
    public String toString() {
        return this.getNome();
    }


	@Override
	public String getNome() {
		return this.nome;
	}


	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		this.nome = nome;
	}


	@Override
	public long getTelefone() {
		// TODO Auto-generated method stub
		return this.telefone;
	}


	@Override
	public void setTelefone(long telefone) {
		// TODO Auto-generated method stub
		this.telefone =  telefone;
	}

}
