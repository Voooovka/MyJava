package ua.lviv.iot.manager;


import ua.lviv.iot.enums.Education;
import ua.lviv.iot.enums.Place;
import ua.lviv.iot.models.ConstractionProfessions;
import ua.lviv.iot.enums.SortOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public final class ProffesioManager {

    public List<ConstractionProfessions> constractionProfessions = new ArrayList<>();

    public void addDevice(ConstractionProfessions constractionProfession) {
        this.constractionProfessions.add(constractionProfession);
    }

    public List<ConstractionProfessions> searchByPlace(Place place) {
        return constractionProfessions.stream()
                .filter(professions -> professions.getPlace().equals(place))
                .collect(Collectors.toList());
    }

    public List<ConstractionProfessions> searchByEducation(Education education) {
        return constractionProfessions.stream()
                .filter(professions -> professions.getEducation().equals(education))
                .collect(Collectors.toList());
    }

    public List<ConstractionProfessions> sortBySalary(SortOrder order) {
        if (order == SortOrder.DESC) {
            constractionProfessions.stream().sorted(Comparator.comparing(ConstractionProfessions::getAvgSalary)).forEach(System.out::println);
        }else if (order == SortOrder.ASC){
            constractionProfessions.stream().sorted(Comparator.comparing(ConstractionProfessions::getAvgSalary).reversed()).forEach(System.out::println);
        }
        return constractionProfessions;
    }


    public void printProfessionsList(List<ConstractionProfessions> professions) {
        professions.forEach(System.out::println);
    }

}
