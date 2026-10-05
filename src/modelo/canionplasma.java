package Trabajo_Final_POO_2026.src.modelo;

import java.util.ArrayList;
import java.util.List;

public class canionplasma {
    
    private double bullletSpeed;
    private int damage;
    private int cooldownMax;
    private int cooldownActual;

    public canionplasma(String name, int demage, double bullletSpeed, int cooldownMax) {
        this.bullletSpeed = bullletSpeed;
        this.damage = 100;
        this.cooldownMax = cooldownMax;
        this.cooldownActual = 0;
    }

    @Override 
    public boolean attack (jugador jugador, Escenario escenario) {
        if (this.cooldownActual <= 0) {
            jugador.recibirDaño(this.damage);
            this.cooldownActual = this.cooldownMax;
            return true;
        } else {
            System.out.println("El cañon de plasma no está listo para disparar.");
            return false;
        }
    }

    public int getcooldownActual() {
        return cooldownActual;
    }
    public int getcooldownMax() {
        return cooldownMax;
    }
    
}
