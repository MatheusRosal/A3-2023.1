/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3;
import java.util.Scanner;
/**
 *
 * @author Matheus Rosal
 */
public final class Jogador extends Pessoa{
    private double salario;
    private boolean lesionado;
    private double precomercado;
    private String posicao;
    private Scanner input;
    
    public Jogador(int numero, String nome, String posicao, double salario, int idade) {
        this.numero = numero;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.setPrecomercado();
        this.posicao = posicao;
    }
    
    public Jogador(){
        this.input = new Scanner(System.in);
        System.out.println("Informe o numero da camisa: ");
        this.numero = input.nextInt();
        System.out.println("Nome do atleta: ");
        this.nome = input.next();
        System.out.println("Posicao: ");
        this.posicao = input.next(); 
        System.out.println("Informe o salario: ");
        this.salario = input.nextDouble();
        System.out.println("Idade: ");
        this.idade = input.nextInt();
    }
    
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    
    public String getPosicao(){
        return posicao;
    }
    
    @Override
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getPrecomercado() {
        return precomercado;
    }

    public void setPrecomercado() {
        if(this.idade>30){
            this.precomercado = this.salario * 5;
        }else{
            this.precomercado = this.salario *10;
        }
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }
    public void lesionar(){
        System.out.println("Jogador "+this.getNome()+" se lesionou.");
        this.setLesionado(true);
        this.precomercado = this.getPrecomercado() - (this.getPrecomercado()*0.10);
        System.out.println();
    }
    public void envelhecer(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Jogador "+this.getNome()+" agora tem "+this.getIdade()+" anos.");
        if(this.getIdade() >= 30){
            this.precomercado = this.getPrecomercado() - (this.getPrecomercado()*0.10);
        }
        System.out.println();
        
    }
    
    public void remover(int x){
    
    }
    
    @Override
    public String toString() {
        return "Jogador{" + super.toString() + "Posicao = " + posicao +", salario=" + salario + ", lesionado=" + lesionado + ", preco de mercado="+ precomercado +'}';
    }
    
}
