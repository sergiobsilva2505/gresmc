package br.com.sbs.gresmc.user;

public record UserViewDTO(
        Long id,
        String registration,
        String name,
        String mobile,
        Company company,
        String workSector,
        boolean active) {

    public static UserViewDTO toView(User user) {
        return new UserViewDTO(user.getId(), user.getRegistration(), user.getName(), user.getMobile(), user.getCompany(), user.getWorkSector(), user.isActive());
    }
}
