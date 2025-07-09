package dao;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO{

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void remove(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }

    @Override
    public void list() {
        System.out.println(empleados);
    }
}
