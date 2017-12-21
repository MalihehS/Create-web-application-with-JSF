
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@Named(value = "studentBean")
@RequestScoped
public class StudentBean {

    private String firstName;
    private String lastName;
    private int age;
    private String location;
    private Date date;
    
    @Inject
    private Subject subject;
    
    @Inject
    private NavigationController nav;

    public NavigationController getNav() {
        return nav;
    }

    public void setNav(NavigationController nav) {
        this.nav = nav;
    }
    
    public NavigationController getNavigationController(){
     return nav;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
   
    public StudentBean() {
        

    }

}
