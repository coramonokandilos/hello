import net.java.amateras.xlsbeans.annotation.Column;

public class Stock implements IStock {
  private String name;
  private String market;
  private String price;
  private String stockCode;
  private String volume;

  //このプロパティはシート上の「市場」とマッピング
  //セルの結合をサポートする
  @Column(columnName = "市場", merged = true) 
  public void setMarket(String market) {this.market = market;}

  //このプロパティはシート上の「銘柄」とマッピング
  @Column(columnName = "銘柄")
  public void setName(String name) {this.name = name;}

  //このプロパティはシート上の「現在値」とマッピング
  @Column(columnName = "現在値")
  public void setPrice(String price) {this.price = price;}

  //このプロパティはシート上の「コード」とマッピング
  @Column(columnName = "コード")
  public void setStockCode(String stockCode) {this.stockCode = stockCode;}

  //このプロパティはシート上の「出来高」とマッピング
  @Column(columnName = "出来高")
  public void setVolume(String volume) {this.volume = volume;}

@Override
public String getMarket() {
	// TODO Auto-generated method stub
	return market;
}

@Override
public String getStockCode() {
	// TODO Auto-generated method stub
	return stockCode;
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return name;
}

@Override
public String getPrice() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getVolume() {
	// TODO Auto-generated method stub
	return null;
}

  // getterは省略してます...
}