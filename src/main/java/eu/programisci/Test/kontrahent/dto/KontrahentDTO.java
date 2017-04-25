package eu.programisci.Test.kontrahent.dto;

import java.util.Date;


public class KontrahentDTO {

    private Long id;
    private String nazwa;
    private String adres;
    private String nip;
    public KontrahentDTO() {
    }

    public KontrahentDTO(String aNazwa, String aAdres, String aNip) {
        nazwa = aNazwa;
        adres = aAdres;
        nip = aNip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long aId) {
        id = aId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String aNazwa) {
        nazwa = aNazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String aAdres) {
        adres = aAdres;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String aNip) {
        nip = aNip;
    }
}
