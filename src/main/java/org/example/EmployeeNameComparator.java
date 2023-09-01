package org.example;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    private final SortType sortType;

    public EmployeeNameComparator(SortType sortType) {
        this.sortType = sortType;
    }

    public int compare(Employee o1, Employee o2) {
        int nameRes = this.sortType == SortType.Ascending ? o1.getName().compareTo(o2.getName()) : o2.getName().compareTo(o1.getName());
        if (nameRes == 0) {
            return this.sortType == SortType.Ascending ? Integer.compare(o1.getAge(), o2.getAge()) : Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return nameRes;
        }
    }
}
