
public class Customer
{
    private String firstName;
    private String lastName;
    private int age;
    private String mobilePhone;

    public Customer() {
        this.firstName = "";
        this.lastName = "";
        // this.firstName = "Unknown";
        // this.lastName = "Unknown";
        this.age = 0;
        this.mobilePhone = "";
    }
    
    public Customer(String firstName, String lastName, int age, String mobilePhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobilePhone = mobilePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " Age:" + age + " Mobile Phone:" + mobilePhone;
    }
}
