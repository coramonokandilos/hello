package main.scala

import javax.swing.tree._
import scala.swing.event._

class TreeFactory{
	def createTree(model:DefaultTreeModel,popup:PopupMenu):Tree={
		val tree = new Tree(model){
			listenTo(this.mouse.clicks)
			reactions +={
				case MouseClicked(source, point, modifiers, clicks, triggersPopup) => {
					modifiers match{
					case n:Int if(n == 128)=>{ popup.show(source, point.getX.toInt , point.getY.toInt )}
					case _=> {}
					}
				}
			}
		}
		tree
	}
}

