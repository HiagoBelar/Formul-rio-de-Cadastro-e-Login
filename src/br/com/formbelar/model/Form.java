/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.formbelar.model;

/**
 *
 * @author HiagoBelar
 */
public class Form {
    
    private String nome, email, senha;
    
    public void login (String email, String senha){
        
         this.email = email;
         this.senha = senha;
         
    }
    
     public void cadastro (String nome, String email, String senha){
        
         this.nome = nome;
         this.email = email;
         this.senha = senha;
    }

     // METODOS GETTER E SETTER
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     
     
    
}
