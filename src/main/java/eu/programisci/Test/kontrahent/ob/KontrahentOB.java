package eu.programisci.Test.kontrahent.ob;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_kontrahent")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_test_kontrahents_id")
public class KontrahentOB {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private Date creationDate;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "lastname")
    private String lastname;

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Column(name = "nip")
    private String nip;
}
