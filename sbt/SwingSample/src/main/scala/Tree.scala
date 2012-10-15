package main.scala

import scala.swing.Component
import javax.swing.JTree
import javax.swing.tree.TreeModel
import javax.swing.DefaultCellEditor

class Tree(model:TreeModel) extends Component{
	override lazy val peer :JTree = new JTree(model) with SuperMixin
	
	/** */
	def setCellEditor(editor: DefaultCellEditor) = peer.setCellEditor(editor)
	def setEditable(editable:Boolean)= peer.setEditable(editable)
}

