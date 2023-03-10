import br.edu.ifrs.pw1.contas.ContaEspecial;

import javax.swing.*;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<ContaEspecial>contas=new ArrayList<ContaEspecial>();

        while(true){
            switch(montaMenu()){
                case 1:

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
