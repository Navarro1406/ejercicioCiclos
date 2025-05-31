import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de notas: CESDE");
        String usuario = "admin";
        String contrasena = "123";
        String tipo = ""; /* Estudiante o Profe */
        int intentos = 3;
        while (intentos > 0) {
            System.out.println("Ingrese su usuario: ");
            usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            contrasena = sc.nextLine();
            if (usuario.equals("admin") && contrasena.equals("123")) {
                System.out.println("Bienvenido al Sistema de notas CESDE");
                intentos = 0;
                System.out.println("Seleccione: \n1 - Profe\n2 - Estudiante");
                String opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        int interruptor = 1;
                        int contadorEstudiantes = 0;
                        int ganaron = 0;
                        while (interruptor == 1){
                            double nota =0;
                            double notaFinal =0;
                            double sumaNotas =0;
                            for (int i = 1; i <=3; i++ ){

                                do {
                                    System.out.println("Ingresando la nota: " + i);
                                    nota = sc.nextDouble();
                                }while (nota < 0 || nota > 5);
                                sumaNotas = sumaNotas + nota;
                            }
                            notaFinal = sumaNotas / 3;
                            if (notaFinal >= 3) {
                                ganaron++;
                            }
                            System.out.println("la nota final es: " + notaFinal);
                            contadorEstudiantes ++;
                            System.out.println("¿Desea ingresar la nota de otro estudiante? Si/No");
                            opcion = sc.next();
                            if (opcion.equals("No")){
                                interruptor = 0;
                            }

                        }
                        System.out.println("Resultado de la materia Lógica de programación: ");
                        System.out.println("Cantidad de estudiantes que ganaron: " + ganaron);
                        System.out.println("Cantidad de estudiantes que perdieron: " + (ganaron - contadorEstudiantes));
                        break;
                    case "2":
                            System.out.println("Hola estudiante");
                        break;
    
                }
            } else {
                System.out.println("Error de credenciales, intente nuevamente");
                intentos--;
                System.out.println("Tiene " + intentos + " mas");
            }
        }

    }
}
