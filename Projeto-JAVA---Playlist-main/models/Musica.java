package models;

public class Musica  extends Midia{
    
    private Artista interprete;
    
    public Artista getInterprete() {
        return interprete;
    }

    public void setInterprete(Artista interprete) {
        this.interprete = interprete;
    }

    public Musica (String titulo, String autor, Double duracao, Artista interprete, String genero){
        super(titulo, autor, duracao, genero);
        setInterprete(interprete);
    }

    @Override
    public String toString() {
        return super.toString()+ "|| Intérprete: " + getInterprete() + "|| Data de criação: " + super.getData();
    }
    
}
