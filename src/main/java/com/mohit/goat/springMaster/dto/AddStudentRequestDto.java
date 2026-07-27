package com.mohit.goat.springMaster.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentRequestDto {

    @Size(min = 3, max = 30, message = "Name of size in between 3 to 30 characters")
    @NotBlank(message = "Name is Required")
    private String name;

    @Email
    @NotBlank(message = "Email is Required")
    private String email;
}
