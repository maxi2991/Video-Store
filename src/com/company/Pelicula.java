package com.company;

import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {
    private String nombre;
    private String origen;
    private String genero;
    private String audiencia;
    private int lanzamiento;
    private int duracion;
    private String descripcion;
    private int stock;
    private int popularidad;

    public Pelicula(String nombre, String origen, String genero, String audiencia, int lanzamiento, int duracion, String descripcion, int stock, int popularidad) {
        this.nombre = nombre;
        this.origen = origen;
        this.genero = genero;
        this.audiencia = audiencia;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.stock = stock;
        this.popularidad = popularidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(String audiencia) {
        this.audiencia = audiencia;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString(){
        return "Titulo: "+this.nombre+ " Origen: "+this.origen + " genero: "+ this.genero+ " Calificacion: "+ this.audiencia+ " Año: "+ this.lanzamiento+ "Duracion:  "+this.duracion+ " Stock: "+ this.stock + " Popularidad:"+this.popularidad+ " Descripcion: "+this.descripcion;

    }

    // para buscar pelicula por nombre
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula nuevo = (Pelicula) o;
        return nombre.equals(nuevo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }


    // para ordenar lista de peliculas por popularidad

    @Override
    public int compareTo(Pelicula pelicula) {
        if(this.popularidad<=pelicula.popularidad){
         return 1 ;
        }else{
            return -1;
        }
    }




}
