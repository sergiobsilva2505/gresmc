package br.com.sbs.gresmc.user;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated(EnumType.STRING)
    private Company company;
    private String registration;
    private String name;
    private String cep;
    private String address;
    private String complement;
    private String district;
    private String city;
    private String uf;
    private String phone;
    private String mobile;
    private String workSector;
    private String workSectorPhone;
    private String comments;
    private boolean active;

    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    private String rg;
    private String cpf;

    @Deprecated
    public User() {

    }

    public User(Company company, String registration, String name, String cep, String address, String complement, String district, String city,
                String uf, String phone, String mobile, String workSector, String workSectorPhone, String comments, boolean active, MaritalStatus maritalStatus,
                String rg, String cpf) {
        this.company = company;
        this.registration = registration;
        this.name = name;
        this.cep = cep;
        this.complement = complement;
        this.address = address;
        this.district = district;
        this.city = city;
        this.uf = uf;
        this.phone = phone;
        this.mobile = mobile;
        this.workSector = workSector;
        this.workSectorPhone = workSectorPhone;
        this.comments = comments;
        this.active = active;
        this.maritalStatus = maritalStatus;
        this.rg = rg;
        this.cpf = cpf;
    }

    public User(NewUserDTO newUserDTO) {
        this.company = newUserDTO.company();
        this.registration = newUserDTO.registration();
        this.name = newUserDTO.name();
        this.cep = newUserDTO.cep();
        this.address = newUserDTO.address();
        this.complement = newUserDTO.complement();
        this.district = newUserDTO.district();
        this.city = newUserDTO.city();
        this.uf = newUserDTO.uf();
        this.phone = newUserDTO.phone();
        this.mobile = newUserDTO.mobile();
        this.workSector = newUserDTO.workSector();
        this.workSectorPhone = newUserDTO.workSectorPhone();
        this.comments = newUserDTO.comments();
        this.active = newUserDTO.active();
        this.maritalStatus = newUserDTO.maritalStatus();
        this.rg = newUserDTO.rg();
        this.cpf = newUserDTO.cpf();
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

    public String getCep() {
        return cep;
    }

    public String getAddress() {
        return address;
    }

    public String getComplement() {
        return complement;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getUf() {
        return uf;
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

    public String getComments() {
        return comments;
    }

    public boolean isActive() {
        return active;
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
