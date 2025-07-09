package controllers;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {

    public Mapa() {
    }

    public void ejemploConHashMap(){
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Peru", "Lima");
        capitales.put("Colombia", "Bogota");

        System.out.println("Mapa de capitales HASH MAP");
        for(String pais : capitales.keySet()){
            System.out.println("Pais: " + pais + ", Capital: " + capitales);
        }

        //ejemplo con acceso directo
        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capital);

        System.out.println("\n");

        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Diseñador"));
        empleados.put(1, new Empleado(3, "Pedro", "Tester"));
        
        for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
        System.out.println("Clave: "   + entry.getKey() + ", Valor: "   + entry.getValue() + ", Posicion: "+ entry.getKey());
        }

        Map<Empleado, Integer> empleadoDos = new HashMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");//aunque tengamos dos anas repetidos, se imprimen
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");//porq tienen nombre de variables diferentes 
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");


        empleadoDos.put(emp1, 1000);
        empleadoDos.put(emp2, 1200);
        empleadoDos.put(emp3, 1500);
        empleadoDos.put(emp4, 2000);

        for(Map.Entry<Empleado, Integer> entry : empleadoDos.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public void ejemploConLinkedHashMap(){
        LinkedHashMap<String, Integer> producto = new LinkedHashMap<>();
        producto.put("Leche", 5);
        producto.put("Caja de fresas", 7);
        producto.put("Lata de Aceitunas", 3);
        producto.put("Chocolate", 4);
        producto.put("Mani", 2);

        System.out.println("\nMapa de productos");
        for(String carrito: producto.keySet()){
            System.out.println("Producto = " + carrito + ", Cantidad = " + producto.get(carrito));
        }
    }

    public void ejemploConTreeMap(){
        TreeMap<Integer, String> persona = new TreeMap<>();
        persona.put(123, "Dayana");
        persona.put(456, "Mateo");
        persona.put(789, "Martin");
        persona.put(159, "Erika");
        persona.put(753, "Lorena");

        System.out.println("\nTREE MAP");
        System.out.println("Lista de personas:");
        for (Map.Entry<Integer, String> entry : persona.entrySet()) {
            System.out.println("Cédula = " + entry.getKey() + ", Nombre = " + entry.getValue());
        }

        System.out.println("\n");

        TreeMap<Empleado, Integer> empleadoDos = new TreeMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleadoDos.put(emp1, 1000);
        empleadoDos.put(emp2, 1200); 
        empleadoDos.put(emp3, 1500);
        empleadoDos.put(emp4, 2000);

        for(Map.Entry<Empleado, Integer> entry : empleadoDos.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        /*System.out.println("\nResultados de compareTo():");
        System.out.printf("%s.compareTo(%s) = %d%n", emp3, emp4, emp3.compareTo(emp4));*/
    }
}
