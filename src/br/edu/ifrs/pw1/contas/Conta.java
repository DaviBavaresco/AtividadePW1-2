package br.edu.ifrs.pw1.contas;

import br.edu.ifrs.pw1.agencias.Agencia;

public class Conta {
    private double saldo;
    private long numero;
    private Agencia agencia;

    public Conta(double saldo, long numero, Agencia agencia) {
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void credita(double valor){
        this.saldo+=valor;
    }
    public void debita(double valor){
        this.saldo-=valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                ", agencia=" + agencia +
                '}';
    }

}
