package Solid.singleResponsibilityPrinciple;

public class CalculateService {
    public void Calculate(Worker worker){
        if(worker.getGrade() >55){
            worker.setSalary(20000);
        } else {
            worker.setSalary(5000);
        }
    }

}
