package objects;

public class ComputersStore {

    public static void main(String[] args) {

        Computer comp1 = new Computer();
        comp1.brand="Apple iMac ";
        comp1.operatingSystem="MacOS";
        comp1.year=2022;
        comp1.isLaptop=false;

        Computer comp2 = new Computer();
        comp2.brand="Lenovo ";
        comp2.operatingSystem="Windows";
        comp2.year= 2017;
        comp2.isLaptop=true;

        Computer comp3 = new Computer();
        comp3.brand="Acer ";
        comp3.operatingSystem="Windows";
        comp3.year= 2023;
        comp3.isLaptop=true;

        Computer[] computers={comp1,comp2,comp3};
        for (int i = 0; i<computers.length; i++){
            if (computers[i].year%2==0) System.out.println(computers[i].brand + computers[i].year);
            // Print computer brand that has even number year
        }

        // Print comp brand of laptops that are Windows
        String opSys = "Windows";
        for (int a = 0; a<computers.length; a++){
            if (computers[a].isLaptop&&computers[a].operatingSystem.equals(opSys)) {
                System.out.println(computers[a].brand + computers[a].operatingSystem);
            }
        }
    }

}
