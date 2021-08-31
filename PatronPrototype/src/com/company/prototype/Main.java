package com.company.prototype;

import models.DinoPrototype;
import models.Dinosaurio;

public class Main {
    public static void main(String[] args) {
        DinoPrototype generator = new DinoPrototype();
        Dinosaurio fruna1 = (Dinosaurio) generator.prototipo("TRex");
        System.out.println(fruna1.getAltura());
    }
}
