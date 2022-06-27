package models;

public class Podcast extends Midia {

    public Podcast(String titulo, String autor, Double duracao, String genero, String convidado, String patrocinador) {
        super(titulo, autor, duracao, genero);
        setConvidado(convidado);
        setPatrocinador(patrocinador);
    }

    private String convidado;
    private String patrocinador;

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    public String toString() {
        return super.toString()+ "|| Convidado: " + getConvidado() + "|| Patrocinador: " + getPatrocinador() + "|| Data de criação: " + super.getData();
    }

}
