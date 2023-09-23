public class Leche extends DecoradorIngredientes {
    public Leche(Bebida bebida) {
        super(bebida);
        descripcion = bebida.obtenerDescripcion() + ", Leche";
        costo = bebida.calcularCosto() + 0.5;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
