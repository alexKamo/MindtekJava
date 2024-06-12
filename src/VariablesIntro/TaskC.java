package VariablesIntro;

public class TaskC {
    public static void main(String[] args) {

        int a=11;
        int b=12;
        int c=10;

        boolean answ1= ++a==b--;
        boolean answ2= ++c>--b;
        boolean answ3= b--<c++&&a++>++c;

        System.out.println(answ1);
        System.out.println(answ2);
        System.out.println(answ3);

        System.out.println("Total is " + --a +(a+c));
    }
}
