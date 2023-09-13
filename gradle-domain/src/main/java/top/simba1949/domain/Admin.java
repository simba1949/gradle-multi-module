package top.simba1949.domain;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2023/9/13 21:41
 */
@Data
public class Admin implements Serializable {
	@Serial
	private static final long serialVersionUID = 3487204659219628298L;

	private Long id;
	private String username;
	private LocalDateTime birthday;
}
