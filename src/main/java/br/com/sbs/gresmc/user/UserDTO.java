package br.com.sbs.gresmc.user;

public record UserDTO(
        Long id,
        Company company,
        String registration,
        String name,
        String cep,
        String address,
        String complement,
        String district,
        String city,
        String uf,
        String phone,
        String mobile,
        String workSector,
        String workSectorPhone,
        String comments,
        Boolean active,
        MaritalStatus maritalStatus,
        String rg,
        String cpf) {

}
