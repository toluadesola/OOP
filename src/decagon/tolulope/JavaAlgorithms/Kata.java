package decagon.tolulope.JavaAlgorithms;

public class Kata {
    public static void main(String[] args) {
        System.out.println(broken("110"));
//        broken("001");
    }

    public static String broken(final String x) {
        // Your code here

        return x.replace("0", " ").replace("1", "0").replace(" ", "1");
    }
}
