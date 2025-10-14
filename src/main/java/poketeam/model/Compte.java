package poketeam.model;


public class Compte {

    private int id;

    private String login;

    private String password;

    private transient boolean connecte;

    public Compte() {}

    public Compte(String login, String password) {
        this.login = login;
        this.password = password;
        this.connecte = false;
    }

    public boolean seConnecter(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            this.connecte = true;
            return true;
        }
        return false;
    }

    public void seDeconnecter() {
        this.connecte = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 
    public boolean isConnecte() {
        return connecte;
    }

    public void setConnecte(boolean connecte) {
        this.connecte = connecte;
    }

    @Override
    public String toString() {
        return "Compte [id=" + id + ", login=" + login + ", connecte=" + connecte + "]";
    }
}
