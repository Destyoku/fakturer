package eu.programisci.Test.kontrahent.api;

import eu.programisci.Test.kontrahent.dto.KontrahentDTO;
import eu.programisci.Test.kontrahent.service.IKontrahentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by student on 25.04.17.
 */

@RestController
@RequestMapping(value = "/api/kontrahent")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class KontrahentRestController {

    @Autowired
    private IKontrahentService kontrahentService;

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public KontrahentDTO findOne(@RequestParam("id") Long aId) {
        return kontrahentService.findOne(aId);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<KontrahentDTO> findAll() {
        return kontrahentService.findAllForTable();
    }

    @RequestMapping(value = "/deleteOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteOne(@RequestParam("id") Long aId) {
        kontrahentService.deleteOne(aId);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public KontrahentDTO save(@RequestBody KontrahentDTO aUserDTO) {
        return kontrahentService.save(aUserDTO);
    }
}
