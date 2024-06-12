package homeworks;

public class UserObject2 {

    public static void main(String[] args) {

        UserObject user1 = new UserObject("John Doe","john.doe","abc",10);
        UserObject user2 = new UserObject("Patel Harsh","patel.harsh","123abc",11);
        UserObject user3 = new UserObject("Kim Yan","kim.yan","admin",12);
        UserObject user4 = new UserObject("Brad Pitt","brad.pitt","abcdef",13);
        UserObject user5 = new UserObject("David Clark","david.clark","123456",14);

        UserObject[] users={user1,user2,user3,user4,user5};
        System.out.println("Full names of users with even idNum");
        for (UserObject user : users){
            if (user.id%2==0){
                System.out.println("Full name: "+user.fullName);
            }
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Users with first names with less than 4 letters");
        for (UserObject user : users){
            String[] fName = user.fullName.split(" ");
            if (fName[0].length()<4) System.out.println(user.fullName);
        }
        System.out.println("----------------------------------------------------------");
        for (UserObject user : users){
            System.out.println(user);
            System.out.println("------------------------");
        }


    }
}
