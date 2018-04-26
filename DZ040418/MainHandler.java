package DZ040418;

public class MainHandler implements mainInterface {
    @Override
    public void read(String path) {

    }

    @Override
    public void write(String path) {

    }

//    public abstract static class Handler{
//        protected String fileName;
//        protected Handler(String fileName){
//            this.fileName = fileName;
//        }
//
//        public static Handler  getInstace(String fileName) {
//            if (fileName.endsWith(".json")) {
//                return JsonHandler(String fileName);
//            } else {
//                return XmlHandler(String fileName);
//            }
//        }
//
//        public static void main(String[] args) throws IOException {
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String fileName = reader.readLine();
//
//            MainHandler mh;
//            mh = MainHandler.Handler(String fileName);
//
//            mh.read(String fileName);
//            mh.write(String fileName);
//
//        }
//    }
}