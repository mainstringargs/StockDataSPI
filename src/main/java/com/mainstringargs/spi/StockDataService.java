package com.mainstringargs.spi;

import java.util.Map;

/**
 * The Interface StockDataService.
 */
public interface StockDataService {

  /**
   * Inits the.
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
