package eu.programisci.Test.towar.dto;

/*
	Long id;
	String nazwa;
	String pkwiu;
	EJednostkaMiary jednostkaMiary;
	Integer vat;
	Double cenaNetto;
 */

import eu.programisci.Test.towar.enums.EJednostkaMiary;

public class TowarDTO {

    private Long id;
    private String nazwa;
    private String pkwiu;
    private EJednostkaMiary jednostkaMiary;
    private Integer vat;
    private Double cenaNetto;

    public TowarDTO() {
    }

    public TowarDTO(String aNazwa, String aPkwiu, EJednostkaMiary aJednostkaMiary, Integer aVat, Double aCenaNetto) {
        nazwa = aNazwa;
        pkwiu = aPkwiu;
        jednostkaMiary = aJednostkaMiary;
        vat = aVat;
        cenaNetto = aCenaNetto;
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

    public void setNazwa(String aName) {
        nazwa = aName;
    }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String aLastname) {
        pkwiu = aLastname;
    }

    public EJednostkaMiary getJednostkaMiary() {
        return jednostkaMiary;
    }

    public void setJednostkaMiary(EJednostkaMiary aJednostkaMiary) {
        jednostkaMiary = aJednostkaMiary;
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
}
