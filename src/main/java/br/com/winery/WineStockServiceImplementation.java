package br.com.winery;

import jakarta.jws.WebService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.jws.WebService;

@WebService(endpointInterface = "winery.WineStockServer")
public class WineStockServiceImplementation implements WineStockService{


    @Override
    public String getMenu() {

        Vinho vinho1 = new Vinho();
        vinho1.setId(1L);
        vinho1.setName("Vinho1");
        vinho1.setPrice(BigDecimal.valueOf(10.0));
        vinho1.setTypeGrape("uvaBoa");

        Vinho vinho2 = new Vinho();
        vinho2.setId(2L);
        vinho2.setName("Vinho2");
        vinho2.setPrice(BigDecimal.valueOf(5.0));
        vinho2.setTypeGrape("uvaRuim");


        List<Vinho> menu = new ArrayList<>();

        menu.add(vinho1);
        menu.add(vinho2);

        menu.contains("uvaBoa");



        return menu.toString();



    }

    @Override
    public String placeOrder(String name, Integer quantity) {
        return "Pedido confirmado!";
    }
}
