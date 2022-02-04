public class OrdenadorTecladoTest {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("rojo", 60, "por cable", "es", "extendido");
        System.out.println(teclado1.getColor());
        System.out.println(teclado1.getNumTeclas());
        System.out.println(teclado1.getConectividad());
        System.out.println(teclado1.getIdioma());
        System.out.println(teclado1.getFormato());

        System.out.println(Teclado.getContadorTeclados());
    }
}