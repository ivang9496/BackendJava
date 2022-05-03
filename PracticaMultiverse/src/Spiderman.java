public class Spiderman {
    String nombre, alias, genero, universo, ocupacion;

    public Spiderman(String nombre, String alias, String genero, String universo, String ocupacion) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.universo = universo;
        this.ocupacion = ocupacion;
    }

    public String getNombre(){  return nombre;  }
    public String getAlias(){  return alias;  }
    public String getGenero(){  return universo;  }
    public String getUniverso(){  return universo;  }
    public String getOcupacion(){  return ocupacion;  }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setAlias(String alias){
        if(!alias.isEmpty()){
            this.alias = alias;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setUniverso(String universo){
        if(!universo.isEmpty()){
            this.universo = universo;
            return true;
        } else
            return false;
    }

    public boolean setOcupacion(String ocupacion){
        if(!ocupacion.isEmpty()){
            this.ocupacion = ocupacion;
            return true;
        } else
            return false;
    }

    public String showmessage(){
        return
                "Nombre: " + nombre +
                        "\nAlias: " + alias +
                        "\nGenero: " + genero +
                        "\nUniverso: " + universo +
                        "\nOcupación: " + ocupacion + "\n\n";
    }
}