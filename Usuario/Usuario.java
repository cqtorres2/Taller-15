package Usuario;

public class Usuario {
    String autotenticacion;
    String validacion;

    public void mensaje() {}
}

class Confirmar extends Usuario {

    public Confirmar(String autenticacion, String validacion) {
        this.autotenticacion = autenticacion;
        this.validacion = validacion;
    }

    @Override
    public void mensaje() {
        System.out.println(
                "El usuario es menor de edad? " + autotenticacion + " ¿el servicio fue realizado? " + validacion);
    }
}

class Main {
    public static void main(String[] args) {
        Confirmar confirmar = new Confirmar("Si, no es admitido para el servicio", "No, se han respetado las normas");
        confirmar.mensaje();
    }

}
