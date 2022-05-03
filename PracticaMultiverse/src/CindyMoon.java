import imonsh.Colors;
import imonsh.Screen;

public class CindyMoon extends Spiderman implements CindySkills{

    public CindyMoon(String nombre, String alias, String genero, String universo, String ocupacion) {
        super(nombre, alias, genero, universo, ocupacion);
    }

    @Override
    public void fuerzaSuperHumana(Screen m) {
        m.setVisible(true);
        m.out("\nTiene una Extraordinaria Fuerza superior a la de un humano normal\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/C_Fuerza.jpeg");
        m.out("\n");
    }

    @Override
    public void velicidadSuperHumana(Screen m) {
        m.setVisible(true);
        m.out("\nUna de las personas que mas velozmente se mueven dentro del universo de marvel\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/C_Velocidad.jpeg");
        m.out("\n");
    }

    @Override
    public void agilidadSuperHumana(Screen m) {
        m.setVisible(true);
        m.out("\nFlexibilidad corporal muy superior a la de una persona ordinaria\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/C_Agilidad.jpeg");
        m.out("\n");
    }

    @Override
    public void telaranaOrganica(Screen m) {
        m.setVisible(true);
        m.out("\nLanza telarañas desde la punta de sus dedos\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/C_Tela.png");
        m.out("\n");
    }

    @Override
    public void hiperSentidoAracnido(Screen m) {
        m.setVisible(true);
        m.out("\nSentido clarividente que le advierte cuando esta en peligro\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/C_Sentido.jpeg");
        m.out("\n");
    }

    @Override
    public void trepaMuros(Screen m) {
        m.setVisible(true);
        m.out("\nAtraccion entre las superficies y las extremidades de cindy\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/C_trepamuros.jpeg");
        m.out("\n");
    }

    @Override
    public void garrasRetractiles(Screen m) {
        m.setVisible(true);
        m.out("\nGarras retractiles en los dedos que le permiten cortar\n", "Helvetica", 28, Colors.FussionRed);
        m.showImage("/Users/sleepy/Documents/Curso Fullstack/BackendJava/src/img/C_garras.jpeg");
        m.out("\n");
    }
}
