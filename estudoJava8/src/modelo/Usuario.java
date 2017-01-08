/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sergiodiniz
 */
public class Usuario {
    
    String nome;
    int idade;
    Boolean admin;

    public Usuario() {
    }

    
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.admin = false;
    }

    
    
    public String getNome() {
        return nome;
    }
    
    public void imprimirNome() {
        System.out.println("Nome: " + getNome());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", idade=" + idade + ", admin=" + admin + '}';
    }
    
    
    
    
}
