package poketeam.model;

public class Compte {

    private String login;
    private String password;
    private boolean connecte;
    private String role; 


    public Compte(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.connecte = false;
    }


    public boolean seConnecter(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            this.connecte = true;
            System.out.println("Connexion réussie !");
            return true;
        } else {
            System.out.println("Identifiants incorrects.");
            return false;
        }
    }

    public void seDeconnecter() {
        this.connecte = false;
        System.out.println("Déconnexion effectuée.");
    }

   
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isConnecte() { return connecte; }
}
