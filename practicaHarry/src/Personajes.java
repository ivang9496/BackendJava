public class Personajes {
    public static void main(String[] args) {
        DatosPersonajesHP();
    }

    public static void DatosPersonajesHP(){

        DatosPersonaje Harry = new DatosPersonaje(01,"hary Potter","Masculino","Gryffindor","Dementor","Ciervo","Acebo");
        DatosPersonaje Hermione = new DatosPersonaje(02,"Hermione Granger","Femenino","Gryffindor","La profesora McGonagall","Nutria","Fibra de corazón de dragón");
        DatosPersonaje Cedric = new DatosPersonaje(03,"Cedric Diggory","Masculino","Hufflepuff","Desconocido","Desconocido","Fresno, 30.5 cm, pelo de unicornio, flexible.");
        DatosPersonaje Dumbledore = new DatosPersonaje(04,"Albus Dumbledore","Masculino","Gryffindor","El cuerpo de su hermana Ariana","Fénix","38'1 cm, Saúco, núcleo de pelo de cola de Thestral");
        DatosPersonaje Luna = new DatosPersonaje(05,"Luna Lovegood","Femenino","Ravenclaw","Ver morir a su padre","Liebre","Desconocida");


        System.out.println(Harry.showMessage());
        System.out.println(Hermione.showMessage());
        System.out.println(Cedric.showMessage());
        System.out.println(Dumbledore.showMessage());
        System.out.println(Luna.showMessage());
    }
}
