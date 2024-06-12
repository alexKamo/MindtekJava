package methods;

public class MyMethods {
    public static void main(String[] args) {
        MyMethods same = new MyMethods();
        System.out.println(same.FirstAndLastEquals("java"));
        System.out.println(same.FirstAndLastEquals("mom"));
    }

    public boolean FirstAndLastEquals(String text){
        if(text.length()>0 && text!=null) {
            return text.charAt(0) == text.charAt(text.length() - 1);
        }
        return false;
    }

}
