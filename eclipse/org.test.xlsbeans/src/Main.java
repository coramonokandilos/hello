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
	 * XML�̐ݒ�t�@�C���𗘗p���ăp�[�X����p�^�[��
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
		InputStream in = new FileInputStream("�����t�@�C��.xls");
		// stream����Stocks�N���X���쐬
		// �����ŃA�m�e�[�V��������JavaBeans�̃}�b�s���O������A
		// �C���X�^���X�܂Ő��������
		Stocks stocks = new XLSBeans().load(in, Stocks.class);
		List<IStock> list = stocks.getStocks();
		for (IStock stock : list) {
			System.out.println(stock);
			System.out.println(stock.getName());

		}

	}
}