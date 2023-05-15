package org.example;

public class Videojuego {
    private int ID;
    private String Nombre;
    private String Genero;
    private Double PesoEnGB;
    private String plataforma;
    private String Desarrollador;

    public Videojuego(){
    }

    public Videojuego(int ID, String nombre, String genero, Double pesoEnGB, String plataforma, String desarrollador) {
        this.ID = ID;
        Nombre = nombre;
        Genero = genero;
        PesoEnGB = pesoEnGB;
        this.plataforma = plataforma;
        Desarrollador = desarrollador;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public Double getPesoEnGB() {
        return PesoEnGB;
    }

    public void setPesoEnGB(Double pesoEnGB) {
        PesoEnGB = pesoEnGB;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrollador() {
        return Desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        Desarrollador = desarrollador;
    }
}
