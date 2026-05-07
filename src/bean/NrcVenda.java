/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;


/**
 *
 * @author u71744222177
 */
public class NrcVenda {
    private int NrcIdVenda;
    private int nrcIdUsuarios;
    private int nrcIdClientes;
    private String nrcProduto;
    private Date nrcDataVenda;
    private String nrcValorTotal;

    public int getNrcIdVenda() {
        return NrcIdVenda;
    }

    public void setNrcIdVenda(int NrcIdVenda) {
        this.NrcIdVenda = NrcIdVenda;
    }

    public int getNrcIdUsuarios() {
        return nrcIdUsuarios;
    }

    public void setNrcIdUsuarios(int nrcIdUsuarios) {
        this.nrcIdUsuarios = nrcIdUsuarios;
    }

    public int getNrcIdClientes() {
        return nrcIdClientes;
    }

    public void setNrcIdClientes(int nrcIdClientes) {
        this.nrcIdClientes = nrcIdClientes;
    }

    public String getNrcProduto() {
        return nrcProduto;
    }

    public void setNrcProduto(String nrcProduto) {
        this.nrcProduto = nrcProduto;
    }

    public Date getNrcDataVenda() {
        return nrcDataVenda;
    }

    public void setNrcDataVenda(Date nrcDataVenda) {
        this.nrcDataVenda = nrcDataVenda;
    }

    public String getNrcValorTotal() {
        return nrcValorTotal;
    }

    public void setNrcValorTotal(String nrcValorTotal) {
        this.nrcValorTotal = nrcValorTotal;
    }

}
