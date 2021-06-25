package com.pratice.collection;



public class Employee {
    private String name;
    private int id;
    private String position;

    public Employee(int id, String name, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String toString() {
    	StringBuilder sb = new StringBuilder("Employee ").append(name).append(" id ").append(id)
    			.append(" position ").append(position);
    	return sb.toString();
    }

}
