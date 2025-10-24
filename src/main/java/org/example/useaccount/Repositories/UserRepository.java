package org.example.useaccount.Repositories;

import org.example.useaccount.Model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount, Long > {
}
