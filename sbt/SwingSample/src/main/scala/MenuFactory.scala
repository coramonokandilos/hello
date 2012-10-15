package main.scala

import swing.event.Key
import swing._
import swing.{MenuBar,Menu,MenuItem}
import swing.Action
import javax.swing._

class MenuFactory{
	def createPopup():PopupMenu={
		val popupMenu = new PopupMenu		
		val item = new MenuItem(Action("Hello"){
//			def apply={println "HOGEHOGE"}
		})
		val item2 = new MenuItem(Action("Hello2"){
//			def apply={println "HOGEHOGE"}
		})
		popupMenu.add(item)
		popupMenu.add(item2)
		popupMenu
	}
	/**
	*/
	def createMenu(frame:Frame)={
		val lafmap=Map( "Metal"->"javax.swing.plaf.metal.MetalLookAndFeel","Motif"->"com.sun.java.swing.plaf.motif.MotifLookAndFeel", "Windows"->"com.sun.java.swing.plaf.windows.WindowsLookAndFeel", "WindowsClassic"->"com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel",
	"Mac"->"com.sun.java.swing.plaf.mac.MacLookAndFeel")


		val menuBar:MenuBar = new MenuBar()
		val fileMenu = new Menu("File(F)"){ mnemonic = Key.F }
		val newItem = new MenuItem(Action("New(N)"){println("New")}){mnemonic = Key.N}
		val quitItem = new MenuItem(Action("Quit(Q)"){println("Quit");frame.dispose}){mnemonic = Key.Q}
		fileMenu.contents += newItem
		fileMenu.contents += quitItem
		val toolMenu = new Menu("Tool(T)"){mnemonic = Key.T }
		val lookMenu = new Menu("Look & Feel(L)"){mnemonic = Key.L}
		toolMenu.contents += lookMenu
		lafmap.foreach{ case(k,v) =>
			val lafItem = new MenuItem(Action(k){println(v)
			UIManager.setLookAndFeel(v);
			SwingUtilities.updateComponentTreeUI(frame.peer)
			}){}
			lookMenu.contents += lafItem

		}
		val helpMenu = new Menu("Help(H)"){mnemonic = Key.H }
	 	menuBar.contents += fileMenu
	 	menuBar.contents += toolMenu
	 	menuBar.contents += helpMenu
		menuBar
	}

}

