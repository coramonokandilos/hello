import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import net.java.amateras.xlsbeans.XLSBeans;
import net.java.amateras.xlsbeans.XLSBeansException;
import net.java.amateras.xlsbeans.example.SheetObject;

public class Main {
	public static void main(String[] args) throws FileNotFoundException,
			XLSBeansException {

		// sample();
		sampleXml();
	}

	/**
	 * XMLの設定ファイルを利用してパースするパターン
	 * 
	 * @throws XLSBeansException
	 * @throws FileNotFoundException
	 */
	private static void sampleXml() throws FileNotFoundException,
			XLSBeansException {
		SheetObject sheet = new XLSBeans().load(new FileInputStream(
				"xls/example.xls"), new FileInputStream("xml/example.xml"),
				SheetObject.class);
		System.out.println(sheet.getTitle());
	}

	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws XLSBeansException
	 */
	private static void sample() throws FileNotFoundException,
			XLSBeansException {
		InputStream in = new FileInputStream("株価ファイル.xls");
		// streamからStocksクラスを作成
		// ここでアノテーションからJavaBeansのマッピングがされ、
		// インスタンスまで生成される
		Stocks stocks = new XLSBeans().load(in, Stocks.class);
		List<IStock> list = stocks.getStocks();
		for (IStock stock : list) {
			System.out.println(stock);
			System.out.println(stock.getName());

		}

	}
}