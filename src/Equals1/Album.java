/*
El equals del IntelliJ evalua, primero, si el objeto pasado por parametro es el mismo objeto
que llama al metodo. Si no es el mismo objeto, entonces evalua que el objeto parametro no sea nulo
(o sea que no este vacio) y que las clases del objeto que llama al metodo y el objeto parametro sean
la misma. Si esto no se cumple entonces sigue adelante y castea el objeto parametro.
Por ultimo retorna el valor booleano, que variara dependiendo que objetos se comparen.
*/

package Equals1;

import java.util.Objects;

public class Album {
    protected String artista;
    protected String titulo;

    public Album(String artista, String titulo){
        this.artista = artista;
        this.titulo = titulo;
    }

    //--EQUALS PROPIO
    /*@Override
    public boolean equals(Object a){

        Equals.Album album = (Equals.Album) a;

        if(this.artista.equals(album.artista) && this.titulo.equals(album.titulo)){
            return true;
        }else{
            return false;
        }
    }*/

    //--EQUALS INTELLI J
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||  getClass()!= o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(artista, album.artista) && Objects.equals(titulo, album.titulo);
    }

    //==
    public boolean sonIguales(Object b){
        Album album = (Album) b;

        if(this == album){
            return true;
        }else{
            return false;
        }
    }
}
