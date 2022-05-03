import imonsh.Colors;
import imonsh.Screen;

public class Miles extends Spiderman implements MilesSkills{
    public Miles(String nombre, String alias, String genero, String universo, String ocupacion) {
        super(nombre, alias, genero, universo, ocupacion);
    }

    @Override
    public void fuerzaSobreHumana(Screen m) {
        m.setVisible(true);
        m.out("\nEs capaz de levantar 25 o mas toneladas de peso\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_fuerza.jpeg");
        m.out("\n");
    }

    @Override
    public void agilidadSobreHumana(Screen m) {
        m.setVisible(true);
        m.out("\nFlexibilidad corporal muy superior a la de una persona ordinaria\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_R_A.jpeg");
        m.out("\n");
    }

    @Override
    public void reflejoSobreHumano(Screen m) {
        m.setVisible(true);
        m.out("\nPuede esquivar casi cualquier objeto que viaje a grandes velocidades\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_R_A.jpeg");
        m.out("\n");
    }

    @Override
    public void durabilidadSobreHumana(Screen m) {
        m.setVisible(true);
        m.out("\nLe permite resistir ataques y daños fisicos que matarían a cualquier humano\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_durabilidad.jpeg");
        m.out("\n");
    }

    @Override
    public void resistenciaSobreHumana(Screen m) {
        m.setVisible(true);
        m.out("\nLe permite exigirse físicamente durante períodos más largos de tiempo antes de que la fatiga empiece a deteriorar su rendimiento físico\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_resistencia.jpeg");
        m.out("\n");
    }

    @Override
    public void treparMuros(Screen m) {
        m.setVisible(true);
        m.out("\nMiles puede aferrarse a cualquier superficie utilizando sólo los dedos y los pies\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_trepamuros.jpeg");
        m.out("\n");
    }

    @Override
    public void sentidoAracnido(Screen m) {
        m.setVisible(true);
        m.out("\nPreviene del peligro aún antes que este ocurra\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_Sentido.jpeg");
        m.out("\n");
    }

    @Override
    public void rayoVenenoso(Screen m) {
        m.setVisible(true);
        m.out("\nEl cuerpo de Miles posee una enorme cantidad de bio-energía que ha aprendido a canalizar y descargar para paralizar temporalmente a sus enemigos con tal solo tocarlos\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_Picadura.jpeg");
        m.out("\n");
    }

    @Override
    public void explosionEnergia(Screen m) {
        m.setVisible(true);
        m.out("\nPuede generar una fuerte explosión de energía capaz de derribar a quien este a su alrededor\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_Explo.jpeg");
        m.out("\n");
    }

    @Override
    public void camuflajeAracnido(Screen m) {
        m.setVisible(true);
        m.out("\nMiles, incluyendo su ropa, puede mezclarse con su entorno, lo que le permite acercarse sigilosamente a sus enemigos\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_camuflaje.jpeg");
        m.out("\n");
    }

    @Override
    public void lanzaRedes(Screen m) {
        m.setVisible(true);
        m.out("\nLos lanza-Telarañas que lleva en los puños expulsan una sustancia pegajosa que tiene múltiples utilidades, como forma de desplazamiento, arma, o pegamento\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/M_tela.jpeg");
        m.out("\n");
    }
}
