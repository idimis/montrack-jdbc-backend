package com.idimis.montrack.repository;

import com.idimis.montrack.model.Pocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PocketRepository extends JpaRepository<Pocket, Integer> {
}
