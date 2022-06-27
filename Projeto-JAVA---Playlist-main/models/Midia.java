package models;

import java.util.Date;

import models.contracts.IMidia;

public class Midia implements IMidia{

    public Midia(String titulo, String autor, Double duracao, String genero) {
        setTitulo(titulo);
        setAutor(autor);
        setDuracao(duracao);
        setData(new Date());
        setGenero(genero);
    }

    private String titulo;
    private String autor;
    private Double duracao;
    private Date data;
    private String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() + "|| Autor:" + getAutor() + "|| Gênero: " + getGenero() + "|| Duração: " + getDuracao();
    }
}
