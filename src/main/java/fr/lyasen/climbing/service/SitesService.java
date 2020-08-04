package fr.lyasen.climbing.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SitesService {
    public SitesService(){}

    public Map<String, String> getLocations() {
        Map<String, String> locations = new HashMap<>();
        locations.put("dolomites", "dolomites.html");
        locations.put("dorset", "dorset.html");
        locations.put("sormiou", "sormiou.html");
        locations.put("fontainebleau", "fontainebleau.html");
        locations.put("ennedi", "ennedi.html");
        locations.put("trango", "trango.html");
        return locations;
    }
}
