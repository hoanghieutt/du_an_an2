package com.poly.datn.sd18.model.dto;

import com.poly.datn.sd18.entity.Role;
import com.poly.datn.sd18.entity.Staff;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StaffDTO {
    private String name;

    private String email;

    private String phone;

    private String  avatar;

    private String address;

    private String password;

    private Role role;
}
