package homeworks.exceptionRuntimeHM;

public class AgeValid {

    public void validateAge(int age) {
        if (age >= 0 && age <= 150) {
            System.out.println("Valid Age");
        } else {
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 150.");
        }
    }

    public static void main(String[] args) {
        AgeValid valid = new AgeValid();


        try {
            valid.validateAge(24);
            valid.validateAge(155);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}
