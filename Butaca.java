public class Butaca {
    private String fila;
    private int numero;
    private boolean disponible;
    public Butaca(String fila, int numero, boolean disponible) {
        this.fila = fila;
        this.numero = numero;
        this.disponible = true;
    }
    public String getFila() {
        return fila + numero;
    }
    public boolean estaDisponible() {
        return disponible;
    }
    public void bloquear() {
        disponible = false;
    }
}
