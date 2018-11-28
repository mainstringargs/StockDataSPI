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
   * Gets the short version of the service name.
   *
   * @return the short version of the service name
   */
  public String getShortServiceName();

  /**
   * Gets the stock data for one ticker.
   *
   * @param ticker the ticker
   * @return the stock data
   */
  public Map<String, Object> getStockData(String ticker);

  /**
   * Gets the stock data.
   *
   * @param tickers the tickers
   * @return the stock data
   */
  public Map<String, Map<String, Object>> getStockData(String... tickers);

}
