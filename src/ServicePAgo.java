import java.util.Scanner;

public class ServicePAgo implements AdapterPago{
    @Override
    public void usuario() {
        Scanner us = new Scanner(System.in);
        String usuario;
        String formaPAgo;
        String usuarioAdapter;
        System.out.print("Escribe la contraseña: ");
        usuario = us.nextLine();
        System.out.print("NOmbre de la empresa");
        formaPAgo = us.nextLine();
        usuarioAdapter = usuario + ":" + formaPAgo;
    }

    @Override
    public void password() {
        Scanner pass = new Scanner(System.in);
        String passwrord;
        System.out.print("Escribe la contraseña: ");
        passwrord = pass.nextLine();

    }
}
