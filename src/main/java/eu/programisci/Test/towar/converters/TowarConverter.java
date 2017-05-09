package eu.programisci.Test.towar.converters;

import eu.programisci.Test.towar.dto.TowarDTO;
import eu.programisci.Test.towar.ob.TowarOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 25.04.17.
 */
@Service
public class TowarConverter {


    public TowarDTO obToDto(TowarOB in) {

        TowarDTO out = new TowarDTO();
        out.setNazwa(in.getNazwa());
        out.setPkwiu(in.getPkwiu());
        out.setJednostkaMiary(in.getJednostkaMiary());
        out.setCenaNetto(in.getCenaNetto());
        out.setVat(in.getVat());
        return out;
    }

    public TowarOB dtoToOb(TowarDTO in) {
        TowarOB out = new TowarOB();
        out.setNazwa(in.getNazwa());
        out.setPkwiu(in.getPkwiu());
        out.setJednostkaMiary(in.getJednostkaMiary());
        out.setCenaNetto(in.getCenaNetto());
        out.setVat(in.getVat());
        return out;
    }

    public List<TowarDTO> kontrahentObToKontrahentDto(List<TowarOB> inList) {
        if (inList == null) {
            return null;
        }
        List<TowarDTO> outList = new ArrayList<>();
        for (TowarOB in : inList) {
            outList.add(obToDto(in));
        }
        return outList;
    }
}
