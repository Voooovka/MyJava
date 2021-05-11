package ua.lviv.iot.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.lviv.iot.enums.Color;
import ua.lviv.iot.enums.Education;
import ua.lviv.iot.enums.Place;

import java.util.ArrayList;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Painter extends ConstractionProfessions {
    List<String> brusType = new ArrayList<>();
    private Color paintColor;

    public Painter() { }

    public Painter(double avgSalary, Education education, String instruments, Place place, String brush, Color paintColor) {
        super(avgSalary, education, instruments, place);
        brusType.add(brush);
        this.paintColor = paintColor;
    }

}
