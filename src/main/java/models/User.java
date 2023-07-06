package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@Setter
@ToString
public class User implements User_Cor_Data {
    String name;
    String lastname;
    String email;
    String psw;

}
