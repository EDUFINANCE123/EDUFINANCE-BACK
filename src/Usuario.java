public class Usuario {
    private String username,nombre,email,password;


    public Usuario(String username, String nombre, String email, String password) {
        this.username = username;
        this.nombre = nombre;
        this.email = email;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }




    public void setUsername(String username) {
        this.username = username;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void ingresarDatos(){

    }
}
