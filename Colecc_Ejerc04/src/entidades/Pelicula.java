/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
 */
package entidades;

public class Pelicula {

    private String titulo;
    private String director;
    private Float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nDirector: " + director + "\nduracion: " + duracion + "\n";
    }

}
