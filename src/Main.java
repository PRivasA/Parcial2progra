public class Main {
    public static void main(String[] args) {
        Bebida miBebida = new Cafe();
        miBebida = new Leche(miBebida);
        miBebida = new Chocolate(miBebida);

        System.out.println("Descripción de la bebida: " + miBebida.obtenerDescripcion());
        System.out.println("Costo total de la bebida: " + miBebida.calcularCosto());
    }
}
