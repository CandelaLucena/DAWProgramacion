public class SillaTest {
    public static void main(String[] args) {
        Silla s1 = new Silla();
        //Silla s2 = new Silla();

        // s1.comodidad = 4; No se puede acceder porque esta privado
        System.out.println(s1.getComodidad());
        s1.setComodidad(4);
        s1.setNumPatas(2000);

        
    }
}
