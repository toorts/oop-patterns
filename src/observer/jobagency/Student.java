package observer.jobagency;

// �������, ��������� �� ����� ������, ������� ����� �������
public class Student implements Observer {
    String name;
    int salary;

    public Student(String name) {
        this.name = name;
        salary = 0;
    }

    // ������� ��������� ���� ��� �����
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < salary) {
            System.out.printf("Student %s: I need this work! (company, salary) = %s, %d%n", name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Student %s: I got better job! (company, salary) = %s, %d%n", name, nameCompany, salary);
        }
    }
}
