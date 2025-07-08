package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public int compareTo(Empleado o) {
        // primero por id
        int cmp = Integer.compare(this.id, o.id);
        if (cmp != 0) return cmp;

        // luego por nombre
        cmp = this.name.compareTo(o.name);
        if (cmp != 0) return cmp;
        
        // finalmente por rol
        return this.position.compareTo(o.position);
    }
}