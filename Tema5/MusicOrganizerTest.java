public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer music = new MusicOrganizer();

        music.addFile("musica1");
        music.addFile("musica2");

        System.out.println(music.getNumberOfFiles());

        music.removeFile(1);

        System.out.println(music.getNumberOfFiles());

        music.removeFile(5);

        System.out.println(music.getNumberOfFiles());

        music.addFile("musica3");
        music.addFile("musica4");
    }
}
