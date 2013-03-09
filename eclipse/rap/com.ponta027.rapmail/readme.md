mailサンプルの仕組み


拡張ポイントの設定
* org.eclipse.ui.commands
 * com.ponta027.rapmail.open
 * com.ponta027.rapmail.openMessage

これらはIDの定義のみ 
呼び出しを定義しているクラスは

OpenViewAction extends Action
 * setIds(CMD_ID)
 * setActionDefinitionId(CMD_ID)
 * setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin("com.ponta027.rapmail", "/icons/sample2.gif"));
MessagePopupAction
 * setId(ICommandIds.CMD_OPEN_MESSAGE);
 * setActionDefinitionId(ICommandIds.CMD_OPEN_MESSAGE);
 * setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin("com.ponta027.rapmail", "/icons/sample3.gif"));

ApplicationActionBarAdvisor
 * Actionを登録して、filemenu,toolbarに表示するように設定している。


これは拡張ポイントで下記を実施しているのと同じ事になる。
* org.eclipse.ui.commands
* ui.ActionSet
* ui.menu
