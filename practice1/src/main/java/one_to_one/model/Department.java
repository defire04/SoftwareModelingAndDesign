package one_to_one.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private int id;
    private String name;
    private GeneralInformationOnActivity info;
}
