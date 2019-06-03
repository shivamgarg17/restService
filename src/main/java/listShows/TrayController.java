package listShows;

import listShows.RepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrayController {

    @Autowired
    RepositoryClass repositoryClass;

    @GetMapping("/trays/{shows}")
    public List<Tray> allTrays(@PathVariable String shows){

        return repositoryClass.findByShowContaining(shows);
    }

    @GetMapping("/trays")
    public List<Tray> tray(){

        return repositoryClass.findAll();
    }


}
