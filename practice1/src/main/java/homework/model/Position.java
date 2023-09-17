package homework.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    private int id;
    private String title;
    private List<Position> subordinates = new ArrayList<>();

    public Position(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
