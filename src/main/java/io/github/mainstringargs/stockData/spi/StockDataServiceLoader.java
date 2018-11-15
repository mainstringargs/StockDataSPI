package io.github.mainstringargs.stockData.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

// TODO: Auto-generated Javadoc
/**
 * The Class StockDataServiceLoader.
 */
public class StockDataServiceLoader {

  /** The stock data service. */
  private static List<StockDataService> stockDataService;

  static {
    stockDataService = new ArrayList<StockDataService>();
    for (StockDataService sds : ServiceLoader.load(StockDataService.class)) {
      stockDataService.add(sds);
    }
  }

  /**
   * Gets the stock data services.
   *
   * @return the stock data services
   */
  public static List<StockDataService> getStockDataServices() {
    return stockDataService;

  }

}
