public class Canela extends DecoradorIngredientes {
    public Canela(Bebida bebida) {
        super(bebida);
        descripcion = bebida.obtenerDescripcion() + ", Canela";
        costo = bebida.calcularCosto() + 0.25;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
