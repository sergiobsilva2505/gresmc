package br.com.sbs.gresmc.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(NewUserDTO newUserDTO) {
        return userRepository.save(new User(newUserDTO));
    }

    public List<UserViewDTO> getAllUsersBasicData(){
        List<User> users = userRepository.findAll();
        return users.stream().map(UserViewDTO::toView).toList();
    }
}
