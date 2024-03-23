package com.emp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employee {
    //    @NotNull //  does not accept null
    //    @NotEmpty // does not accept null or ""
    //    @NotBlank // does not accept null or "" or " "

    @NotBlank
    @Size(min = 2, max = 15)
    private String firstname;

    @NotBlank
    @Size(min = 2, max = 15)
    private String lastname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String email;

    private String password;

    private String address;

    private String address2;

    private String city;

    private String state;

    private String zip;
}
