package ua.lviv.iot.models;

import lombok.Data;
import ua.lviv.iot.enums.Education;
import ua.lviv.iot.enums.Place;

import java.util.ArrayList;
import java.util.List;

@Data
public class ConstractionProfessions {
    private double avgSalary;
    private Education education;
    List<String> instruments = new ArrayList<>();
    private Place place;

    public ConstractionProfessions() { }

    public ConstractionProfessions(double avgSalary, Education education, String instrument, Place place) {
        this.avgSalary = avgSalary;
        this.education = education;
        instruments.add(instrument);
        this.place = place;
    }

}
