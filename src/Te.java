public class Te extends Bebida {
    public Te() {
        descripcion = "Té";
        costo = 3.5;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
