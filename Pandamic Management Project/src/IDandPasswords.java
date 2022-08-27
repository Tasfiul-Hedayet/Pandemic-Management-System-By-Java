
import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    IDandPasswords(){      
        logininfo.put("tasfiul", "12345");
        logininfo.put("Abir", "abir1234");
        logininfo.put("Team 3's Project", "3");
    }
    
    public HashMap getLoginInfo(){
        return logininfo;
    }
}