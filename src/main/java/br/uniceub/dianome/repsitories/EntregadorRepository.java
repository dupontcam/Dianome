package br.uniceub.dianome.repsitories;

import br.uniceub.dianome.models.EntregadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregadorRepository extends JpaRepository<EntregadorModel, Integer> {
}
