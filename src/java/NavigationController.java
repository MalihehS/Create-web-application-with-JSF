
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "navigationController")
@RequestScoped
public class NavigationController {

    private String location;
    
   
    public NavigationController() {
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    


    
          
    public String navigate() {
        if(this.location.equals("Göteborg")){
         return "confirmation";
        }
        return "confirmation";
    }

   
}
