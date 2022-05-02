

public class DatosPersonaje {
    private int  id;
    private String nombre;
    private String genero;
    private String casa;
    private String boggart;
    private String patronus;
    private String varita;



    public DatosPersonaje(int id,String nombre, String genero, String casa, String boggart, String patronus, String varita){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
        this.varita = varita;
    }
    public  int getId(){ return id;}
    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getCasa(){  return casa;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }
    public String getMaritalStatus(){  return varita;  }


    public boolean setid(int id){
        if(id>0){
            this.id=id;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        } return false;

    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setboggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus= patronus;
            return true;
        }else
            return false;
    }

    public boolean setvarita(String varita){
        if(!varita.isEmpty()){
            this.varita = varita;
            return true;
        }else
            return false;
    }



    public String showMessage(){
        return
                "        CARACTERISTICAS \n"+
                        "ID: "+id+"\n"+
                        "Nombre: "+nombre+"\n"+
                        "Genero: "+genero+"\n"+
                        "Casa: "+casa+"\n"+
                        "Boggart: "+ boggart +"\n"+
                        "Patronus: "+patronus+"\n"+
                        "Varita: "+varita+"\n";

    }











}
