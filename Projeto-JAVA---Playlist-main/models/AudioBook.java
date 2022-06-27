package models;

public class AudioBook extends Midia{

    public AudioBook(String titulo, String autor, Double duracao, String genero, String narrador, String editora){
        super(titulo, autor, duracao, genero);
        setNarrador(narrador);
        setEditora(editora);
    }

    private String narrador;
    private String editora;
    
    public String getNarrador() {
        return narrador;
    }
    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return super.toString()+ "|| Narrador: " + getNarrador() + "|| Editora: " + getEditora() + "|| Data de criação: " + super.getData();
    }

}
