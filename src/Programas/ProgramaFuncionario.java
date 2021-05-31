import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProgramaFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        Menus menu = new Menus();
        List<Funcionario> listaFunc = new ArrayList<>();
        List<FolhaDePagamento> listaPg = new ArrayList<>();

        menu.menuPrincipal();
        opcao = ler.nextInt();

        do{
        switch(opcao){
            case 1:
        
            Funcionario func;
            CadastroFuncionario cad = new CadastroFuncionario(null, null, opcao);
            func = cad.cadastroFuncionario(ler);
            listaFunc.add(func);
            

            break;
            
            
            case 2:
            break;

            case 3:

            ConsultarFuncionario con = new ConsultarFuncionario();
            con.exibirFuncionario(listaFunc, ler);
            
            
            break;

            case 4:
            System.out.println("Saindo");
            break;

            default:
            System.out.println("Opçao digitada invalida");
        }

        }while(opcao != 0);
        ler.close();

        
    }
    
}
