package com.quan.springboot.pojo;


import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class User {
    private String name;
    @Singular("addHobby")
    private List<String> hobby;
}
