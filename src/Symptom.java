public class Symptom {
    private int days;
    private String name;

    //constructors
    public Symptom(){

    }

    public Symptom(String name, int days){
        this.name = name;
        this.days = days;
    }
    //getters and setters


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //methods
    public String getSymptom(){
        return "had "+this.getName()+" for "+this.getDays()+" days.";
    }
}
