package io.github.mainstringargs.stockData.spi;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

// TODO: Auto-generated Javadoc
/**
 * The Class StockDataServiceLoader.
 */
public class StockDataServiceLoader {

  /** The stock data service. */
  private static Map<String, StockDataService> stockDataServices;

  static {
    stockDataServices = new HashMap<String, StockDataService>();
    for (StockDataService sds : ServiceLoader.load(StockDataService.class)) {
      stockDataServices.put(sds.getServiceName(), sds);
    }
  }

  /**
   * Gets the stock data services.
   *
   * @return the stock data services
   */
  public static Map<String, StockDataService> getStockDataServices() {
    return stockDataServices;

  }

}
