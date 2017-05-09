package eu.programisci.Test.towar.ob;

import eu.programisci.Test.towar.enums.EJednostkaMiary;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_towars")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String pkwiu) {
        this.pkwiu = pkwiu;
    }

    public EJednostkaMiary getJednostkaMiary() {
        return jednostkaMiary;
    }

    public void setJednostkaMiary(EJednostkaMiary jednostkaMiary) {
        this.jednostkaMiary = jednostkaMiary;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public Double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(Double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    @Column(name = "cena_netto")
    private Double cenaNetto;

}
