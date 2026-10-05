package Trabajo_Final_POO_2026.src.modelo;

public class arma {
    private String nombre;
    private int poder;
    private String tipo;
    private int cooldownMax;
    private int cooldownActual;
    
    public arma (String nombre, int poder, String tipo, int cooldownMax) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
        this.cooldownMax = cooldownMax;
        this.cooldownActual = 0;
    }
    
    public boolean estaLista () {
        return cooldownActual <= 0;
    }

    public void usar() {
        this.cooldownActual = this.cooldownMax;
    }

    public void reducirCooldown() {
        if (this.cooldownActual > 0) {
            this.cooldownActual--;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public int getPoder() {
        return poder;
    }
    public String getTipo() {
        return tipo;
    }
    public int getCooldownMax() {
        return cooldownMax;
    }
    public int getCooldownActual() {
        return cooldownActual;
    }

    @Override 
    public String toString() {
        return "Arma: " + nombre + ", Poder: " + poder + ", Tipo: " + tipo + ", CM: " + cooldownMax + ", CD: " + cooldownActual;
    }
}

