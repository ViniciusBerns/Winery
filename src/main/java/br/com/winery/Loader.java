package br.com.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {

        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();

        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        System.out.println("Web Service está no ar!");
    }


}
