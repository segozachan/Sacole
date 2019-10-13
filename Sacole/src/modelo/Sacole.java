/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public class Sacole {
    
    private Integer codigo;
    private Integer numero_de_serie;
    private Integer preco;
    private LocalDate data_de_validade;
    private String sabor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getNumero_de_serie() {
        return numero_de_serie;
    }

    public void setNumero_de_serie(Integer numero_de_serie) {
        this.numero_de_serie = numero_de_serie;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public LocalDate getData_de_validade() {
        return data_de_validade;
    }

    public void setData_de_validade(LocalDate data_de_validade) {
        this.data_de_validade = data_de_validade;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return sabor;
    }
    
}
