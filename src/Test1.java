import br.edu.ifrs.pw1.agencias.Agencia;
import br.edu.ifrs.pw1.clientes.Cliente;
import br.edu.ifrs.pw1.contas.ContaEspecial;

import javax.swing.*;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<ContaEspecial>contas=new ArrayList<ContaEspecial>();

        while(true) {
            switch (montaMenu()) {
                case 1:
                    //int num= Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de sua agencia? "));
                    //String endereco= JOptionPane.showInputDialog("Qual o endereco de sua agencia? ");
                    //double saldo= Double.parseDouble(JOptionPane.showInputDialog("Qual seu saldo"));
                    //long numeroCo= Long.parseLong(JOptionPane.showInputDialog("Qual o numero de sua conta? "));
                    // double limite= Double.parseDouble(JOptionPane.showInputDialog("Qual limite de sua conta?"));
                    // Agencia agencia= new Agencia(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de sua agencia? ")),JOptionPane.showInputDialog("Qual o endereco de sua agencia? "));
                    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
                    for (int i = 0; i < 2; i++) {
                        clientes.add(new Cliente(JOptionPane.showInputDialog("Qual o CPF do cliente?"), JOptionPane.showInputDialog("Qual o nome do cliente? ")));
                    }
                    contas.add(new ContaEspecial
                            (Double.parseDouble(JOptionPane.showInputDialog("Qual seu saldo")), Long.parseLong(JOptionPane.showInputDialog("Qual o numero de sua conta? ")),
                                    new Agencia(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de sua agencia? ")),
                                            JOptionPane.showInputDialog("Qual o endereco de sua agencia? ")), Double.parseDouble(JOptionPane.showInputDialog("Qual limite de sua conta?")), clientes));
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    for(ContaEspecial contaEspecial : contas){
                        if(contaEspecial!=null){
                            JOptionPane.showMessageDialog(null,contaEspecial.toString());
                        }
                    }
                    break;
                case 6:
                    break;

            }

        }

    }
    public static int montaMenu(){
        String menu= "1-Cadastrar conta especial\n"+
                "2-Pesquisar conta especial usando numero\n"+
                "3-Pesquisar conta especial usando numero da agencia\n"+
                "4-Pesquisar conta especial usando CPF do cliente\n"+
                "5-Listar todos\n"+
                "6-Sair\n";
       return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
