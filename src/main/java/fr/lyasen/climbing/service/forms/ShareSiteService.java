package fr.lyasen.climbing.service.forms;

import fr.lyasen.climbing.dao.ShareSiteDao;
import fr.lyasen.climbing.model.forms.Form_shareSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Represent a record from Form_ShareSite
 */
@Service
public class ShareSiteService {
    @Autowired
    ShareSiteDao shareSiteDao;

    public ShareSiteService() {}

    public Form_shareSite save(Form_shareSite form) {
        return shareSiteDao.save(form);
    }
}
