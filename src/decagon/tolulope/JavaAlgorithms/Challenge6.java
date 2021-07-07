package decagon.tolulope.JavaAlgorithms;

class Challenge6 {

    public static void main(String[] args) {
        System.out.println(maskify("5512103073210694"));
    }
    public static String maskify( String cc ) {
        if(cc.length()>4){
            String[] word = cc.split("");
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < word.length-4; i++){
                sb.append("#");
            }
            return sb+cc.substring(cc.length()-4);
        }else{
            return cc;
        }
    }
}
