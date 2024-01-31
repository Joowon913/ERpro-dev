package himedia.project.erpro.inventory.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreDto {
	private Long id;
	private String storeSort;
	private Long accountId;
	private Long orderId;
	private LocalDate storeDate;
}
