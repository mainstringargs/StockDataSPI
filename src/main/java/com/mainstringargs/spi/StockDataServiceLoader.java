package com.mainstringargs.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class StockDataServiceLoader {

  private static List<StockDataService> stockDataService;

  static {
    stockDataService = new ArrayList<StockDataService>();
    for (StockDataService sds : ServiceLoader.load(StockDataService.class)) {
      System.out.println(sds);
      stockDataService.add(sds);
    }
  }

  public static List<StockDataService> getStockDataServices() {
    return stockDataService;

  }

}
