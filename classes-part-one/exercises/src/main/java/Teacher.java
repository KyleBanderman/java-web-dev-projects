public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    //setters
    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    public void setSubject(String aSubject) {
        subject = aSubject;
    }

    public void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }
}
