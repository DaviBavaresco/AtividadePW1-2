package br.edu.ifrs.pw1.contas;

import br.edu.ifrs.pw1.agencias.Agencia;
import br.edu.ifrs.pw1.clientes.Cliente;

import java.util.ArrayList;

public class ContaEspecial extends Conta{

   private double limite;
   private ArrayList<Cliente> clientes= new ArrayList<Cliente>();

    public ContaEspecial(double saldo, long numero, Agencia agencia, double limite, ArrayList<Cliente> clientes) {
        super(saldo, numero, agencia);
        this.limite = limite;
        this.clientes = clientes;
    }
    public void adicionarCliente(Cliente c){
        this.clientes.add(c);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                " Limite=" + limite +
                " Clientes=" + clientes +
                " Agencia  "+getAgencia()+
                " Saldo " +getSaldo()+
                " Numero "+getNumero();
    }
}
