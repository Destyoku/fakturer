package eu.programisci.Test.towar.api;

import eu.programisci.Test.towar.dto.TowarDTO;
import eu.programisci.Test.towar.enums.EJednostkaMiary;
import eu.programisci.Test.towar.service.ITowarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by student on 25.04.17.
 */
@RestController
@RequestMapping(value = "/api/towar")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class TowarRestController {

    @Autowired
    private ITowarService towarService;

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TowarDTO findOne(@RequestParam("id") Long aId) {
        return towarService.findOne(aId);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TowarDTO> findAll() {
        return towarService.findAllForTable();
    }

    @RequestMapping(value = "/deleteOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteOne(@RequestParam("id") Long aId) {
        towarService.deleteOne(aId);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TowarDTO save(@RequestBody TowarDTO aUserDTO) {
        return towarService.save(aUserDTO);
    }

    @RequestMapping(value = "/getJednostkiMiary", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public EJednostkaMiary[] getJednostkiMiary(){
        return towarService.getJednostkiMiary();
    }
}
