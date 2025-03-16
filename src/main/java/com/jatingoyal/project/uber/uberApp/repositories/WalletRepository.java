package com.jatingoyal.project.uber.uberApp.repositories;

import com.jatingoyal.project.uber.uberApp.entities.User;
import com.jatingoyal.project.uber.uberApp.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
//    Custom Query
    Optional<Wallet> findByUser(User user);
}
