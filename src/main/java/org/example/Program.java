package org.example;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Семен", 40);
        Employee employee2 = new Employee("Михаил", 38);

        LinkedList<Employee> employeeLinkedList = new LinkedList();

        employeeLinkedList.addFirst(new Employee("Петр", 21));
        employeeLinkedList.addFirst(new Employee("Тимофей", 33));
        employeeLinkedList.addFirst(new Employee("Валерий", 34));
        employeeLinkedList.addFirst(new Employee("Арсений", 44));
        employeeLinkedList.addFirst(new Employee("Евгений", 41));
        employeeLinkedList.addFirst(new Employee("Макисм", 33));
        employeeLinkedList.addFirst(new Employee("Алексей", 32));
        employeeLinkedList.addFirst(employee1);
        employeeLinkedList.addFirst(employee2);


        System.out.println(employeeLinkedList);
        System.out.println();
        employeeLinkedList.pivot();
        System.out.println(employeeLinkedList);
        //employeeLinkedList.sort(new EmployeeNameComparator(SortType.Ascending));
        //System.out.println(employeeLinkedList);
        //System.out.println();
        //employeeLinkedList.sort(new EmployeeNameComparator(SortType.Descending));
        //System.out.println(employeeLinkedList);
        //System.out.println();
        //employeeLinkedList.removeFirst();
        //employeeLinkedList.removeLast();
        //System.out.println(employeeLinkedList);
    }
}
