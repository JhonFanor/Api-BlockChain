package api.validate.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.validate.entities.TextEntitie;
import api.validate.services.TextService;

@RestController
@RequestMapping(value = "/Api-BlockChain/Validate")
public class TextControllers {
    private TextService textService;

    public TextControllers(TextService textService) {
        this.textService = textService;
    }
    @PostMapping(path = "/text")
    public ResponseEntity<Boolean> validateText(@RequestBody TextEntitie text){
        return ResponseEntity.ok(textService.validateText(text)); 
    }
}
