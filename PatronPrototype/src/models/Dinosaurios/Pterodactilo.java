package models.Dinosaurios;

import models.Dinosaurio;

public class Pterodactilo extends Dinosaurio {

    private String color_alas;

    public Pterodactilo(String especie, double altura, String alimentacion, String color_alas) {
        super(especie, altura, alimentacion);
        this.color_alas = color_alas;
    }

    public String getColor_alas() {
        return color_alas;
    }

    public void setColor_alas(String color_alas) {
        this.color_alas = color_alas;
    }
}
