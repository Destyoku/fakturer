package eu.programisci.Test.towar.ob;

import eu.programisci.Test.towar.enums.EJednostkaMiary;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_towar")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_test_towars_id")
public class TowarOB {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private Date creationDate;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "pkwiu")
    private String pkwiu;

    @Enumerated(EnumType.STRING)
    @Column(name = "jednostka_miary")
    private EJednostkaMiary jednostkaMiary;

    @Column(name = "vat")
    private Integer vat;

    @Column(name = "cena_netto")
    private Double cenaNetto;

}
