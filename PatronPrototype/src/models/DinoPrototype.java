package models;

import models.Dinosaurios.Pterodactilo;
import models.Dinosaurios.TRex;

import java.util.HashMap;

public class DinoPrototype {
    final HashMap<String, Dinosaurio> protos = new HashMap<String, Dinosaurio>();

    public DinoPrototype(){
        TRex fruna = new TRex("Holotype",5.87,"Carnivoro",0.06);
        Pterodactilo andres = new Pterodactilo("Cuvier",1.8,"Carnivoro","Rosado");

        protos.put("TRex",fruna);
        protos.put("Pterodactilo",andres);
    }

    public Object prototipo(String tipo){
        return protos.get(tipo).clone();
    }
}
