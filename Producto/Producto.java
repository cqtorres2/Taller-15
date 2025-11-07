package Producto;

public class Producto {
    void Mostrar(){};
}

class DatosProducto extends Producto {
    String nombreProducto;
    String secciónProducto;
    int precioProducto;
}

class Mensaje extends DatosProducto {
    public Mensaje(String nombreProducto, String secciónproducto, int precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.secciónProducto = secciónproducto;
    }

    @Override
    public void Mostrar() {
        System.out.println("El nombre del producto es " + nombreProducto + " se encuentra en la sección de "
                + secciónProducto + " con un costo total de " + precioProducto);
    }
}

class Main {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje("Cloro", "Limpieza", 1500);
        mensaje.Mostrar();
    }
}