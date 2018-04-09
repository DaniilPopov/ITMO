package DZ040418;

import java.io.BufferedReader;

public class MainHandler implements mainInterface {
   public abstract static class Handler{
   protected String file;
   protected Handler(String file){
       this.file = file;
   }
   public static Handler getInstace(String file) {
    if (file.endsWith(".json")) return JsonHandler(String file);
    else retutn XmlHandler(String file);
   }
       
   public static void main(String[] args) {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    String file = reader.readLine();
    
    MainHandler mh;
    mh = MainHandler.Hendler(String file);
       
    mh.read(String file);
    mh.write(String file);
   }
}
