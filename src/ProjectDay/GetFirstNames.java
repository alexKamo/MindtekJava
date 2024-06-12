package ProjectDay;

public class GetFirstNames {
    public static void main(String[] args) {
        String[] employees={"Steven King", "Neena Kochhar", "Alexander Hunold", "David Austin"};
        for (int i =0; i<employees.length; i++) {
            int index = employees[i].indexOf(" ");
            String name = employees[i].substring(0,index);
            System.out.println(name);
        }




    }
}
