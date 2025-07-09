package dao;

import models.Empleado;

public interface EmpleadoDAO {
    
    void add(Empleado empleados);

    void remove(int id);

    void list();
}
