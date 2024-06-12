package arrays;

public class DuplicateFounder {

    public static void main(String[] args) {
        char[] symbols = {'A','$','h','H','y','#','*','@','k','$'};
        //find if symbols arr has dup values
        boolean dup = false;
        for(int i=0; i<symbols.length; i++){
            for (int j = i+1; j<symbols.length; j++) {
                if (symbols[i]==symbols[j]){
                    dup=true; break;
                }
            }
            if (dup)break;
        }
        if (dup) System.out.println("Duplicate found");
        else System.out.println("No duplicate found");
    }
}

