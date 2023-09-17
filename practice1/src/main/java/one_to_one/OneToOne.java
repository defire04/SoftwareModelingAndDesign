package one_to_one;

import one_to_one.model.Department;
import one_to_one.model.GeneralInformationOnActivity;

import java.util.List;

public class OneToOne {
    public static void main(String[] args) {
        GeneralInformationOnActivity info1 = new GeneralInformationOnActivity(1, "Info1");
        GeneralInformationOnActivity info2 = new GeneralInformationOnActivity(2, "Info2");
        GeneralInformationOnActivity info3 = new GeneralInformationOnActivity(3, "Info3");

        List<GeneralInformationOnActivity> generalInformationOnActivityList = List.of(
                info1, info2, info3
        );

        List<Department> departmentList = List.of(
                new Department(1, "department1", info1),
                new Department(2, "department2", info2),
                new Department(3, "department3", info3)
        );


        generalInformationOnActivityList.forEach(generalInformationOnActivity -> {
            System.out.println(generalInformationOnActivity);
            departmentList.forEach(department -> {
                if (generalInformationOnActivity.getId() == department.getInfo().getId()) {
                    System.out.println("\t" + department);
                }
            });
        });
    }
}
