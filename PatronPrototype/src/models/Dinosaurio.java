package models;

public abstract class Dinosaurio implements Cloneable {
    private String especie;
    private double altura;
    private String alimentacion;

    public Dinosaurio(String especie, double altura, String alimentacion) {
        this.especie = especie;
        this.altura = altura;
        this.alimentacion = alimentacion;
    }

    @Override
    public Dinosaurio clone() {
        try {
            return (Dinosaurio) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
}
