package fr.lyasen.climbing.service;

import fr.lyasen.climbing.model.Topo;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class TopoService {

    public TopoService() {
    }

    public List<Topo> getTopos() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDateTime = dateTime.format(formatter);

        List<Topo> topos = new ArrayList<>();
        topos.add(new Topo(true, false, "La belle Colline", "Colline abrupte pour grimpeurs acharnés", "Montpellier",
                "France", formattedDateTime));

        topos.add(new Topo(false, true, "Tower of the Death",
                "A strange cliff with a lot of snakes and condors around you to eat your eyes", "Melbourne", "Australie", formattedDateTime));

        return topos;
    }
}
