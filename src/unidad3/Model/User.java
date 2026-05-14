package unidad3.Model;

public class User {

    private int id;
    private String username;
    private String nombreCompleto;

    public User(int id, String username, String nombreCompleto) {
        this.id = id;
        this.username = username;
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

     public void setUsername(String username){
        this.username = username;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }


}