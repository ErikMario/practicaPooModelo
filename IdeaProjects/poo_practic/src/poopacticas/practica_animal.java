package poopacticas;
import modelo.animal;

public class practica_animal {
    public static void main(String[] args) {
animal pez=new animal(false,2,"pequeño","aquatico");
animal perro=new animal(false,4,"mediano","canino");
animal murcielago=new animal(true,4,"mediano","mamifero");
//pez
        System.out.println(pez.getTamaño());
        System.out.println(pez.getTipo());
        System.out.println(pez.getNumeroExtremidades());
        System.out.println(pez.comer());
        System.out.println(pez.toString());
        System.out.println(pez.sonido());
        System.out.println(pez.moverse());
        //perro
        System.out.println(perro.getTipo());
        System.out.println(perro.getTamaño());
        System.out.println(perro.getNumeroExtremidades());
        System.out.println(perro.comer());
        System.out.println(perro.sonido());
        System.out.println(perro.moverse());
        System.out.println(perro.toString());

        //muercielago
        System.out.println(murcielago.toString());
        System.out.println(murcielago.getTipo());
        System.out.println(murcielago.comer());
        System.out.println(murcielago.getTipo());
        System.out.println(murcielago.sonido());
        System.out.println(murcielago.getTamaño());
        System.out.println(murcielago.getNumeroExtremidades());
    }
}
