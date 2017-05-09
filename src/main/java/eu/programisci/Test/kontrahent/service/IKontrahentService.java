package eu.programisci.Test.kontrahent.service;

import eu.programisci.Test.kontrahent.dto.KontrahentDTO;

import java.util.List;

/**
 * Created by student on 25.04.17.
 */
public interface IKontrahentService {

    /*
     GET /api/kontrahent/findOne
        in: Long id
        out: KontrahentDTO

     GET /api/kontrahent/findAll
        in: void
        out: KontrahentDTO[]

     GET /api/kontrahent/deleteOne
        in: Long id
        out: void

    POST /api/kontrahent/save
        in: KontrahentDTO
        out: KontrahentDTO
     */

    KontrahentDTO findOne(Long id);

    List<KontrahentDTO> findAllForTable();

    void deleteOne(Long id);

    KontrahentDTO save(KontrahentDTO kontrahentDTO);
}
