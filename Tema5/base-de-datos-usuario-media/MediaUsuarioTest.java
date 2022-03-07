public class MediaUsuarioTest {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Candela@gmail.com", "hola");
        Usuario usuario2 = new Usuario("Mario@gmail.com", "hola1");
        Usuario usuario3 = new Usuario("Luis@gmail.com", "hola2");
        usuario1.ficheroXML(usuario1);
        usuario2.ficheroXML(usuario2);
        usuario3.ficheroXML(usuario3);
    }
}
