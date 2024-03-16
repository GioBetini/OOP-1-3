package View;

import javax.swing.JOptionPane;

import Model.Funcionario;

public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario();
        f1.setNome(JOptionPane.showInputDialog("Qual o nome do funcionário? "));
        f1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário do "+f1.getNome()+": ")));
        f1.setCargo(JOptionPane.showInputDialog("Qual o cargo de "+f1.getNome()+"? "));

        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        System.out.println(f1.getCargo());
    }
}
