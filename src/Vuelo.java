public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[] asientos;

    public Vuelo(){

    }
    public Vuelo (String numero, String origen, String destino) { 
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        capacidadMaxima = 0;
        asientos = new Asiento[0];
    }

    public Vuelo(String numero, String origen, String destino, int capacidadMaxima){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        asientos = new Asiento[capacidadMaxima];

        for(int i = 0; i < capacidadMaxima; i++){
            asientos[i] = new Asiento("A" + (i + 1));
        }
    }

    public void mostrarInfo() {
        System.out.println("---- Vuelo " + numero + " ----");
        System.out.println("Ruta: " + origen + " - " + destino);
        System.out.println("Capacidad: " + capacidadMaxima + " asientos");
        System.out.println();
    }

    public void mostrarAsientos() {

    System.out.println("Estado de asientos - Vuelo " + numero + ":");

    for (int i = 0; i < capacidadMaxima; i++) {
        asientos[i].mostrarEstado();
    }

    System.out.println();
}

    public void embarcar(String codigoAsiento) {

        for (int i = 0; i < capacidadMaxima; i++) {

            if (asientos[i].getCodigo().equals(codigoAsiento)) {
                asientos[i].ocupar();
                return;
            }
        }

        System.out.println("El asiento " + codigoAsiento + " no existe.");
    }


    public void desembarcar(String codigoAsiento) {

        for (int i = 0; i < capacidadMaxima; i++) {

            if (asientos[i].getCodigo().equals(codigoAsiento)) {
                asientos[i].liberar();
                return;
                
            }
        }

        System.out.println("El asiento " + codigoAsiento + " no existe.");
    }
    

}