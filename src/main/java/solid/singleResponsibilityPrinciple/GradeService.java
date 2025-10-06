package solid.singleResponsibilityPrinciple;

public class GradeService {
    public void workerGrade (Worker worker) {
        worker.setGrade(worker.getGrade() + 66);
    }
}
