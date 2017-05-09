package eu.programisci.Test.towar.service;

import eu.programisci.Test.towar.dto.TowarDTO;
import eu.programisci.Test.towar.enums.EJednostkaMiary;

import java.util.List;

/**
 * Created by student on 25.04.17.
 */
public interface ITowarService {

    /*
    GET /api/towar/findOne
        in: Long id
        out: TowarDTO

     GET /api/towar/findAll
        in: void
        out: TowarDTO[]

     GET /api/towar/deleteOne
        in: Long id
        out: void

    POST /api/towar/save
        in: TowarDTO
        out: TowarDTO

     GET /api/towar/getJednostkiMiary
        in: void
        out: EJednostkaMiary[]
     */

    TowarDTO findOne(Long id);

    List<TowarDTO> findAllForTable();

    void deleteOne(Long id);

    TowarDTO save(TowarDTO towarDTO);

    EJednostkaMiary[] getJednostkiMiary();
}
