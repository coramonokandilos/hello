import net.java.amateras.xlsbeans.annotation.Column;

public class Stock implements IStock {
  private String name;
  private String market;
  private String price;
  private String stockCode;
  private String volume;

  //���̃v���p�e�B�̓V�[�g��́u�s��v�ƃ}�b�s���O
  //�Z���̌������T�|�[�g����
  @Column(columnName = "�s��", merged = true) 
  public void setMarket(String market) {this.market = market;}

  //���̃v���p�e�B�̓V�[�g��́u�����v�ƃ}�b�s���O
  @Column(columnName = "����")
  public void setName(String name) {this.name = name;}

  //���̃v���p�e�B�̓V�[�g��́u���ݒl�v�ƃ}�b�s���O
  @Column(columnName = "���ݒl")
  public void setPrice(String price) {this.price = price;}

  //���̃v���p�e�B�̓V�[�g��́u�R�[�h�v�ƃ}�b�s���O
  @Column(columnName = "�R�[�h")
  public void setStockCode(String stockCode) {this.stockCode = stockCode;}

  //���̃v���p�e�B�̓V�[�g��́u�o�����v�ƃ}�b�s���O
  @Column(columnName = "�o����")
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

  // getter�͏ȗ����Ă܂�...
}