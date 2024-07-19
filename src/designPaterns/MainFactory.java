package designPaterns;

public class MainFactory {

    public static void main(String[] args) {
        PlanFactory pf = new PlanFactory();
        Plan dp = pf.createPlan("Domestic");
        dp.getRate();
        dp.calculateBill(10);


        Plan cp = pf.createPlan("Commercial");
        cp.getRate();
        cp.calculateBill(10);

        Plan in = pf.createPlan("Institutional");
        in.getRate();
        in.calculateBill(10);


    }

}
