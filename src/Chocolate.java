public class Chocolate extends DecoradorIngredientes {
    public Chocolate(Bebida bebida) {
        super(bebida);
        descripcion = bebida.obtenerDescripcion() + ", Chocolate";
        costo = bebida.calcularCosto() + 0.75;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
