package decagon.tolulope.JavaAlgorithms;

public class DRoot {
    public static void main(String[] args) {
//        System.out.println(digital_root(300));
        digital_root(300);
    }
    public static int digital_root(int n) {
        int add=0;
        while(n%10 > 0)
        {
            add = (n%10) +add;
            n = n/10;
            System.out.println(n);
        }
        System.out.println(add);
        if(add/10 > 0)
        {
            return digital_root(add);
        }
        return add;
    }
}
