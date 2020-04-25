package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Videoclub {


    //Listas por genero
private List<Pelicula> accion=new ArrayList<>();
private List<Pelicula> drama=new ArrayList<>();
private List<Pelicula> aventura=new ArrayList<>();
private List<Pelicula> documental=new ArrayList<>();
private List<Pelicula> horror=new ArrayList<>();
private List<Pelicula> comedia=new ArrayList<>();
// Listas de clientes
private List<Cliente> clientes=new ArrayList<>();

    public Videoclub() {
    }

    public List<Pelicula> getAccion() {
        return accion;
    }

    public void setAccion(List<Pelicula> accion) {
        this.accion = accion;
    }

    public List<Pelicula> getDrama() {
        return drama;
    }

    public void setDrama(List<Pelicula> drama) {
        this.drama = drama;
    }

    public List<Pelicula> getAventura() {
        return aventura;
    }

    public void setAventura(List<Pelicula> aventura) {
        this.aventura = aventura;
    }

    public List<Pelicula> getDocumental() {
        return documental;
    }

    public void setDocumental(List<Pelicula> documental) {
        this.documental = documental;
    }

    public List<Pelicula> getHorror() {
        return horror;
    }

    public void setHorror(List<Pelicula> horror) {
        this.horror = horror;
    }

    public List<Pelicula> getComedia() {
        return comedia;
    }

    public void setComedia(List<Pelicula> comedia) {
        this.comedia = comedia;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    // Metodos Clientes
    public void altaCliente(Cliente nuevo){

        clientes.add(nuevo);

    }


    public int buscarCliente(Cliente usuario){

        int indice=clientes.indexOf(usuario);

        return indice;
    }

    public String mostrarCliente(Cliente usuario){
        int resultado=buscarCliente(usuario);

        if(resultado!=-1){
            return clientes.get(resultado).toString();
        }else{
            return "El cliente no existe";
        }

    }

    public void bajaCliente(Cliente usuario){
        int resultado=buscarCliente(usuario);
        if(resultado!=-1){
            clientes.remove(resultado);
        }
    }

    // Metodos biblioteca
    public void agregarPelicula(Pelicula nueva){

        switch (nueva.getGenero()){

            case "accion": accion.add(nueva);
            break;
            case "drama": drama.add(nueva);
            break;
            case "aventura": aventura.add(nueva);
            break;
            case "horror": horror.add(nueva);
            break;
            case "documental": documental.add(nueva);
            break;
            case "comedia": comedia.add(nueva);
            break;


        }



    }

    public int buscarPelicula(Pelicula titulo){
        int indice=-1;
        switch (titulo.getGenero()){

            case "accion": indice=accion.indexOf(titulo);
                break;
            case "drama": indice=drama.indexOf(titulo);
                break;
            case "aventura": indice=aventura.indexOf(titulo);
                break;
            case "horror": indice=horror.indexOf(titulo);
                break;
            case "documental": indice=documental.indexOf(titulo);
                break;
            case "comedia": indice=comedia.indexOf(titulo);
                break;
        }

return indice;
    }

    public String mostrarPelicula(Pelicula titulo){
        int resultado=buscarPelicula(titulo);
        String retorno="";

        if(resultado!=-1) {
            switch (titulo.getGenero()) {

                case "accion":
                    retorno=accion.get(resultado).toString();
                    break;
                case "drama":
                    retorno=drama.get(resultado).toString();
                    break;
                case "aventura":
                    retorno= aventura.get(resultado).toString();
                    break;
                case "horror":
                    retorno=horror.get(resultado).toString();
                    break;
                case "documental":
                    retorno=documental.get(resultado).toString();
                    break;
                case "comedia":
                    retorno=comedia.get(resultado).toString();
                    break;

            }

        }else{
            retorno="La pelicula no existe";
        }

        return retorno;
    }

    public int tamañoMaximogenero(){
        int[] sizes= {accion.size(),drama.size(),aventura.size(),documental.size(),horror.size(),comedia.size()};
        int maximo=accion.size();
        for(int i=0; i<sizes.length;i++){
            maximo=Math.max(maximo,sizes[i]);
        }

        return maximo;
    }


    public String[] mostrarGenero(String genre){
     int maximo=tamañoMaximogenero();
     String[] lista=new String[maximo];

        switch (genre) {

            case "accion":
                lista=new String[accion.size()];
                Collections.sort(accion);
                for(int i=0; i<accion.size();i++) {
                    if(accion.get(i)!=null)
                    lista[i] =accion.get(i).toString();
                }
            break;
            case "drama":
                lista=new String[drama.size()];
                Collections.sort(drama);
                for(int i=0; i<drama.size();i++) {
                    if(drama.get(i)!=null)
                        lista[i]=drama.get(i).toString();
                }
            break;
            case "aventura":
                lista=new String[aventura.size()];
                Collections.sort(aventura);
                for(int i=0; i<aventura.size();i++) {
                    if(aventura.get(i)!=null)
                        lista[i]=aventura.get(i).toString();
                }
            break;
            case "horror":
                lista=new String[horror.size()];
                Collections.sort(horror);
                for(int i=0; i<horror.size();i++) {
                    if(horror.get(i)!=null)
                        lista[i]=horror.get(i).toString();
                }
            break;
            case "documental":
                lista=new String[documental.size()];
                Collections.sort(documental);
                for(int i=0; i<documental.size();i++) {
                    if(documental.get(i)!=null)
                        lista[i]=documental.get(i).toString();
                }
            break;
            case "comedia":
                lista=new String[comedia.size()];
                Collections.sort(comedia);
                for(int i=0; i<comedia.size();i++) {
                    if(comedia.get(i)!=null)
                        lista[i]=comedia.get(i).toString();
                }
            break;


        }
return lista;
    }



public String[] mostrarMaspopulares(){
        List<Pelicula> auxiliar=new ArrayList<>();
        auxiliar.addAll(accion);
        auxiliar.addAll(drama);
        auxiliar.addAll(aventura);
        auxiliar.addAll(horror);
        auxiliar.addAll(comedia);
        auxiliar.addAll(documental);
        Collections.sort(auxiliar);
        String[] lista=new String[auxiliar.size()];

        for(int i=0; i<auxiliar.size();i++){
            if(auxiliar.get(i)!=null)
            lista[i]=auxiliar.get(i).toString();
        }

    return lista;

}

// Metodos Alquiler

public void altaAlquiler(Alquiler nuevo, Cliente persona){
        persona.agregarAlquiler(nuevo);
}

public void actualizaEstado(Cliente persona){
    Date actual=new Date();
    for(int i=0; i<persona.getAlquileres().size(); i++) {
        if (actual.compareTo(persona.getAlquileres().get(i).getFechafin())>=0 && persona.getAlquileres().get(i).getEstado()!="entregado")
            persona.getAlquileres().get(i).setEstado("vencido");
    }

}

// filtro por fecha con 1 , con 0 no filtro
public String[] clienteAlquileres(Cliente persona, int filtro, Date fecha){

        String[] lista=new String[persona.getAlquileres().size()];
        actualizaEstado(persona);
        for(int i=0; i<persona.getAlquileres().size(); i++){
            if(filtro==0) {
                lista[i] = persona.getNombre() + " " + persona.getAlquileres().get(i).toString();
            }else{
                if(fecha.compareTo(persona.getAlquileres().get(i).getFechafin())==0)
                    lista[i] = persona.getNombre() + " " + persona.getAlquileres().get(i).toString();
            }
        }

        return lista;
}

// imprimo alquileres totales o filtro por fechas
public String[][] imprimirAlquileres(int filtro, Date fecha){
String [][] listaClientes=new String[clientes.size()][];

for(int i=0 ; i<clientes.size(); i++){
    actualizaEstado(clientes.get(i));
    listaClientes[i]=clienteAlquileres(clientes.get(i),filtro,fecha);
}



return listaClientes;

}


}
