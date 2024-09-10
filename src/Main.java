import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);


        String username,nombre,email,password;



        System.out.println("Ingrese su nombre");
        nombre=in.nextLine();

        System.out.println("Ingres un Usuario");
        username=in.nextLine();

        System.out.println("Ingrese su e-mail");
        email=in.nextLine();

        System.out.println("Ingrese contraseña");
        password=in.nextLine();


       Usuario cliente1=new Usuario(username, nombre,email,password);


    }
}