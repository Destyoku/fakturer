package eu.programisci.Test.kontrahent.converters;

import eu.programisci.Test.kontrahent.dto.KontrahentDTO;
import eu.programisci.Test.kontrahent.ob.KontrahentOB;
import eu.programisci.Test.user.dto.UserDTO;
import eu.programisci.Test.user.ob.UserOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 25.04.17.
 */
@Service
public class KontrahentConverter {
    public KontrahentDTO obToDto(KontrahentOB in) {

        KontrahentDTO out = new KontrahentDTO();
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }

    public KontrahentOB dtoToOb(KontrahentDTO in) {
        KontrahentOB out = new KontrahentOB();
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }

    public List<KontrahentDTO> kontrahentObToKontrahentDto(List<KontrahentOB> inList) {
        if (inList == null) {
            return null;
        }
        List<KontrahentDTO> outList = new ArrayList<>();
        for (KontrahentOB in : inList) {
            outList.add(obToDto(in));
        }
        return outList;
    }
}
