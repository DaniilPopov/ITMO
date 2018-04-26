package exceptions;

public class TstExceptions {
    public static String getStr(String string) throws CheckedException {
        if (string.length() < 4) {
            throw new CheckedException("Слижком короткая строка");
        }
        return string;
    }

    public static void main(String[] args) {
        try {

            System.out.println(getStr("qw"));
        } catch (CheckedException e) {
            System.out.println(e.getMessage());
        }

    }
}
