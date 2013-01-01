import java.util.List;
import net.java.amateras.xlsbeans.annotation.HorizontalRecords;
import net.java.amateras.xlsbeans.annotation.Sheet;

@Sheet(name = "Š”‰¿î•ñ")
public class Stocks {
  private List<IStock> stocks;

  public List<IStock> getStocks() {return stocks;}

  @HorizontalRecords(tableLabel = "Œ»İ’lˆê——", recordClass = Stock.class)
  public void setStocks(List<IStock> stocks) {
    this.stocks = stocks;
  }
}