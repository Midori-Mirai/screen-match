//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pelicula = "Matrix";
        System.out.println("Bienvenidos a Match Screen!");
        System.out.println(String.format("Pelicula: %s", pelicula));
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 7.0 + 9.1)/3.0;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio 
                Fue lanzada en: %d
                Esta pelicula se incluye en el plan básico
                La mayoría de los usuarios le dan una nota de: %.2f
                """.formatted(fechaDeLanzamiento,media);
        System.out.println(sinopsis);
        int clasificacionEstrellas = (int)(media /2);
        System.out.println(String.format("La pelicula de %s tiene %d estrellas",pelicula,clasificacionEstrellas));


    }
}