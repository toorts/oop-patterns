package observer.jobagency;

public class Main {

    // �������� ������ �����������, �������� Specialist, ������� ����� ��������� �� Company
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);

        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.printf("------------%d---------------%n", i + 1);
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}

