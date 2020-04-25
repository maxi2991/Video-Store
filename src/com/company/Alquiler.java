package com.company;

import java.util.Date;

public class Alquiler {
    private Date fechainicio;
    private Date fechafin;
    private String  estado; //  entregado ,pendiente , vencido
    private Pelicula titulo;

    public Alquiler(Date fechainicio, Date fechafin, Pelicula titulo) {
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estado = "pendiente";
        this.titulo = titulo;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pelicula getTitulo() {
        return titulo;
    }

    public void setTitulo(Pelicula titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString(){

        return "Titulo: "+this.titulo.getNombre()+" Alta:  "+this.fechainicio+" Vencimiento: "+this.fechafin+ " Estado: "+ this.estado;
    }
}
