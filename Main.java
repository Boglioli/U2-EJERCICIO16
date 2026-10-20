public class Main {
    public static void main(String[]args) {
        SalaCine sala = new SalaCine(3, 5);
        PlataformaReserva plataforma = new PlataformaReserva(sala);
        String[] butacas = {"A1" , "A2" , "A3"};
        plataforma.realizarReserva(butacas);
        sala.mostrarEstado();
    }
}
