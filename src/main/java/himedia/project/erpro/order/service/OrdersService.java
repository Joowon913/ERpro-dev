package himedia.project.erpro.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import himedia.project.erpro.common.CustomMapper;
import himedia.project.erpro.order.dto.OrdersDto;
import himedia.project.erpro.order.entity.Orders;
import himedia.project.erpro.order.repository.OrdersRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrdersService {
	private final OrdersRepository ordersRepository;
	private final CustomMapper mapper;
	
	public List<OrdersDto> getOrdersAll() {
		List<Orders> ordersList = ordersRepository.findAll();
		List<OrdersDto> ordersDtoList = mapper.toDtoList(ordersList, OrdersDto.class);
		return ordersDtoList;
	}
	
	public OrdersDto getOrdersById(Long id){
		Orders ordersId = ordersRepository.findById(id)
				.orElseThrow(()-> new EntityNotFoundException("Orders not found with ordersID : " + id));
		OrdersDto ordersDtoId = mapper.map(ordersId, OrdersDto.class);
		return ordersDtoId;
	}
	
	public OrdersDto createOrders(OrdersDto ordersDto) {
		// dto를 엔티티로 변환
		Orders orders = mapper.map(ordersDto, Orders.class);
		System.out.println(orders.getBNm());
		Orders ordersSave = ordersRepository.save(orders);
		OrdersDto ordersDtoSave = mapper.map(ordersSave, OrdersDto.class);
		return ordersDtoSave;
	}
}
