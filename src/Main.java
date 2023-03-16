import br.edu.ifrs.pw1.agencias.Agencia;
import br.edu.ifrs.pw1.clientes.Cliente;
import br.edu.ifrs.pw1.clientes.ValidadorCPF;
import br.edu.ifrs.pw1.contas.ContaEspecial;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Cliente> clientes=new ArrayList<Cliente>();
//        Cliente c;
//        Agencia p1= new Agencia(1,"Rua São Luiz");
//        c= new Cliente("0011001","Davi");
//        clientes.add(c);
//        ContaEspecial CE= new ContaEspecial(1200,1,p1,450,clientes);
//
//        System.out.println(CE.toString());
//        CE.credita(150);
//        System.out.println(CE.toString());
//        CE.debita(1000);
//        System.out.println(CE.toString());

        Cliente c= new Cliente();
        c.setCpf("54647142949");

        if(ValidadorCPF.isCPF(c.getCpf()))
            System.out.println(ValidadorCPF.imprimeCPF(c.getCpf()));
        else System.out.println("erro");


    }
}