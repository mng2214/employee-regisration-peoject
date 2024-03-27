package com.emp.model;

import jakarta.validation.constraints.*;
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

    @Email
    @Size(max = 50)
    private String email;

    @NotBlank
    @Size(max = 20)
    private String password;

    @NotBlank
    @Size(max = 20)
    private String address;

    @NotBlank
    @Size(max = 20)
    private String address2;

    @NotBlank
    @Size(max = 20)
    private String city;

    @NotBlank
    @Size(max = 20)
    private String state;

    @Size(min = 5)
    private String zip;
}
