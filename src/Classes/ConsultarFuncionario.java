import java.util.List;
import java.util.Scanner;

public class ConsultarFuncionario {

    public void exibirFuncionario(List<Funcionario> func, Scanner ler){
        System.out.println("Digite nome do funcionario que deseja consultar");
        String opc = ler.nextLine();

        for(Funcionario funcionario : func){
            if(funcionario.getNome().equals(opc) );
                System.out.println(funcionario);

                break;
            }
    }
    
}
