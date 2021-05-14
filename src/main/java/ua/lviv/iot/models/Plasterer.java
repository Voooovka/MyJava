package ua.lviv.iot.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.lviv.iot.enums.Education;
import ua.lviv.iot.enums.Place;
import ua.lviv.iot.enums.LevelChemistry;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Plasterer extends ConstractionProfessions {
    private LevelChemistry chemistryLvl;
    private float experienceOfFacing;

    public Plasterer(){}

    public Plasterer(double avgSalary, Education education, String instruments, Place place, LevelChemistry chemistryLvl, float experienceOfFacing) {
        super(avgSalary, education, instruments, place);
        this.chemistryLvl = chemistryLvl;
        this.experienceOfFacing = experienceOfFacing;
    }

}
