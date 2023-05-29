/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3;

/**
 *
 * @author Matheus Rosal
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected int numero;

    
    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", idade=" + idade + ", numero=" + numero + '}';
    }
    
}
