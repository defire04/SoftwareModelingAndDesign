package many_to_many;


import many_to_many.model.Department;
import many_to_many.model.DepartmentTask;
import many_to_many.model.Task;

import java.util.List;

public class ManyToMany {
    public static void main(String[] args) {


        List<Task> tasks = List.of(
                new Task(1, "Recruit new employees"),
                new Task(2, "Software development"),
                new Task(3, "Training and development")
        );

        List<Department> departments = List.of(
                new Department(1, "department1"),
                new Department(2, "department2"),
                new Department(3, "department3")
        );


        List<DepartmentTask> manyToManyList = List.of(
                new DepartmentTask(departments.get(0), tasks.get(2)),
                new DepartmentTask(departments.get(0), tasks.get(1)),
                new DepartmentTask(departments.get(1), tasks.get(2)),
                new DepartmentTask(departments.get(2), tasks.get(0))
        );


        tasks.forEach(task -> {
            departments.forEach(department -> {
                manyToManyList.forEach(departmentTask -> {
                    if (departmentTask.getDepartment().getId() == department.getId() && departmentTask.getTask().getId() == task.getId()) {
                        System.out.println(departmentTask);
                        System.out.println("\t" + department);
                        System.out.println("\t" + task);
                    }
                });
            });
        });

    }
}
