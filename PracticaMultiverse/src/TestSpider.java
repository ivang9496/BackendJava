import imonsh.Colors;
import imonsh.Screen;

public class TestSpider {
    public static void main(String[] args) {
        spiderverse();
    }

    public static void spiderverse(){
        Screen spider = new Screen();
        spider.setBounds(200, 100, 1100, 900);
        spider.out(">>>>>>>>>>SPIDERVERSE<<<<<<<<<<", "Helvetica", 30, Colors.BoyZone);

        Miles miles = new Miles(
                "Miles Morales",
                "Spider Boy",
                "Masculino",
                "Tierra 1610",
                "Estudiante de ciencias"
        );
        spider.out("\n\n");
        spider.out(miles.showmessage(), "Helvetica", 28, Colors.FussionRed);
        miles.fuerzaSobreHumana(spider);
        miles.agilidadSobreHumana(spider);
        miles.reflejoSobreHumano(spider);
        miles.resistenciaSobreHumana(spider);
        miles.durabilidadSobreHumana(spider);
        miles.treparMuros(spider);
        miles.sentidoAracnido(spider);
        miles.rayoVenenoso(spider);
        miles.explosionEnergia(spider);
        miles.camuflajeAracnido(spider);
        miles.lanzaRedes(spider);

        CindyMoon cindy = new CindyMoon(
                "Cindy Moon",
                "Slik",
                "Femenino",
                "Tierra 616",
                "Reportera de Fact Channel"
        );
        spider.out("\n\n");
        spider.out(cindy.showmessage(), "Helvetica", 28, Colors.FussionRed);
        cindy.fuerzaSuperHumana(spider);
        cindy.velicidadSuperHumana(spider);
        cindy.agilidadSuperHumana(spider);
        cindy.telaranaOrganica(spider);
        cindy.hiperSentidoAracnido(spider);
        cindy.trepaMuros(spider);
        cindy.garrasRetractiles(spider);

        Gwen gwen = new Gwen(
                "Gwendolyne Maxine Stacy",
                "Ghost Spider",
                "Femenino",
                "Tierra 65",
                "Estudiante y baterista"
        );
        spider.out("\n\n");
        spider.out(gwen.showmessage(), "Helvetica", 28, Colors.FussionRed);
        gwen.fuerzaSobreHumana(spider);
        gwen.velocidadSobreHumana(spider);
        gwen.agilidadSobreHumana(spider);
        gwen.reflejosSobreHumanos(spider);
        gwen.telaranaOrganica(spider);
        gwen.sentidoAracnido(spider);
        gwen.trepaMuros(spider);

    }
}