package ua.lviv.iot.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "plasterers")
public class Plasterer extends ConstractionProfessions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chemistry_lvl")
    private String chemistryLvl;

    @Column(name = "experience_of_facing")
    private float experienceOfFacing;

}
