package classwork_10;

public class User {
    String login;
    String password;
    
    User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    
    boolean checkPassword(String input) {
        return password.equals(input);
    }
}
