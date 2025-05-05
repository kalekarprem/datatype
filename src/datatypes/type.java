package datatypes;

public class type {
    public static void main(String[] args) {
        boolean b = true;
        int i = b ? 1 : 0;        
        float f = i;              
        long l = (long) f;        
        double d = l;             
        short s = (short) d;      

        System.out.println("Boolean to int: " + i);
        System.out.println("Int to float: " + f);
        System.out.println("Float to long: " + l);
        System.out.println("Long to double: " + d);
        System.out.println("Double to short: " + s);
    }
}
