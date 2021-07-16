public class Contact {
    private String name;
    private String email;
    private String phone;

    //constructors
    public Contact(){

    }

    public Contact(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
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

    //methods
    public String getContact(){
        return "Name: "+this.getName()+"\nEmail:"+this.getEmail()+"\nPhone: "+this.getPhone();
    }
}
