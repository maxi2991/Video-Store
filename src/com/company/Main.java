package com.company;


import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] mostrar=new String[100];
        String[][] mostrarMatrix=new  String[100][100];
        String mostrarP;

        Date fecha1=new Date(120,4,8);
        Date fechafin=new Date(120,4,20);
        Date fechafin2=new Date (120,3,20);
        Date fechafin3=new Date(120, 4,21);

        Pelicula peli1=new Pelicula("rocky","USA","accion","unrated",1991,60,"pelea ",15,50);
        Pelicula peli7=new Pelicula("rocky2","USA","accion","unrated",1992,60,"pelea ",15,70);
        Pelicula peli8=new Pelicula("rocky3","USA","accion","unrated",1994,60,"pelea ",15,75);
        Pelicula peli2=new Pelicula("Maru","ARG","drama","+18",1999,60,"pareja ",15,10);
        Pelicula peli3=new Pelicula("monkeys","Grecia","documental","+13",1997,60,"monos ",15,5);
        Pelicula peli4=new Pelicula("jimCarrey","USA","comedia","+5",1998,60,"gestos  ",15,60);
        Pelicula peli5=new Pelicula("Dead","USA","horror","+21",2010,60,"muertos  ",15,90);
        Pelicula peli6=new Pelicula("Jim2","USA","comedia","+5",1998,60,"gestos  ",15,6);

        Cliente martin=new Cliente("martin","4556587","Alvear 654");
        Cliente maria=new Cliente("maria","45789523","Cobos 854");
        Cliente victoria=new Cliente("vicky","7859523","Valverde 904");
        Cliente javi=new Cliente("javi","7859523","Valverde 904");

        Alquiler alqui1=new Alquiler(fecha1,fechafin,peli6);
        Alquiler alqui2=new Alquiler(fecha1,fechafin2,peli5);
        Alquiler alqui3=new Alquiler(fecha1,fechafin3,peli4);
        Alquiler alqui4=new Alquiler(fecha1,fechafin,peli3);
        Alquiler alqui5=new Alquiler(fecha1,fechafin,peli2);
        Alquiler alqui6=new Alquiler(fecha1 ,fechafin2,peli1);
        Alquiler alqui7=new Alquiler(fecha1,fechafin,peli7);
        Alquiler alqui8=new Alquiler(fecha1,fechafin3,peli8);



        Videoclub myclub=new Videoclub();

        myclub.agregarPelicula(peli1);
        myclub.agregarPelicula(peli2);
        myclub.agregarPelicula(peli3);
        myclub.agregarPelicula(peli4);
        myclub.agregarPelicula(peli5);
        myclub.agregarPelicula(peli6);
        myclub.agregarPelicula(peli7);
        myclub.agregarPelicula(peli8);
        myclub.altaCliente(martin);
        myclub.altaCliente(maria);
        myclub.altaCliente(victoria);
        myclub.altaAlquiler(alqui1,martin);
        myclub.altaAlquiler(alqui2,martin);
        myclub.altaAlquiler(alqui3,martin);
        myclub.altaAlquiler(alqui4,maria);
        myclub.altaAlquiler(alqui5,maria);
        myclub.altaAlquiler(alqui6,maria);
        myclub.altaAlquiler(alqui7,victoria);
        myclub.altaAlquiler(alqui8,victoria);

        //mostrar=myclub.clienteAlquileres(victoria,0,fechafin);
        mostrar=myclub.mostrarGenero("drama");
        //mostrarP=myclub.mostrarPelicula(peli1);
        mostrarP=myclub.mostrarCliente(javi);
        System.out.println(mostrarP);
        //mostrarMatrix=myclub.imprimirAlquileres(0,fechafin);
        for(int i=0; i<myclub.getDrama().size(); i++) {
            //for(int j=0; j<3; j++) {
                System.out.println(mostrar[i]);
                //System.out.println(mostrarMatrix[i][j]);
            //}
        }


    }


}
