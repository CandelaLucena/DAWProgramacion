import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class generarJson {
    public static void main(String[] args) {
        final Cliente cliente = new Cliente("08", "alo@gmail.com", "1234902192L", "Luis", "Gomez");
        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        final String prettyPrinting = prettyGson.toJson(cliente);
        System.out.println(prettyPrinting);
    }
}
