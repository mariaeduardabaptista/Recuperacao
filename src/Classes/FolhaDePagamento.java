public class FolhaDePagamento {
    public  Funcionario funcionario;
     public double valorInss;
    private double valorIr;
    private double salarioLiquido;

    public FolhaDePagamento(Funcionario funcionario, double valorInss, double valorIr, double salarioLiquido) {
        this.funcionario = funcionario;
        this.valorInss = valorInss;
        this.valorIr = valorIr;
        this.salarioLiquido = salarioLiquido;
    }

    

    @Override
    public String toString() {
        return "FolhaDePagamento funcionario:" + funcionario + ", salarioLiquido:" + salarioLiquido + ", valorInss:"
                + valorInss + ", valorIr:" + valorIr + "]";
    }



    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorInss() {
        return valorInss;
    }

    public void setValorInss(double valorInss) {
        this.valorInss = valorInss;
    }

    public double getValorIr() {
        return valorIr;
    }

    public void setValorIr(double valorIr) {
        this.valorIr = valorIr;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    

    
    
}
