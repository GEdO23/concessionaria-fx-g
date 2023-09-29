package com.example.model;


public class Contato {

    //* atributos (idContato, nome, email, telefone)
    private Integer idContato;
    private String nome;
    private String email;
    private String telefone;

    //* construtor sem id, email e telefone
    public Contato(String nome) {
        this.nome = nome;
    }

    //* construtor sem id e telefone
    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //* construtor sem id
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    //* construtor com id 
    public Contato(Integer idContato, String nome, String email, String telefone) {
        this.idContato = idContato;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    //* construtor com idGrupo

    //* id getter / setter
    public Integer getIdContato() {return idContato;}
    public void setIdContato(Integer idContato) {this.idContato = idContato;}
    
    //* nome getter / setter
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    
    //* email getter / setter
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    //* telefone getter / setter
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

}
