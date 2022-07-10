package br.com.sbs.gresmc.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(NewUserDTO newUserDTO) {
        return userRepository.save(newUserDTO.toEntity());
    }
}
