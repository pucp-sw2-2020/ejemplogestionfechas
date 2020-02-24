package sw2.ejemplogestionfechas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sw2.ejemplogestionfechas.entity.Evento;

public interface EventoRepository extends JpaRepository<Evento,Integer> {
}

