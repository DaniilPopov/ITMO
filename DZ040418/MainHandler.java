package DZ040418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainHandler implements mainInterface {
    @Override
    public void read(String path) {

    }

    @Override
    public void write(String path) {

    }

    public abstract static class Handler {
        protected String file;

        protected Handler(String file) {
            this.file = file;
        }

        public static Handler getInstace(String file) {
            if (file.endsWith(".json")) {
                return JsonHandler(String file);
            } else {
                return XmlHandler(String file);
            }

        }

        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();

            MainHandler mh;
            mh = MainHandler.Handler(String file);

            mh.read(String file);
            mh.write(String file);

        }
    }
}