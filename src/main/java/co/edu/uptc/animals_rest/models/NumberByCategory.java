package co.edu.uptc.animals_rest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NumberByCategory {
    private String category;
    private Integer number;

}
