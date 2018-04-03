package DZ040418;

public class MainHandler {
    public static MainHandler getIntance(Handler handler) {
        switch (handler) {
            case Xml:
                return new XmlHandler();
            case Json:
                return new JsonHandler();
            case Txt:
                return new TxtHandler();

            default:
                return null;
        }
    }

    public static void main(String[] args) {

    }

    enum Handler {Xml, Json, Txt}
}
