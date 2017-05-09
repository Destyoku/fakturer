package eu.programisci.Test.towar.service;

import eu.programisci.Test.towar.converters.TowarConverter;
import eu.programisci.Test.towar.dto.TowarDTO;
import eu.programisci.Test.towar.enums.EJednostkaMiary;
import eu.programisci.Test.towar.ob.TowarOB;
import eu.programisci.Test.towar.repository.ITowarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by student on 09.05.17.
 */
@Service
public class ITowarServiceImpl implements ITowarService {

    @Autowired
    private ITowarRepository towarRepository;

    @Autowired
    private TowarConverter towarConverter;

    @Override
    public TowarDTO findOne(Long id) {
        TowarOB ob = towarRepository.findOne(id);
        TowarDTO dto = towarConverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<TowarDTO> findAllForTable() {
        List<TowarOB> obList = towarRepository.findAll();
        List<TowarDTO> dtoList = towarConverter.kontrahentObToKontrahentDto(obList);
        return dtoList;
    }

    @Override
    public void deleteOne(Long id) {
        towarRepository.delete(id);
    }

    @Override
    public TowarDTO save(TowarDTO dto) {
        if (dto.getId() == null) {
            return towarConverter.obToDto(create(dto));
        } else {
            return towarConverter.obToDto(update(dto));
        }
    }

    private TowarOB create(TowarDTO dto) {
        TowarOB ob = towarConverter.dtoToOb(dto);
        ob.setCreationDate(new Date());
        ob = towarRepository.save(ob);
        return ob;
    }

    private TowarOB update(TowarDTO dto) {
        TowarOB ob = towarRepository.findOne(dto.getId());
        ob.setNazwa(dto.getNazwa());
        ob.setPkwiu(dto.getPkwiu());
        ob.setJednostkaMiary(dto.getJednostkaMiary());
        ob.setCenaNetto(dto.getCenaNetto());
        ob.setVat(dto.getVat());
        return ob;
    }
    @Override
    public EJednostkaMiary[] getJednostkiMiary() {
        return EJednostkaMiary.values();
    }
}
