package ai.jobiak.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
//@EqualsAndHashCode
@AllArgsConstructor
//@ToString(exclude={"custid"})
@Data
public class Customer {

	@Setter
	@Getter
	private long cusid;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private double balance;
	
	
}
