
package laboratorio5_jarodzuniga;

import java.util.ArrayList;


public class Supervillano extends Superhumano{
    private boolean carcel;
    private int muertes;
    private ArrayList<Superpoderes> poderesvill = new ArrayList(3);

    public Supervillano() {
    }

    public Supervillano(boolean carcel, int muertes) {
        this.carcel = carcel;
        this.muertes = muertes;
    }

    public Supervillano(boolean carcel, int muertes, String nombre, int edad, String planeta, double altura) {
        super(nombre, edad, planeta, altura);
        this.carcel = carcel;
        this.muertes = muertes;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public ArrayList getPoderesvill() {
        return poderesvill;
    }

    public void setPoderesvill(ArrayList poderesvill) {
        this.poderesvill = poderesvill;
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
        return "Supervillano{" + "carcel=" + carcel + ", muertes=" + muertes + ", poderesvill=" + poderesvill + '}';
    }
}
