package api.validate.services;

import org.springframework.stereotype.Service;

import api.validate.entities.TextEntitie;

@Service
public class TextService {
    public boolean validateText(TextEntitie text) {
        return text.getTextOne().equals(text.getTextTwo());
    }

}
