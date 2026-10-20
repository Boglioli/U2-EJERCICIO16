public class PlataformaReserva {
    private SalaCine sala;
    public PlataformaReserva(SalaCine sala) {
        this.sala = sala;
    }
    public void realizarReserva(String[] codigosButacas) {
        System.out.println("solicitud de reserva:");
        sala.bloquearButacas(codigosButacas);
        sala.mostrarEstado();
    }
}
