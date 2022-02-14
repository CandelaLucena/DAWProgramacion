public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer70 music = new MusicOrganizer70();

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