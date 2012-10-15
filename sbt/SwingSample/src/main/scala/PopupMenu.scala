package main.scala

import scala.swing.Component
import scala.swing.MenuItem
import javax.swing.JPopupMenu

class PopupMenu extends Component{
	override lazy val peer : JPopupMenu = new JPopupMenu
	def add(item :MenuItem):Unit ={peer.add(item.peer)}
	def setVisible(visible:Boolean):Unit={peer.setVisible(visible)}
	def show(component:Component , x:Int, y:Int):Unit=peer.show(component.peer,x,y)
}

