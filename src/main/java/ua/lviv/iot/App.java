package ua.lviv.iot;
import ua.lviv.iot.enums.Color;
import ua.lviv.iot.enums.Education;
import ua.lviv.iot.enums.Place;
import ua.lviv.iot.enums.LevelChemistry;
import ua.lviv.iot.manager.ProffesioManager;
import ua.lviv.iot.models.ConstractionProfessions;
import ua.lviv.iot.models.Painter;
import ua.lviv.iot.models.Plasterer;
import ua.lviv.iot.models.Stonemason;
import ua.lviv.iot.enums.SortOrder;




public class App {
    public static void main( String[] args ) {

        ProffesioManager manager = new ProffesioManager();

        ConstractionProfessions p1 = new Painter(15.5, Education.HIGHER, "Something", Place.INSIDE, "big", Color.BLACK);
        ConstractionProfessions p2 = new Stonemason(5.7, Education.HIGHER, "Something", Place.OUTSIDE, "rock", "Diamond");
        ConstractionProfessions p3 = new Stonemason(1.2, Education.WITHOUT, "Something", Place.MIX, "big rock", "Gold");
        ConstractionProfessions p4 = new Plasterer(10.0, Education.SECONDARY, "Something", Place.INSIDE, LevelChemistry.MEDIUM, 2.5f);

        manager.addDevice(p1);
        manager.addDevice(p2);
        manager.addDevice(p3);
        manager.addDevice(p4);


        System.out.println("Searching profession by place:");
        manager.printProfessionsList(manager.searchByPlace(Place.INSIDE));
        System.out.println("\n\n\nSearching profession by education:");
        manager.printProfessionsList(manager.searchByEducation(Education.WITHOUT));
        System.out.println("\n\n\nSorting professions:");
        manager.sortBySalary(SortOrder.ASC);



    }
}
