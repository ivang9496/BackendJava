import imonsh.Colors;
import imonsh.Screen;

public class Gwen extends Spiderman implements GwenSkills {
    public Gwen(String nombre, String alias, String genero, String universo, String ocupacion) {
        super(nombre, alias, genero, universo, ocupacion);
    }

    @Override
    public void fuerzaSobreHumana(Screen m) {
        m.setVisible(true);
        m.out("\nLa fuerza de Gwen le permite levantar 10 toneladas de peso\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/G_Fuerza.jpeg");
        m.out("\n");
    }

    @Override
    public void velocidadSobreHumana(Screen m) {
        m.setVisible(true);
        m.out("\nSu factor de velocidad es varias decenas de veces más rapido que cualquier ser humano en perfectas condiciones físicas\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/G_corriendo.gif");
        m.out("\n");
    }

    @Override
    public void agilidadSobreHumana(Screen m) {
        m.setVisible(true);
        m.out("\nFlexibilidad corporal muy superior a la de una persona ordinaria\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/G_Agilidad.jpeg");
        m.out("\n");
    }

    @Override
    public void reflejosSobreHumanos(Screen m) {
        m.setVisible(true);
        m.out("\nPosee reflejos y movimientos que le permiten esquivar casi cualquier objeto que viaje a grandes velocidades\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/G_Reflejos.jpeg");
        m.out("\n");
    }

    @Override
    public void telaranaOrganica(Screen m) {
        m.setVisible(true);
        m.out("\nGwen puede generar telaraña de manera orgánica\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/G_tela.png");
        m.out("\n");
    }

    @Override
    public void sentidoAracnido(Screen m) {
        m.setVisible(true);
        m.out("\nPosee un sentido extrasensorial o sentido arácnido que le avisa de los potenciales peligros inmediatos\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/G_Sentido.jpeg");
        m.out("\n");
    }

    @Override
    public void trepaMuros(Screen m) {
        m.setVisible(true);
        m.out("\nGwen puede aferrarse a cualquier superficie utilizando sólo los dedos y los pies\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/G_trepamuros.jpeg");
        m.out("\n");
    }
}