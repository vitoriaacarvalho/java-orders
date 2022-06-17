package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<OrderItem>();

	public Order() {
	}
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public double total() {
		double sum=0.0;
		for (OrderItem items : items) {
			sum+=items.subTotal();
			//sum+=items.getPrice()*items.getQuantity();
		}return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("order moment: ");
		sb.append(sdf.format(moment)+"\n");
		sb.append("order status: ");
		sb.append(status+"\n");
		sb.append("client: ");
		sb.append(client+"\n");
		sb.append("order items: ");
		for (OrderItem item: items) {
			sb.append(item+"\n");
		}
		sb.append("total price: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
