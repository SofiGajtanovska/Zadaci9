import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vraboten> v = new ArrayList<Vraboten>();

        v.add(new Vraboten("Стефан", "Стефановски", "10000"));
        v.add(new Vraboten("Александар", "Ристевски", "15000"));

        XML xml = new XML();
        xml.createXMLFile("File.xml", v);
    }
}
