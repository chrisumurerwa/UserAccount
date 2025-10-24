package org.example.useaccount.Services;

import lombok.RequiredArgsConstructor;
import org.example.useaccount.Dto.ResponseDto;
import org.example.useaccount.Dto.UserDto;
import org.example.useaccount.Model.UserAccount;
import org.example.useaccount.Repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service

public class UserService  {
    private final UserRepository userRepository;
    private final UserAccount account;

   public  UserService(UserRepository userRepository) {
       this.userRepository = userRepository;
       this.account = new UserAccount();
   }

public ResponseDto CreateNewUser(UserDto userDto) {
       account.setPassword(userDto.getPassword());
       account.setUsername(userDto.getUsername());
       account.setEmail(userDto.getEmail());
       userRepository.save(account);

       return new ResponseDto(account.getUsername(),account.getEmail());


}

}

