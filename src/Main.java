public class Main {
    public static void main(String[] args) {

        //Codigo que se repetira "n" numero de veces
        //Una condicion de repeticion que tenga un fin determinado
        //Tipos de bucles:
        //While: evalua la condicion primero
        //Do-While: ejecuta y luego evalua la condicion
        //For: ejecuta por n cantidad de veces una fraccion de codigo

        int edad = 0;
        //Primero evalua la condicion, luego ejecuta
        while (edad > 0) {
            edad = edad - 1;
            System.out.println("Hello world!");
        }
        //Primero ejecuta 1 vez, y luego evalua la condicion
        do{
            edad = edad - 1;
            System.out.println("Hello world!");
        } while (edad > 0);
    }
}