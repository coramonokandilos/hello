package main.scala

import swing._
import javax.swing._
import swing.event.Key
import swing.{MenuBar,Menu,MenuItem}
import swing.Action
import javax.swing.tree._
import scala.swing.event._
import javax.swing.DefaultCellEditor

object SwingApp extends SimpleSwingApplication{
/*
	implicit def doubleToInt(x:Double) = x.toInt
*/

	def createTreeNode:DefaultMutableTreeNode={
	    val root = new DefaultMutableTreeNode("root")
		for(i <- 1 to 10){
			val item = new DefaultMutableTreeNode("data"+i)
	    	root.add(item)
			for(j <- 1 to 10){
				val item2 = new DefaultMutableTreeNode("data["+i+"]["+j+"]")
		    	item.add(item2)
			}
		}
		root
	}
	/** */
	def top = new MainFrame{ frame =>
		//var lafClassName="javax.swing.plaf.metal.MetalLookAndFeel"
		//UIManager.setLookAndFeel(lafClassName);
		title="SampleSwing Application"
		menuBar =  (new MenuFactory).createMenu(frame)

		contents = new SplitPane(Orientation.Vertical){
			leftComponent = new ScrollPane(){
			
			    val model = new DefaultTreeModel(createTreeNode)
				val popup =  (new MenuFactory).createPopup
				val tree = (new TreeFactory).createTree(model,popup)
				val editor:DefaultCellEditor = new DefaultCellEditor(new JTextField(10))
				tree.setCellEditor(editor)
			    contents = tree
			
			}
			
			rightComponent = new ScrollPane(){
				val tabPane = new TabbedPane {
    				 preferredSize = new Dimension(256, 212)
    			}
//				tabPane.pages += new TabbedPane.Page("Title",new Label("TEST"))
				///////
				contents = tabPane
			}
		}
	}
}

