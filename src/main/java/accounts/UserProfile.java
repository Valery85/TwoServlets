package accounts;

/**
 * Created by admin on 7/16/2016.
 */
public class UserProfile {

    private final String login;
    private final String password;

    public UserProfile(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserProfile(String login) {
        this.login = login;
        this.password = login;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return password;
    }}


