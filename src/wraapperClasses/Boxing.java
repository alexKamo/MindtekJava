package wraapperClasses;

public class Boxing {

    // AUTOBOXING CONVERTING
    int num = 5;
    // convert primitive to Wrapper
    Integer numWrapper = num;

    // UNBOXING
    Integer number = 10;
    // Wrapper -> Primitive;
    int numPrimitive = number;

    // Convert string number to integer numbers
    String str = "54898";
    int strNum = Integer.parseInt(str);

    String value = "123";
    // String -> int ===> parseInt();
    int strValue = Integer.parseInt(value);
    // String -> Integer ====> valueOf();
    Integer strValue2 = Integer.valueOf(value);


}

