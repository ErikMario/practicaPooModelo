package modelo;

public class animal {
private String tipo;
private String tamaño;
private int numeroExtremidades;
private boolean vuela;

   //moversde comer y sonido
public String moverse(){return"el animal quiere moverse";}
    public String comer(){return "el animal come";}
    public String sonido(){return "maulla";}

    public animal(boolean vuela, int numeroExtremidades, String tamaño, String tipo) {
        this.vuela = vuela;
        this.numeroExtremidades = numeroExtremidades;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroExtremidades() {
        return numeroExtremidades;
    }

    public void setNumeroExtremidades(int numeroExtremidades) {
        this.numeroExtremidades = numeroExtremidades;
    }

    @Override
    public String toString() {
        return "animal{" +
                "tipo='" + tipo + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", numeroExtremidades=" + numeroExtremidades +
                ", vuela=" + vuela +
                '}';
    }
}




