package com.mmacedo.fullstackbackend.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPostRequestBody {


    private String username;
    private String name;
    private String email;
}
