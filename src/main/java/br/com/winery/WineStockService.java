package br.com.winery;


import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface WineStockService {
    public String getMenu();
    public String placeOrder(String name, Integer quantity);
}
