package Practicatask;

public class AccutingMeneger extends OfficeWorker {
    public AccutingMeneger(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Бухгалтер получил 50к");
    }
}
