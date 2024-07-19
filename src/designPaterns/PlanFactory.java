package designPaterns;

public class PlanFactory {

    public Plan createPlan(String planType){
        if (planType.equalsIgnoreCase("Domestic")) return new DomesticPlan();
        if (planType.equalsIgnoreCase("Commercial")) return new CommercialPlan();
        if (planType.equalsIgnoreCase("Institutional")) return new InstitutionalPlan();
        return null;
    }

}
