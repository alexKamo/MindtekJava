package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeList {


    public static void main(String[] args) {

        List<String> companies = new ArrayList<>(List.of("Google","Meta","Mindtek","Apple","Tesla","Netflix","Amazon"));

        System.out.println(companies);

        //without looping find the order number of amazon in list\

        System.out.println("Order number of Amazon: "+(companies.indexOf("Amazon")+1));

        // Replace companies that starts with letter 'N' with Microsoft

//        for (int i = 0; i<companies.size(); i++){
//            if (companies.get(i).startsWith("N")){
//                companies.set(i,"Microsoft");
//            }
//        }
        for (String c : companies){
            if (c.startsWith("N")){
                companies.set(companies.indexOf(c),"Microsoft");
            }
        }
        System.out.println(companies);
        System.out.println("====================================");

        // remove companies that has 5 chars
        for (int i = 0; i< companies.size(); i++) {
            if (companies.get(i).length()==5) {
                companies.remove(companies.get(i));
                i--;
            }

        }
        System.out.println(companies);
        System.out.println("====================================");
        // concatenate a first and last char of each company and replace that with company name
        //[Google, Meta, Mindtek, Microsoft, Amazon]
        //[Ge, Ma, Mk, Mt, An]

        for (int i =0; i< companies.size(); i++){
            String chars = ""+ companies.get(i).charAt(0)+companies.get(i).charAt(companies.get(i).length()-1);
            companies.set(i,chars);
        }


    }

}
