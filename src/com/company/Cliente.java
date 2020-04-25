package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Alquiler> alquileres=new ArrayList<>();

    public Cliente(String name, String tel, String dire){

    this.nombre=name;
    this.telefono=tel;
    this.direccion=dire;

    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    // Añadir alquiler al cliente
    public void agregarAlquiler(Alquiler nuevo){
    alquileres.add(nuevo);
    }

    @Override
    public String toString(){
        return "Nombre: "+ this.nombre + " Direccion: "+ this.direccion+" telefono: "+ this.telefono;
    }
//para buscar por nombre al cliente
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente nuevo = (Cliente) o;
        return nombre.equals(nuevo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }


}
