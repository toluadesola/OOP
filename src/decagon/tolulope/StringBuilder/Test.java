package decagon.tolulope.StringBuilder;

public class Test {
    public static void main(String[] args)
    {
        String blogName = "How To Do In Java";

        StringBuilder reverseString = new StringBuilder(blogName).reverse();
        StringBuilder appendString = new StringBuilder(blogName).append(" Thank");

        System.out.println(reverseString);
        System.out.println(appendString);
    }
}
