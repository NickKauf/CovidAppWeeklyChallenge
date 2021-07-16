import java.util.ArrayList;

public class Report {
    private String name;
    private String email;
    private String phone;
    private String city;
    private String state;
    private ArrayList<Symptom> symptomsList;
    private ArrayList<Contact> contactsList;

    //constructors
    public Report(){
        this.symptomsList = new ArrayList<Symptom>();
        this.contactsList = new ArrayList<Contact>();
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList<Symptom> getSymptomsList() {
        return symptomsList;
    }

    public void setSymptomsList(ArrayList<Symptom> symptomsList) {
        this.symptomsList = symptomsList;
    }

    public ArrayList<Contact> getContactsList() {
        return contactsList;
    }

    public void setContactsList(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }


    //methods
    public void printReport(){
        System.out.println("****CONTACT TRACING REPORT****");
        System.out.println("Name: "+name+"\nPhone: "+phone+"\nEmail: "+email+"\nCity: "+city+"\tState: "+state);
        System.out.println("===SYMPTOMS===");
        for(Symptom symptom : symptomsList){
            System.out.println(symptom.getSymptom()+"\n");
        }
        System.out.println("\n===CONTACTS===");
        for(Contact contact : contactsList){
            System.out.println(contact.getContact()+"\n");
        }

    }

    public void addToContacts(Contact contact){
       this.contactsList.add(contact);
    }

    public void addToSymptoms(Symptom symptom){
        this.symptomsList.add(symptom);
    }


}
