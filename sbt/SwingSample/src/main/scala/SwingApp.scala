package main.scala

import swing._
import javax.swing._
import swing.event.Key
import swing.{MenuBar,Menu,MenuItem}
import swing.Action
import javax.swing.tree._

object SwingApp extends SimpleSwingApplication{
	def top = new MainFrame{ frame =>
		var lafClassName="javax.swing.plaf.metal.MetalLookAndFeel"
		UIManager.setLookAndFeel(lafClassName);
		title="SampleSwing Application"
		menuBar =  (new MenuFactory).createMenu(frame)

		contents = new SplitPane(Orientation.Vertical){
			leftComponent = new ScrollPane(){
			    val root = new DefaultMutableTreeNode("root")
			    root.add(new DefaultMutableTreeNode("data1"))
			    root.add(new DefaultMutableTreeNode("data2"))
			    root.add(new DefaultMutableTreeNode("data3"))
			    val model = new DefaultTreeModel(root)
			    val tree = new Tree(model)
				
				//val listener  = new ShowObjectHandler()
				//tree.addMouseListener(listener)
				//tree.addKeyListener(listener)
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

