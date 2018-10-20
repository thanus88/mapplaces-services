package th.co.abs.map.service.controller;

import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import th.co.abs.map.service.entity.Places;
import th.co.abs.map.service.repository.PlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BaseController {
	
	@Autowired
    private PlaceRepository placeRepository;

    //@HystrixCommand
    @RequestMapping(value="/v1/get-by-id", method= RequestMethod.GET)
    public Places getDocumentType(@ApiParam(value="get-by-id") @RequestParam(required = true, value = "object_id") String object_id)throws Exception{
        log.info("Begin : Get Document Type");
        return null;//placeRepository.findByObjectid(object_id);
    }
}
