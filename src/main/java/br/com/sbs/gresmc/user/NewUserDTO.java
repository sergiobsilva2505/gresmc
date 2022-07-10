package br.com.sbs.gresmc.user;

import br.com.sbs.gresmc.Company;
import br.com.sbs.gresmc.MaritalStatus;

public record NewUserDTO(
        Company company,
        String registration,
        String name,
        String address,
        String district,
        String city,
        String phone,
        String mobile,
        String workSector,
        String workSectorPhone,
        MaritalStatus maritalStatus,
        String rg,
        String cpf) {

    public User toEntity() {
        return new User(company, registration, name, address, district, city, phone, mobile, workSector, workSectorPhone, maritalStatus, rg, cpf);
    }

}
