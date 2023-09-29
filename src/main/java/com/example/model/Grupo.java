package com.example.model;


public class Grupo { 
    
    //* atributos (idGrupo, nomeGrupo, idContato)
    private Integer idGrupo;
    private Integer idContato;

    private String nomeGrupo;
    
    
    //* construtor sem idGrupo
    public Grupo(String nomeGrupo, Integer idContato) {
        this.nomeGrupo = nomeGrupo;
        this.idContato = idContato;
    }

    //* construtor
    public Grupo(Integer idGrupo, String nomeGrupo, Integer idContato) {
        this.idGrupo = idGrupo;
        this.nomeGrupo = nomeGrupo;
        this.idContato = idContato;
    }


    //* idGrupo getter / setter
    public Integer getIdGrupo() {return idGrupo;}
    public void setIdGrupo(Integer idGrupo) {this.idGrupo = idGrupo;}

    //* idContato getter / setter
    public Integer getIdContato() {return idContato;}
    public void setIdContato(Integer idContato) {this.idContato = idContato;}

    //* nomeGrupo getter / setter
    public String getNomeGrupo() {return nomeGrupo;}
    public void setNomeGrupo(String nomeGrupo) {this.nomeGrupo = nomeGrupo;}

    // @Override
    // public String toString() {
    //     return "Grupos [idGrupo=" + idGrupo + "idContato="+idContato +"]";
    // }

    // public Integer getId() {
    //     return id;
    // }

    // public void setId(Integer id) {
    //     this.id = id;
    // }

    // public Veiculo marca(String marca) {
    //     this.marca = marca;
    //     return this;
    // }

    // public Veiculo modelo(String modelo) {
    //     this.modelo = modelo;
    //     return this;
    // }

    // public Veiculo ano(Integer ano) {
    //     this.ano = ano;
    //     return this;
    // }-

    // public Veiculo valor(BigDecimal valor) {
    //     this.valor = valor;
    //     return this;
    // }

    // public Cliente getCliente() {
    //     return cliente;
    // }

    // public void setCliente(Cliente cliente) {
    //     this.cliente = cliente;
    // }

    
}
