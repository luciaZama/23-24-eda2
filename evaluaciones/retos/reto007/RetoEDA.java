package evaluaciones.retos.reto007;

public class RetoEDA {
    private Baraja baraja;

    public static void main(String[] args) {

        Baraja baraja = new Baraja();

        //
            
        //
        Carta carta;
        do {
            carta = baraja.sacar();
            carta.voltear();
            carta.mostrar();
        } while (!baraja.vacia());
    }
}
