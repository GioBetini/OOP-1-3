package Model;


public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(){
        
      }
    
      public String getNome() {
        return nome;
      }

      public void setNome(String nome){
        this.nome = nome;
      }

      public Double getSalario() {
        return salario;
      }
      public void setSalario(Double salario){
          if (salario < 1412d){
            this.salario = 1412d;
          } else {
            this.salario = salario;
          }
          }
      

      public String getCargo() {
        return cargo;
      }

      public void setCargo(String cargo){
        this.cargo = cargo;
      }


}
