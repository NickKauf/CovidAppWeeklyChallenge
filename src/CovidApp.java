import java.util.Scanner;
import java.util.ArrayList;

public class CovidApp {
    public static void main(String[] args){
        String formName;
        String formEmail;
        String formPhone;
        String formCity;
        String formState;
        String formSymptomHas;
        int formSymptomDays;
        String formContactName;
        String formContactEmail;
        String formContactPhone;
        boolean noSymptoms = false;
        boolean noContact = false;
        ArrayList<String> covidSymptoms = new ArrayList<>();
        Scanner kb = new Scanner(System.in);


        covidSymptoms.add("Fever");
        covidSymptoms.add("Cough");
        covidSymptoms.add("Shortness of breath or difficulty breathing");
        covidSymptoms.add("Tiredness");
        covidSymptoms.add("Aches");
        covidSymptoms.add("Chills");
        covidSymptoms.add("Sore Throat");
        covidSymptoms.add("Loss of smell");
        covidSymptoms.add("Loss of taste");
        covidSymptoms.add("Headache");
        covidSymptoms.add("Diarrhea");
        covidSymptoms.add("Severe Vomiting");



        do{
            Report report = new Report();
            System.out.println("Contact Tracing Program\nEnter a newly infected person's information:");
            System.out.println("What is the patient's name?");
            formName = kb.nextLine();
            System.out.printf("What is the %s's phone\n", formName);
            formPhone = kb.nextLine();
            System.out.printf("What is the %s's email?\n", formName);
            formEmail = kb.nextLine();
            System.out.printf("What city does %s live in?\n", formName);
            formCity = kb.nextLine();
            System.out.printf("What state does %s live in?\n", formName);
            formState = kb.nextLine();


            for(String symptom : covidSymptoms){
                System.out.printf("Does %s have %s? y/n\n", formName, symptom);
                formSymptomHas = kb.nextLine();
                if(formSymptomHas.equalsIgnoreCase("y")){
                        System.out.printf("How many days has %s had %s for?\n", formName, symptom);
                        formSymptomDays = kb.nextInt();
                        kb.nextLine();
                        Symptom newSymptom = new Symptom();
                        newSymptom.setDays(formSymptomDays);
                        newSymptom.setName(symptom);
                        report.addToSymptoms(newSymptom);
                    }
                else{
                    continue;
                }
            }

            if(report.getSymptomsList().size() < 1){
                noSymptoms = true;
            }
            else{

            }

            System.out.printf("Symptom check complete. next question:\nhas %s been in contact with anyone? y/n\n", formName);
            if(kb.nextLine().equalsIgnoreCase("y")){
                do{
                    System.out.println("What is the contact's name?");
                    formContactName = kb.nextLine();
                    System.out.println("What is the contact's email?");
                    formContactEmail = kb.nextLine();
                    System.out.println("What is the contact's phone?");
                    formContactPhone = kb.nextLine();
                    Contact newContact = new Contact();
                    newContact.setName(formContactName);
                    newContact.setEmail(formContactEmail);
                    newContact.setPhone(formContactPhone);
                    report.addToContacts(newContact);
                    System.out.printf("has %s been in contact with anyone else? y/n\n", formName);
                }while(kb.nextLine().equalsIgnoreCase("y"));
            }
            else{
                noContact = true;
            }

            if(noContact == true || noSymptoms == true){
                System.out.printf("%s either exhibited no symptoms or had no contact with anyone,\ntherefore, %s does not require contact tracing at this time\n", formName, formName);
            }
            else{
                report.setName(formName);
                report.setPhone(formPhone);
                report.setEmail(formEmail);
                report.setCity(formCity);
                report.setState(formState);
                report.printReport();
            }





            System.out.println("Start a new report? y/n");
        }while(kb.nextLine().equalsIgnoreCase("y"));







//      DEBUG TEST
//        report.setName("jane");
//        report.setEmail("jane@aol");
//        report.setPhone("1234567");
//        report.setCity("bergen");
//        report.setState("maine");
//
//        Contact contact = new Contact("bob","aol","1234567");
//        Symptom symptom = new Symptom("heavybreathing", 5);
//        report.addToContacts(contact);
//        report.addToContacts(contact);
//        report.addToSymptoms(symptom);
//        report.addToSymptoms(symptom);
//
//        report.printReport();
    }
}
