package org.example;

public class Employee {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Employee employee) {
                return employee.name.equals(this.name) && employee.age == this.age;
            }

            return false;
        }
    }

    public String toString() {
        return String.format("%s - %d", this.name, this.age);
    }
}
