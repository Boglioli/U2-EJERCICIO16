public class SalaCine {
    private Butaca[][] butacas;

    public SalaCine(int filas, int columnas) {
        butacas = new Butaca[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String fila = String.valueOf((char) ('A' + i));
                butacas[i][j] = new Butaca(fila, j + 1, true);
            }
        }
    }

    public void bloquearButacas(String[] codigosButacas) {
        for (String codigo : codigosButacas) {
            for (int i = 0; i < butacas.length; i++) {
                for (int filas = 0; filas < 3; filas++) {
                    for (int columnas = 0; columnas < 5; columnas++) {
                        if (butacas[filas][columnas].getFila().equals(codigo)) {
                            butacas[filas][columnas].bloquear();
                            if (butacas[filas][columnas].getFila().equals(codigo)) {
                                butacas[filas][columnas].bloquear();
                                System.out.println("butaca " + codigosButacas[i] + " no esta disponible");
                            }
                        }
                    }
                }
            }
        }
    }
        public void mostrarEstado() {
            System.out.println("estado de la sala");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(butacas[i][j].getFila() + ": ");
                    if(butacas[i][j].estaDisponible()) {
                        System.out.println("disponible");
                    } else {
                        System.out.println("no disponible");
                    }
                }
                System.out.println();
            }
        }
    }

