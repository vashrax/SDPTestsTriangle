package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TriangleType{

    EQUILATERAL("equilateral"), /*RÓWNOBOCZNY*/
    ISOSCELES("isosceles"),  /*RÓWNORAMIENNY*/
    SCALANE("scalane");    /*RÓŻNOBOCZNY*/

    @Getter
    private String description;

}

