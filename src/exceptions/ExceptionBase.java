package exceptions;

public class ExceptionBase {
    public static void tryException() {

        String str = null;
//        str.equals("string");  // NullPointerException

//        Integer.parseInt("hgrtres");  //NumberFormatException

//        throw  new  NumberFormatException("tryException");

        Object string = "90";
        int[] arr = new int[10];
        try {
            if (System.currentTimeMillis() % 2 == 0) {

                Integer integer = (Integer) string;
            } else {
                arr[10] = 90;
            }
        }
//        catch (ClassCastException e){
//            System.out.println("integer case: " + e.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("arr case: " + e.getMessage());
//        }
//        catch (ClassCastException | ArrayIndexOutOfBoundsException e){
//            System.out.println("case: " + e.getMessage());
//        }
//        catch (ClassCastException e){
//            System.out.println("integer case: " + e.getMessage());
//        }
        catch (RuntimeException e) {
            System.out.println("All RuntimeException: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("After try catch");

    }

    public static void tryExp2() { //throws Exception
        try {

            throw new Exception("Exception here"); // ошибка
        } catch (Exception e) {
            e.printStackTrace();
        }
//        throw  new Exception("Exception here"); // ошибка

    }

    public static void main(String[] args) {
//        tryException();
        tryExp2();
    }
}
