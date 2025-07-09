package controllers;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoContoller {

    //id del mapa
    //valor, empleado
    //mapa tiene clave y valor
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) { //inyeccion de dependencia
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleado(Empleado emp){
        empleadoDAO.add(emp);
    }

    public void eliminarEmpleado(int id){
        empleadoDAO.remove(id);
    }

    public void listarEmpleado(){
        empleadoDAO.list();
    }
    
}