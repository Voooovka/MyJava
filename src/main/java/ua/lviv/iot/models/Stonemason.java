package ua.lviv.iot.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.lviv.iot.enums.Education;
import ua.lviv.iot.enums.Place;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Stonemason extends ConstractionProfessions {
    List<String> stoneType = new ArrayList<>();
    List<String> pickaxeType = new ArrayList<>();

    public Stonemason(){}

    public Stonemason(double avgSalary, Education education, String instruments, Place place, String stone, String pickaxe) {
        super(avgSalary, education, instruments, place);
        stoneType.add(stone);
        pickaxeType.add(pickaxe);
    }

}
