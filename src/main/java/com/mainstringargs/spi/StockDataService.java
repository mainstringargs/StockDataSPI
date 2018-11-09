package com.mainstringargs.spi;

import java.util.Map;

public interface StockDataService {

  public void init();

  public String getServiceName();

  public Map<String, Map<String, Object>> getStockData(String... tickers);

}
