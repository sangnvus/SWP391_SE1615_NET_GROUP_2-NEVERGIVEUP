/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Builder
@Getter
@Setter
@ToString
public class Account {
    private int AccountID;
    private String UserName;
    private String Password;
    private String DisplayName;
    private String Address;
    private String Email;
    private String Phone;
    private String ImageURL;
    private int Role;    
}
