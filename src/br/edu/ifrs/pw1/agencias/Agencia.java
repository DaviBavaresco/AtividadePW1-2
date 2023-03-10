package br.edu.ifrs.pw1.agencias;

public class Agencia {
    private int numero;
    private String endereco;

    public Agencia(int numero, String endereco) {
        this.numero = numero;
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "numero=" + numero +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
