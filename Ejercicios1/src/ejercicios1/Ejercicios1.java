package ejercicios1;

public class Ejercicios1 {

    public static void main(String[] args) {
        //Creó el objeto 1 para asignar los datos al usuario 1
        Estudiante e = new Estudiante();
        //Asignó datos al estduainte 1
        e.nombre= "Luisa";
        e.apellido = "Bermeo";
        e.numero_cedula = 112345123;
        e.domicilio = "San cayetano";
        e.edad = 17;
        //Presento en pantalla los datos asigandos 
        System.out.printf("Su nombre es: %s\n", e.nombre);
        System.out.printf("Su apellido es: %s\n", e.apellido);
        System.out.printf("Su numero de cédula  es: %d\n", e.numero_cedula);
        System.out.printf("Su domicilio es: %s\n", e.domicilio);
        System.out.printf("Su edad es: %d\n", e.edad);
        //Creo el objeto dos para asignar datos al objeto dos 
        Estudiante e1 = new Estudiante();
        //asigno valores al objeto 2
        e1.nombre = "José";
        e1.apellido = "López";
        e1.numero_cedula = 112235123;
        e1.domicilio = "Azuay y Bolivar";
        e1.edad = 15;
        //Presento en pantalla 
        System.out.println("-----------------------------------------------");
        System.out.printf("Su nombre es: %s\n", e1.nombre);
        System.out.printf("Su apellido es: %s\n", e1.apellido);
        System.out.printf("Su numero de cédula  es: %d\n", e1.numero_cedula);
        System.out.printf("Su domicilio es: %s\n", e1.domicilio);
        System.out.printf("Su edad es: %d\n", e1.edad);

    }

}
