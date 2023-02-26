package observer.jobagency;

// Ќаблюдатель, он будет получать уведомлени€
// ¬ данном случае это человек, ищущий работу, получает уведомлени€ от рекрутинговского агенства
public interface Observer {
    void receiveOffer(String nameCompany, int salary);
}
