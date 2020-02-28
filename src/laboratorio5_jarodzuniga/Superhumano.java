
package laboratorio5_jarodzuniga;


public class Superhumano {
    protected String nombre;
    protected int edad;
    protected String planeta;
    protected double altura;

    public Superhumano() {
    }

    public Superhumano(String nombre, int edad, String planeta, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.planeta = planeta;
        this.altura = altura;
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
        return "Superhumano{" + "nombre=" + nombre + ", edad=" + edad + ", planeta=" + planeta + ", altura=" + altura + '}';
    }
    
}
