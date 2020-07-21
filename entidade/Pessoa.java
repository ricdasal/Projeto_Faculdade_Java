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
public interface Pessoa extends Serializable{
    
    static final long serialVersionUID = 1L;
    

    public String getNome();

    public void setNome(String nome); 

    public long getTelefone();

    public void setTelefone(long telefone);
    
    
    
}
