package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * book
 * @author 
 */
@Data
public class Book implements Serializable {
    private Integer bid;

    private String name;

    private String card;

    private String autho;

    private Integer num;

    private String press;

    private String type;

    private static final long serialVersionUID = 1L;
}