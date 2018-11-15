package io.github.mainstringargs.stockData.spi;

import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Interface StockDataService.
 */
public interface StockDataService {

  /**
   * Inits the Service.
   */
  public void init();

  /**
   * Gets the service name.
   *
   * @return the service name
   */
  public String getServiceName();

  /**
   * Gets the stock data.
   *
   * @param tickers the tickers
   * @return the stock data
   */
  public Map<String, Map<String, Object>> getStockData(String... tickers);

}
