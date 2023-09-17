package homework;

import homework.model.Position;

import java.util.List;

public class Homework {
    public static void main(String[] args) {
        Position ceo = new Position(1, "CEO");
        Position manager1 = new Position(2, "Manager 1");
        Position manager2 = new Position(3, "Manager 2");
        Position employee1 = new Position(4, "Employee 1");
        Position employee2 = new Position(5, "Employee 2");

        manager1.getSubordinates().add(employee1);
        manager2.getSubordinates().add(employee2);

        ceo.getSubordinates().addAll(List.of(manager1, manager2));

        printHierarchy(ceo, 0);
    }

    public static void printHierarchy(Position position, int level) {

        System.out.println("  ".repeat(Math.max(0, level)) + position.getTitle());

        for (Position subordinate : position.getSubordinates()) {
            printHierarchy(subordinate, level + 1);
        }
    }
}
