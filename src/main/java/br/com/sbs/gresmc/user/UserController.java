package br.com.sbs.gresmc.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/novo-socio")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getNewUserForm(NewUserDTO newUserDTO, Model model) {
        model.addAttribute("newUserDTO",newUserDTO);
        model.addAttribute("companies", Company.values());
        model.addAttribute("maritalStatuses", MaritalStatus.values());

        return "socio/cadUser";
    }

    @PostMapping
    public String createNewUser(NewUserDTO newUserDTO, Model model) {
        userService.save(newUserDTO);
        return "redirect:/novo-socio";
    }


}
