package homeworks;

public class UserObject {

    /*
    Create a class with constructor to create below objects.
    Attributes: fullName, username, password, id

    User user1=new User("John Doe","john.doe","abc",10);
    User user2=new User("Patel Harsh","patel.harsh","123abc",11);
    User user3=new User("Kim Yan","kim.yan","admin",12);
    User user4=new User("Brad Pitt","brad.pitt","abcdef",13);
    User user5=new User("David Clark","david.clark","123456",14);

    User[] users={user1,user2,user3,user4,user5};

    1. Print full names of users that has even userId number
    2. Print full names for those who has first name less than 4 letters.
    3. Print All details of each user as below.
    Full name: John Doe
    Username: john.doe
    Password: abc
    UserId: 10
     */

    String fullName;
    String userName;
    String password;
    int id;

    public String work(){
        return fullName + " is working";
    }

    public UserObject(String fullName, String userName, String password, int id){
        this.fullName=fullName;
        this.userName=userName;
        this.password=password;
        this.id=id;
    }
    public String toString(){
        return "Full name: "+fullName+"\nUsername: "+userName+"\nPassword: "+password+"\nUserId: "+id;
    }
}
