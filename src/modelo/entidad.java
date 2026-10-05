package Trabajo_Final_POO_2026.src.modelo;

public abstract class entidad {
    protected int x; 
    protected int y; 
    protected int vida;
    protected int vidaMax;
    protected boolean estaVivo;

    public entidad(int x, int y, int vida) {
        this.x = x;
        this.y = y;
        this.vida = vida;
        this.vidaMax = vida;
        this.estaVivo = true;
    }

    public void recibirDaño(int danio) {
        this.vida -= danio;
        if (this.vida <= 0) {
            this.vida = 0;
            this.estaVivo = false;
        System.out.println("haz muerto.");
        }
    }
      
    public void activarRegeneracion() 
}
