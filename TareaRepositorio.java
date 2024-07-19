/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarearepositorio;

/**
 *
 * @author ggrec
 */
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void obtenerInformacionPersonal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}

class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void obtenerInformacionPersonal() {
        super.obtenerInformacionPersonal();
        System.out.println("Especialidad: " + especialidad);
    }
}

class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    @Override
    public void obtenerInformacionPersonal() {
        super.obtenerInformacionPersonal();
        System.out.println("Deporte: " + deporte);
    }
}

public class TareaRepositorio {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Carlos", 40, "Cardiología");
        Deportista deportista1 = new Deportista("Ana", 25, "Natación");

        System.out.println("Información del Doctor:");
        doctor1.obtenerInformacionPersonal();
        System.out.println();

        System.out.println("Información del Deportista:");
        deportista1.obtenerInformacionPersonal();
    }
}
