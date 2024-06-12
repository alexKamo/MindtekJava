package objects;

public class Company {

    public static void main(String[] args) {

        Employee emp = new Employee("John",101,true,'M');

        Employee emp2 = new Employee("Kim",102,false,'F');

        Employee emp3 = new Employee("Sahra",103,true,'F');

        Employee emp4 = new Employee("Rebeca",104,false,'F');

        Employee emp5 = new Employee("Li",105,false,'M');

        Employee[]  employees={emp,emp2,emp3,emp4,emp5};
        //Print names of employees whose names contains letter 'a', or 'e' and has id as even num
        for (Employee workers : employees){
            if ((workers.name.toLowerCase().contains("a"))||(workers.name.toLowerCase().contains("e")) && workers.id%2==0){
                System.out.println(workers.name);
            }
        }
        //Print last 3 chars of names of employees who works remotely

        for (Employee e : employees){
            if (e.isRemote && e.gender=='M' && e.name.length()>2){
                System.out.println(e.name.substring(e.name.length()-3));
            }
        }

    }




}
