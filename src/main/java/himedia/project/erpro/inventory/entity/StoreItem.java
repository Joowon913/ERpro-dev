package himedia.project.erpro.inventory.entity;

import java.util.Date;

import himedia.project.erpro.inventory.dto.StoreItemDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StoreItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "store_id")
	private Long storeId;

	@Column(name = "item_id")
	private Date itemId;

	@Column(name = "item_name")
	private Long itemName;

	private String unit;

	private String spec;

	private Integer count;

	private Integer price;

	private Integer vat;

	private Integer total;

		public StoreItemDto toDto() {
		return StoreItemDto.builder()
				.id(this.id)
				.storeId(this.storeId)
				.itemId(this.itemId)
				.itemName(this.itemName)
				.unit(this.unit)
				.spec(this.spec)
				.count(this.count)
				.price(this.price)
				.vat(this.vat)
				.total(this.total)
				.build();
	}
}
