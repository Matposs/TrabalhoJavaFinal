package models.contracts;

import java.util.Date;


public interface IMidia {

    public void setTitulo(String titulo);

    public void setAutor(String autor);

    public void setDuracao(Double duracao);

    public void setData(Date data);

    public void setGenero(String genero);
}
