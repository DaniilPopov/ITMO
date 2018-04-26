package DZ270418;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileRead {

    // кодировка не работает! кодирует, но не модет разкодировать!
    private static byte[] encode(String text, String key) {
        byte[] txt = text.getBytes();
        byte[] keys = key.getBytes();
        byte[] co = new byte[text.length()];

        for (int i = 0; i < txt.length; i++) {
            co[i] = (byte) (txt[i] ^ keys[i % keys.length]);
        }
        return co;
    }

    private static String decode(byte[] text, String key) {
        byte[] res = new byte[text.length];
        byte[] keys = key.getBytes();

        for (int i = 0; i < text.length; i++) {
            res[i] = (byte) (text[i] ^ keys[i % keys.length]);
        }

        return new String(res, Charset.forName("UTF-8"));
    }

    public static void main(String[] args) throws IOException {

        FileRead fr = new FileRead();
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        fr.writeFile("TEST message", file1, true);

        String sb = new String(fr.readFile(file1).replaceAll(" ", ""));
        fr.writeFile(encode(sb, "key").toString(), file2, true);

        byte[] b = Files.readAllBytes(Paths.get(String.valueOf(file2)));
        System.out.println(decode(b, "key"));


    }

    private void writeFile(String str, File file, boolean append) throws IOException {

        try (OutputStream out = new FileOutputStream(file, append)) {
            byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
            out.write(bytes);
        }
    }

    private String readFile(File file) throws IOException {

        try (InputStream in = new BufferedInputStream(new FileInputStream(file));
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] bytes = new byte[512];
            int len;
            while ((len = in.read(bytes)) > 0) {
                baos.write(bytes, 0, len);
            }
            return new String(baos.toByteArray(), Charset.forName("UTF-8"));
        }
    }

}


/*
1) Скопировать файл
2) Разбить/склеить файл. Размер куска задается
3) Посмотрите самостоятельно и попробуйте реализовать:
a) Зашифровать/ дешифровать файл паролем (XOR)
b) Зашифровать/ дешифровать файл другим файлом
*/