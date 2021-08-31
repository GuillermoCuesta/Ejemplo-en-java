package models.Dinosaurios;

import models.Dinosaurio;

public class TRex extends Dinosaurio {

    private double longitud_manos;

    public TRex(String especie, double altura, String alimentacion, double longitud_manos) {
        super(especie, altura, alimentacion);
        this.longitud_manos = longitud_manos;
    }

    public double getLongitud_manos() {
        return longitud_manos;
    }

    public void setLongitud_manos(double longitud_manos) {
        this.longitud_manos = longitud_manos;
    }
}
