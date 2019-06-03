package ferchu.reusable.domain.repositories;

import ferchu.reusable.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
