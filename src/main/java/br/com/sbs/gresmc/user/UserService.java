package br.com.sbs.gresmc.user;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(UserDTO userDTO) {
        return userRepository.save(new User(userDTO));
    }

    public List<UserViewDTO> getAllUsersBasicData(){
        List<User> users = userRepository.findAll();
        return users.stream().map(UserViewDTO::toView).toList();
    }

    public UserDTO findById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return toDto(user);
    }

    @Transactional
    public void updateUser(Long userId, UserDTO userDTO) {
        User user = new User(userDTO);
        user.setId(userId);
        userRepository.save(user);
    }

    private UserDTO toDto(User user) {
        return new UserDTO(user.getId(), user.getCompany(), user.getRegistration(), user.getName(), user.getCep(),
                user.getAddress(), user.getComplement(), user.getDistrict(), user.getCity(), user.getUf(), user.getPhone(),
                user.getMobile(), user.getWorkSector(), user.getWorkSectorPhone(), user.getComments(), user.isActive(),
                user.getMaritalStatus(), user.getRg(), user.getCpf());
    }
}
