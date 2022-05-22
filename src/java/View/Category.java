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
public class Category {
    private int CategoryID;
    private String CategoryName;
    private String Description;
    private String Picture;
}
