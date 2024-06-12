package ArrayList3May1416;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private static List<Job> jobs = new ArrayList<>();

    static {

    }

    public static List<Job> getJobs(){
        try {
            FileReader file = new FileReader("C:\\Users\\sasha\\IdeaProjects\\MindtekJava\\src\\ArrayList3May1416\\data.csv");
            BufferedReader br = new BufferedReader(file);

            String line;

            while ((line = br.readLine()) != null) {
                // line = President,AD_PRES,40000
                System.out.println(line);
                String[] data = line.split(",");

                //data will = {"President"},{"AD_PRES"},{"40000"};
                Job job = new Job(data[0], data[1], Integer.parseInt(data[2]));

                jobs.add(job);
            }
        }catch (IOException e){}
        return jobs;
    }





}
