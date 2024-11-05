package com.idimis.montrack.repository;

import com.idimis.montrack.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    // Additional query methods (if needed) can be defined here
}
