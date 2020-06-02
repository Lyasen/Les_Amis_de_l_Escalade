package fr.lyasen.climbing.service;

import fr.lyasen.climbing.model.Topo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopoService {
    public List<Topo> getTopos() {
        List<Topo> topos = new ArrayList<>();
        Topo topo_1 = new Topo();
        topo_1.setTitle("La Belle Colline");
        topos.add(topo_1);
        return topos;
    }
}
