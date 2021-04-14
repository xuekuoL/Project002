package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * admin
 * @author 
 */
@Data
public class Admin implements Serializable {
    private Integer aid;

    private String username;

    private String name;

    private String password;

    private String email;

    private String phone;

    private Integer status;

    private Integer lendNum;

    private Integer maxNum;

    private static final long serialVersionUID = 1L;
}