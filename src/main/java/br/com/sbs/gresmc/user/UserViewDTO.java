package br.com.sbs.gresmc.user;

public record UserViewDTO(
        String registration,
        String name,
        String mobile,
        String workSector) {

    public static UserViewDTO toView(User user) {
        return new UserViewDTO(user.getRegistration(), user.getName(), user.getMobile(), user.getWorkSector());
    }
}
