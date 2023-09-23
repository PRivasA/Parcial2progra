public class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
        costo = 3.0;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}

