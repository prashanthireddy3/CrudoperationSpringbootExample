package com.sa.telecom.plm.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEEDETAILS",catalog = "TEST")
@Setter
@Getter
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name = "PHONENUMBER")
    private String PhoneNumber;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name="MAILID")
    private String mailId;
    @Column(name = "ORGANISATION")
    private String Organisation;
}
