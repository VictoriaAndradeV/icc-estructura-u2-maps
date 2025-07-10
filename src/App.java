import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.Mapa;
import dao.EmpleadoDAO;
import dao.EmpleadoDAOHashMap;
import dao.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHashMap = new EmpleadoDAOHashMap();
        EmpleadoController empleadoController = new EmpleadoController(empleadoDAOHashMap);

        EmpleadoDAO empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoController empleadoContoller2 = new EmpleadoController(empleadoDAOTreeMap);


        //no tiene un orden especifico al ser hashMap
        //pergunta de prueba, cual es el orden de impresion 
        //la clave de mi mapa es el empleado, jose , juan, pedro, pedro
        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");


        empleadoController.agregarEmpleado(emp1);
        empleadoController.agregarEmpleado(emp2);
        empleadoController.agregarEmpleado(emp3);
        empleadoController.agregarEmpleado(emp4);
        empleadoController.agregarEmpleado(emp5);

        empleadoContoller2.agregarEmpleado(emp1);  
        empleadoContoller2.agregarEmpleado(emp2);       
        empleadoContoller2.agregarEmpleado(emp3);       
        empleadoContoller2.agregarEmpleado(emp4);       
        empleadoContoller2.agregarEmpleado(emp5);       
        
        empleadoController.listarEmpleado();
        
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Ejercicio: Anagramas");
        System.out.println("listen y silent " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("hello y bello " + Ejercicios.areAnagrams("hello", "bello"));

        System.out.println("\nEjercicio: Sumatoria");

        int[] resultado = ejercicios.sumatoriaDeDos(new int[] { 9, 2, 3, 6 }, 5);
        if (resultado != null) {
            System.out.println("Indices: [" + resultado[0] + " , " + resultado[1] + "]");
        } else {
            System.out.println("No se encontró combinación");
        }

        System.out.println("\nEjercicio: Frecuencia de caracteres");
        ejercicios.contarCaracteres("hola");

        System.out.println("\nEjercicio: Son Anagramas");
        System.out.println("roma y amor " + ejercicios.sonAnagramas("roma", "amor"));
    }
}
