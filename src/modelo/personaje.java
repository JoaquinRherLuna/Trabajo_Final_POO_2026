package Trabajo_Final_POO_2026.src.modelo;

public class personaje extends entidad {
    private String nivel;
    private int zenny; 
    private int experiencia;
    
    private List<arma> armas;

    private static final int X_MIN = 0;
    private static final int X_MAX = 2;
    private static final int Y_MIN = 0;
    private static final int Y_MAX = 2;
    
    public personaje(int x, int y) {
        super(x, y, 100);
        this.nivel = 1;
        this.zenny = 0;
        this.experiencia = 0;
        this.armas = new ArrayList<>();

        armas.add(new arma("Espada laser", 10, "Cuerpo a cuerpo", 2));
        armas.add(new arma("cañon de plasma", 8, "A distancia", 3));
        armas.add(new arma("Baston", 12, "Curación", 4));
    }

    public void moverArriba() {
        if (y > Y_MIN) {
            y--;
        }
    }
    public void moverAbajo() {
        if (y < Y_MAX) {
            y++;
        }
    }
    public void moverIzquierda() {
        if (x > X_MIN) {
            x--;
        }
    }
    public void moverDerecha() {
        if (x < X_MAX) {
            x++;
        }
    }   

    public void usarArma(int indice) {
        if (indice >= 0 && indice < armas.size()) {
            arma armaSeleccionada = armas.get(indice);
            if (armaSeleccionada.estaLista()) {
                System.out.println("Usando arma: " + armaSeleccionada.getNombre());
                armaSeleccionada.usar();
            } else {
                System.out.println("El arma " + armaSeleccionada.getNombre() + " no está lista para usar.");
            }
        } else {
            System.out.println("Índice de arma inválido.");
        }
    }
}
