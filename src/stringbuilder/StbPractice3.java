package stringbuilder;

public class StbPractice3 {

       public String removeDup (String str){

           String[] wordss = str.split(" ");

           StringBuilder stb = new StringBuilder();

           //loop through each word in array
           for (int i = 0; i< wordss.length; i++){
               StringBuilder word = new StringBuilder();

               //looping through each character of word and storing unique chars
                 for (int a = 0; a<wordss[i].length(); a++){
                     if (word.indexOf(wordss[i].substring(a,a+1))==-1){
                         word.append(wordss[i].charAt(a));
                     }
                 }
                 stb.append(word).append(" ");
           }
           return stb.toString().trim();
       }

    public static void main(String[] args) {
        StbPractice3 mtd = new StbPractice3();
        System.out.println(mtd.removeDup("Java is my passion"));
    }


}

