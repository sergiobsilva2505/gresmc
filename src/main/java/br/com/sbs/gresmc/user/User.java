package br.com.sbs.gresmc.user;

import br.com.sbs.gresmc.Company;
import br.com.sbs.gresmc.MaritalStatus;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Company company;
    private String registration;
    private String name;
    private String address;
    private String district;
    private String city;
    private String phone;
    private String mobile;
    private String workSector;
    private String workSectorPhone;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    private String rg;
    private String cpf;

    @Deprecated
    public User() {

    }

    public User(Company company, String registration, String name, String address, String district, String city,
                String phone, String mobile, String workSector, String workSectorPhone, MaritalStatus maritalStatus,
                String rg, String cpf) {
        this.company = company;
        this.registration = registration;
        this.name = name;
        this.address = address;
        this.district = district;
        this.city = city;
        this.phone = phone;
        this.mobile = mobile;
        this.workSector = workSector;
        this.workSectorPhone = workSectorPhone;
        this.maritalStatus = maritalStatus;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public String getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWorkSector() {
        return workSector;
    }

    public String getWorkSectorPhone() {
        return workSectorPhone;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }
}
