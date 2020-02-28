/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5_jarodzuniga;

import java.util.ArrayList;

/**
 *
 * @author Rosa
 */
public class superheroe extends Superhumano{
    private int villanos;
    private ArrayList<Superpoderes> poderes = new ArrayList(3);

    public superheroe(int villanos) {
        this.villanos = villanos;
    }

    public superheroe(int villanos, String nombre, int edad, String planeta, double altura) {
        super(nombre, edad, planeta, altura);
        this.villanos = villanos;
    }

    public int getVillanos() {
        return villanos;
    }

    public void setVillanos(int villanos) {
        this.villanos = villanos;
    }

    public ArrayList getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList poderes) {
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "superheroe{" + "villanos=" + villanos + ", poderes=" + poderes + '}';
    }
}
