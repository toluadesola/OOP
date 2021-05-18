package decagon.tolulope.JavaTests;

class DNA {
    public static String dnaComplement(String dna) {
        String[] input = dna.split("");
        StringBuffer sb = new StringBuffer();

        if(dna.length()==0){
            return "";
        }
        for(int i = 0; i < input.length; i++){
            if(input[i].equals("T")){
                sb.append("A");
            }else if(input[i].equals("A")){
                sb.append("T");
            }else if(input[i].equals("C")){
                sb.append("G");
            }else if(input[i].equals("G")){
                sb.append("C");
            }
        }
        return sb.toString();
    }
}
