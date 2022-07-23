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
    private String number;
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

    public User(Company company, String registration, String name, String cep, String address, String number, String complement, String district, String city,
                String uf, String phone, String mobile, String workSector, String workSectorPhone, String comments, boolean active, MaritalStatus maritalStatus,
                String rg, String cpf) {
        this.company = company;
        this.registration = registration;
        this.name = name;
        this.cep = cep;
        this.complement = complement;
        this.address = address;
        this.number = number;
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

    public User(UserDTO userDTO) {
        this.company = userDTO.company();
        this.registration = userDTO.registration();
        this.name = userDTO.name();
        this.cep = userDTO.cep();
        this.address = userDTO.address();
        this.number = userDTO.number();
        this.complement = userDTO.complement();
        this.district = userDTO.district();
        this.city = userDTO.city();
        this.uf = userDTO.uf();
        this.phone = userDTO.phone();
        this.mobile = userDTO.mobile();
        this.workSector = userDTO.workSector();
        this.workSectorPhone = userDTO.workSectorPhone();
        this.comments = userDTO.comments();
        this.active = userDTO.active();
        this.maritalStatus = userDTO.maritalStatus();
        this.rg = userDTO.rg();
        this.cpf = userDTO.cpf();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNumber() {
        return number;
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
