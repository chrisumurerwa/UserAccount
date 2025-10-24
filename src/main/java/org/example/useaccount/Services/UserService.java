package org.example.useaccount.Services;

import lombok.RequiredArgsConstructor;
import org.example.useaccount.Repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service

public class UserService  {
    private UserRepository userRepository;

   public  UserService(UserRepository userRepository) {
       this.userRepository = userRepository;
   }


}
