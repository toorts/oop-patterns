package observer.jobagency;

// ��� ��������� �������� ������������
// �� ����� �������������� ������������, ����������� �� ���, � ��������� �� ���� ���������
public interface Publisher {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, int salary);
}
