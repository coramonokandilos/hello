xlsbeans�T���v��
=================

[xmlbeans�̃y�[�W](http://amateras.sourceforge.jp/site/xlsbeans/ "xlsbeans�̃y�[�W")���Q�l�ɂ���
�T���v�����쐬���܂����B

XLSBeans�̎��s���@
------------------------

* �P��V�[�g�̓ǂݍ���
 * XLSBeans��load���\�b�h�����s
* �����V�[�g�̓ǂݍ���
 * XLSBeans��loadMutiple���\�b�h�����s 
* Annotation�̑����XML�̐ݒ�t�@�C�����g�p
 * load���\�b�h��xml�������������\�b�h�����s 
 * OGNL�𗘗p���ċL�q����B
  * [seasar��OGNL����](http://s2container.seasar.org/2.4/ja/ognl.html )
  * OGNL��MVEL�Ɉڍs


Annotation�̒ǉ����@
------------------------

* Annotation���쐬����B
 * Target,Retention��ǉ����邱�Ƃɒ���
* FieldProcessor Interface�����������N���X���쐬����B
* Beans�ɏ�L�ō쐬���Ă���Annotation���`
*�@���s�̃f�t�H���g�̃N���X�p�X��xmlbeans.properties��z�u����B(FieldProcessorFactory.registerProcessor�����s�ł��悢�j
 * xlsbeans.properties�̒��ɉ��L�t�H�[�}�b�g�ŋL�q����B
 * Annotation��FQDN = FieldProcessor��FQDN
 



Annotation�̎��
-----------------

* Cell
 * �Z����row,column���w�肷��B
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
 * HorizontalRecords�Ɠ���?
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
 * LabelledCell�Ɠ���
* LabelledCellType
 * annotation��enum
* MapColumns
 * previousColumnName
* PostProcess
 * �����Ȃ��A
 * 
* RecordTerminal
 * enum
* Sheet
 * name
 * regex
 * number
* SheetName
 * �����Ȃ�
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
