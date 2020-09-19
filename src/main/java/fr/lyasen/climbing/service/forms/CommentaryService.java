package fr.lyasen.climbing.service.forms;

import fr.lyasen.climbing.dao.CommentaryDao;
import fr.lyasen.climbing.model.forms.Form_commentary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Represent a record from Form_commentary
 */
@Service
public class CommentaryService {
    @Autowired
    CommentaryDao commentaryDao;

    public Form_commentary save (Form_commentary form) {
        return commentaryDao.save(form);
    }
}
