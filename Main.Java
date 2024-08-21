
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
        List<Float> notas = new ArrayList<>();
        notas.add(2.5f);
        notas.add(3.2f);
        notas.add(4.0f);
        notas.add(5.0f);
        notas.add(3.6f);
        notas.add(2.8f);
        notas.add(1.9f);
        notas.add(3.9f);
        notas.add(4.5f);
        notas.add(3.0f);
        notas.add(2.1f);
        notas.add(4.8f);
        notas.add(3.3f);
        notas.add(2.7f);
        notas.add(4.9f);

        Notas_Alumnos notasAlumnos = new Notas_Alumnos(notas);


        float mayorNota = notasAlumnos.calcularMayorNota();
        float porcentajeAprobados = notasAlumnos.calcularPorcentajeAprobados();
        float promedio = notasAlumnos.calcularPromedio();
        int posicionMenorNota = notasAlumnos.encontrarPosicionMenorNota();

        System.out.println("La mayor nota es: " + mayorNota);
        System.out.println("El porcentaje de aprobados es: " + porcentajeAprobados + "%");
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("La posición de la menor nota es: " + (posicionMenorNota + 1));
    }
}
