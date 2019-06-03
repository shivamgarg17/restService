package listShows;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepositoryClass extends JpaRepository<Tray, Integer> {

    List<Tray> findByShowContaining(String shows);

//    List<listShows.Tray> findByTrayStartingwith(String show);
}
