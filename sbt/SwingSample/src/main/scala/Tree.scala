package main.scala

import scala.swing.Component
import javax.swing.JTree
import javax.swing.tree.TreeModel

class Tree(model:TreeModel) extends Component{
	override lazy val peer :JTree = new JTree(model) with SuperMixin
}

