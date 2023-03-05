package com.example.authority.controller.dto;

import lombok.Data;

/**
 * @program: hishrm
 * @ClassName RepasswordDto
 * @description:
 * @author: glb
 * @create: 2023-02-06 19:39
 * @Version 1.0
 **/
@Data
public class RepasswordDto {
    private String oldpass;
    private String newpass;

}
