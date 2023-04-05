package event;

import event.observer.impl.Subscriber;
import event.publisher.impl.JobSite;

public class JobSearch {
    public static void main(String[] args) {

        JobSite jobSite = new JobSite();

        Subscriber ivan = new Subscriber("Ivan");
        Subscriber olga = new Subscriber("Olga");

        String vacancy1 = "Junior Python Developer";
        String vacancy2 = "Middle Python Developer";

        jobSite.addVacancy(vacancy1);
        jobSite.addVacancy(vacancy2);

        jobSite.add(ivan);
        jobSite.add(olga);

        String vacancy3 = "Senior Python Developer";
        jobSite.addVacancy(vacancy3);

        jobSite.removeVacancy(vacancy2);
    }
}
