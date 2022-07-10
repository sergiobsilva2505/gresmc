package br.com.sbs.gresmc.user;

public record NewUserDTO(
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

    public User toEntity() {
        return new User(company, registration, name, cep, address, complement, district, city, uf, phone, mobile, workSector, workSectorPhone, comments, active, maritalStatus, rg, cpf);
    }

}
