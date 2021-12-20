public class Main {
    public static void main(String[] args) {
        Vraboten vraboten = new Vraboten();
        vraboten.setIme("Стефан");
        vraboten.setPrezime("Стефановски");
        vraboten.setPlata("10000");

        XML xml = new XML();
        xml.createXMLFile("File.xml", vraboten);
    }
}
