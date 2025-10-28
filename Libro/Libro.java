
public class Libro {
    void DatosLibro() {
        System.out.println();
    }
}

class Datos extends Libro {
    String titulo;
    String autor;
    String genero;
}

class Informar extends Datos {
    public Informar(String autor, String titulo, String genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    void DatosLibro() {
        System.out
                .println("El titulo del libro es " + titulo + " escrito por " + autor + " para el genero de " + genero);
    }

}

class main {
    public static void main(String[] args) {
        Informar informar = new Informar("Edgar allan poe", "Noche altamar", "Suspenso");
        informar.DatosLibro();
    }
}