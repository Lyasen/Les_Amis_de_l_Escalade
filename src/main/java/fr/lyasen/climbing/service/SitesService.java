package fr.lyasen.climbing.service;

import fr.lyasen.climbing.dao.ShareSiteDao;
import fr.lyasen.climbing.model.forms.Form_shareSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SitesService {
    @Autowired
    ShareSiteDao shareSiteDao;

    public SitesService(){}

    public Form_shareSite getSite(int id) {
        return shareSiteDao.findById(id).orElse(null);
    }
}
