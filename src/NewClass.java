public class NewClass {

    private static NewClass newClass;
    public static void main(String[] args) {

        method();
       // boolean b = newClass.equals(null);

    }

    public static void method ()
    {
        try {
            int x = 0;
            int y = 0;
            y=  x/0;
        } catch (ArithmeticException e)
        {
            System.out.println("error");
        }
        try{
            int [] array = {0,1,2,3};
            System.out.println(array[6]);
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println("error!");
        } finally{
            System.out.println("message");
        }
        try{
            boolean b = newClass.equals(null);
        } catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}