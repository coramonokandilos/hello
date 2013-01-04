xlsbeansサンプル
=================

[xmlbeansのページ](http://amateras.sourceforge.jp/site/xlsbeans/ "xlsbeansのページ")を参考にして
サンプルを作成しました。

XLSBeansの実行方法
------------------------

* 単一シートの読み込み
 * XLSBeansのloadメソッドを実行
* 複数シートの読み込み
 * XLSBeansのloadMutipleメソッドを実行 
* Annotationの代わりにXMLの設定ファイルを使用
 * loadメソッドのxmlを引数を持つメソッドを実行 
 * OGNLを利用して記述する。
  * [seasarのOGNL説明](http://s2container.seasar.org/2.4/ja/ognl.html )
  * OGNLはMVELに移行


Annotationの追加方法
------------------------

* Annotationを作成する。
 * Target,Retentionを追加することに注意
* FieldProcessor Interfaceを実装したクラスを作成する。
* Beansに上記で作成しているAnnotationを定義
*　実行のデフォルトのクラスパスにxmlbeans.propertiesを配置する。(FieldProcessorFactory.registerProcessorを実行でもよい）
 * xlsbeans.propertiesの中に下記フォーマットで記述する。
 * AnnotationのFQDN = FieldProcessorのFQDN
 



Annotationの種類
-----------------

* Cell
 * セルのrow,columnを指定する。
* Column
 * ColumnName
 * merged
 * headerMerged
 * Optional
* HorizontalRecords
 * optional
 * tableLabel
 * terminateLabel
 * headerRow
 * headerColumn
 * recordClass
 * terminal
 * range
 * bottom
 * headerLimit
* HorizontalRecordsForIterateTable
 * HorizontalRecordsと同じ?
* IterateTables
 * tableLabel
 * tableClass
 * bottom
 * optional
* LabelledCell
 * optional
 * range
 * labelColumn
 * labelRow
 * type
 * label
 * headerLabel
 * skip
* LabelledCellForIterateTable
 * LabelledCellと同じ
* LabelledCellType
 * annotationのenum
* MapColumns
 * previousColumnName
* PostProcess
 * 引数なし、
 * 
* RecordTerminal
 * enum
* Sheet
 * name
 * regex
 * number
* SheetName
 * 引数なし
* VerticalRecords
 * optional
 * tableLabel
 * terminateLabel
 * headerColumn
 * headerRow
 * recordClass
 * terminal
 * range
 * headerLimit
