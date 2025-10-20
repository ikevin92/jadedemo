package Agentes;

import jade.core.Agent;

public class Oficial extends Agent{
    @Override
    protected void setup() {
        System.out.println("Hola, soy " + getLocalName());
    }
}
