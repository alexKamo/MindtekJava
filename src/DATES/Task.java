package DATES;

public class Task {

    public static void main(String[] args) {

        String[] checkInAndCheckOut={"John Smith CI:24/02/21 CO:24/02/22",  "Patel Harsh CI:24/03/10 CO:24/10/24" ,
                "Kim Kardash CI:23/05/11 CO:24/06/19"};

        // Find out total month and days hotel had guest

        int totalDays = 0;
        int totalMonth = 0;

        for (String data : checkInAndCheckOut){
            String CI = data.substring(data.indexOf(":")+1, data.indexOf(" "));
            String CO = data.substring(data.lastIndexOf(":")+1);


        }
    }

}
