package br.com.sbs.gresmc.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/novo-socio")
    public String getNewUserForm(NewUserDTO newUserDTO, Model model) {
        model.addAttribute("newUserDTO",newUserDTO);
        model.addAttribute("companies", Company.values());
        model.addAttribute("maritalStatuses", MaritalStatus.values());

        return "socio/cadUser";
    }

    @PostMapping("/novo-socio")
    public String createNewUser(NewUserDTO newUserDTO, Model model) {
        userService.save(newUserDTO);
        return "redirect:/novo-socio";
    }

    @GetMapping("/lista-socio")
    public String getAll(Model model){
        List<UserViewDTO> userViewDTOS = userService.getAllUsersBasicData();
        model.addAttribute("userViewDTOS", userViewDTOS);
        return "socio/listUser";
    }

}
