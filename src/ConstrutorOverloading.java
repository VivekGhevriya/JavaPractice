enum Department {
    QA, DEVOPS, DEVELOPER
}

public class ConstrutorOverloading {

    String employeeName;
    int salary;
    String employeeId;
    Department dep;

    public ConstrutorOverloading(String employeeName, int salary, String employeeId, Department dep) {
        this(employeeName, employeeId, salary);
        this.dep = dep;
    }

    public ConstrutorOverloading(String employeeName, String employeeId, int salary) {
        this(employeeName, employeeId);
        this.salary = salary;
    }

    public ConstrutorOverloading(String employeeName, String employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public void details() {
        System.out.println(employeeName + " " + employeeId + " " + salary + " " + dep);
    }
}
