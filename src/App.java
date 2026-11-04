public class App {
    public static void main(String[] args) {

        Vuelo vuelo1 = new Vuelo("AV9401", "Bogotá", "Medellín", 5);
        vuelo1.mostrarInfo();

        vuelo1.embarcar("A1");
        vuelo1.embarcar("A3");
        vuelo1.embarcar("A5");

        vuelo1.embarcar("A1");

        System.out.println();

        vuelo1.mostrarAsientos();

        vuelo1.desembarcar("A3");

        vuelo1.mostrarAsientos();

    }
}
