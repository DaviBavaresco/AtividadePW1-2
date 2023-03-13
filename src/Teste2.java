import br.edu.ifrs.pw1.agencias.Agencia;
import br.edu.ifrs.pw1.clientes.Cliente;
import br.edu.ifrs.pw1.contas.ContaEspecial;

import java.util.ArrayList;



import javax.swing.*;

public class Teste2 {
    public enum Menu{
        cadastrar_Conta(1,"Cadastrar Conta"),
        pesquisar_num(2,"Pesquisar conta especial usando numero"),
        pesquisar_num_agencia(3,"Pesquisar pelo numero da agencia"),
        pesquisar_cpf_cli(4,"Pesquisar usando CPF do cliente"),
        listar(5,"Listra todos"),
        sair(6,"Sair");
        private final int codigo;
        private final String descricao;
        Menu(int codigo, String descricao){
            this.codigo=codigo;
            this.descricao=descricao;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
        }
        public static Menu valueOf(int codigo){
            for(Menu menu: values()){
                if(menu.codigo==codigo){
                    return menu;
                }
            }
            throw new IllegalArgumentException("Código de menu inválido: " + codigo);
        }
    }
    public static void main(String[] args) {


        ArrayList<ContaEspecial> contas=new ArrayList<ContaEspecial>();


        while (true) {
            // Exibe o menu
            StringBuilder mensagem = new StringBuilder("Opções de menu:\n");
            for (Menu menu : Menu.values()) {
                mensagem.append(menu.getCodigo()).append(" - ").append(menu.getDescricao()).append("\n");
            }

            // Lê a opção escolhida pelo usuário
            String opcaoStr = JOptionPane.showInputDialog(null, mensagem.toString());

            int opcao;
            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                continue;
            }

            // Executa a opção escolhida
            Menu menu;
            try {
                menu = Menu.valueOf(opcao);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                continue;
            }

            // Executa a opção escolhida

            switch (menu) {
                case cadastrar_Conta:
                    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
                    for (int i = 0; i < 2; i++) {
                        clientes.add(new Cliente(JOptionPane.showInputDialog("Qual o CPF do cliente?"), JOptionPane.showInputDialog("Qual o nome do cliente? ")));
                    }
                    contas.add(new ContaEspecial(Double.parseDouble(JOptionPane.showInputDialog("Qual seu saldo")), Long.parseLong(JOptionPane.showInputDialog("Qual o numero de sua conta? ")),
                            new Agencia(Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de sua agencia? ")),
                                    JOptionPane.showInputDialog("Qual o endereco de sua agencia? ")), Double.parseDouble(JOptionPane.showInputDialog("Qual limite de sua conta?")), clientes));


                    break;
                case pesquisar_num:
                    boolean flag =false;
                    if(contas!=null && !contas.isEmpty()){
                        long numPesq= Long.parseLong(JOptionPane.showInputDialog("Qual o numero de pesquisa"));
                        for(ContaEspecial conta: contas){
                            if(conta!=null && conta.getNumero()==numPesq){
                                JOptionPane.showMessageDialog(null,"Conta ja existente "+conta.toString());
                                flag=true;
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"Conta não existe");
                    break;
                case pesquisar_num_agencia:
                    flag=false;
                    if(contas!=null && !contas.isEmpty()){
                        int numPes= Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da agencia de pesquisa"));
                        for(ContaEspecial conta: contas){
                            if(conta!=null && conta.getNumero()==numPes){
                                JOptionPane.showMessageDialog(null,"Conta ja existente "+ conta.getAgencia().toString());
                                flag=true;
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"Conta não existe");

                    break;
                case pesquisar_cpf_cli:
                    flag=false;
                    if(contas!=null && !contas.isEmpty()){
                        String cpfPesq=JOptionPane.showInputDialog("Qual o CPF da pesquisa");
                        for(ContaEspecial conta: contas){
                            if(conta!=null){
                                for(Cliente cli: conta.getClientes()){
                                    if(cli!=null && cli.getCpf().equals(cpfPesq)){
                                        JOptionPane.showMessageDialog(null,"Cliente cadastrado -> " +conta.toString());
                                    }
                                }
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null, "cliente não está cadastrado!");
                    break;

                case listar:
                    for(ContaEspecial contaEspecial : contas){
                        if(contaEspecial!=null){
                            JOptionPane.showMessageDialog(null,contaEspecial.toString());
                        }
                    }
                    break;
                case sair:
                    System.exit(0);
                    break;

            }
        }
    }


    }

