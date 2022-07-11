package br.com.sbs.gresmc.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/lista-socio")
    public String getAll(Model model){
        List<UserViewDTO> userViewDTOS = userService.getAllUsersBasicData();
        model.addAttribute("userViewDTOS", userViewDTOS);
        return "socio/listUser";
    }

    @GetMapping("/novo-socio")
    public String getNewUserForm(UserDTO userDTO, Model model) {
        model.addAttribute("userDTO",userDTO);
        model.addAttribute("companies", Company.values());
        model.addAttribute("maritalStatuses", MaritalStatus.values());

        return "socio/cadUser";
    }

    @PostMapping("/novo-socio")
    public String createNewUser(UserDTO userDTO, Model model) {
        userService.save(userDTO);
        return "redirect:/lista-socio";
    }

    @GetMapping("/novo-socio/{userId}")
    public String showUser(@PathVariable Long userId, Model model) {
        UserDTO userDTO = userService.findById(userId);
        return getNewUserForm(userDTO, model);
    }

    @PostMapping("/novo-socio/{userId}")
    public String updateUser(@PathVariable Long userId, UserDTO userDTO, Model model) {
        userService.updateUser(userId, userDTO);
        return "redirect:/lista-socio";
    }

    /*todo
    *  - ajustar a recuperação dos campos selects no form
    *  - ajustar o update
    *  - endereço embedable ?
    * */
}
