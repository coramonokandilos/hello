package com.ponta027.rcp.sample.ui.actions;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class SampleDialogView implements SampleContents {

	private StructuredViewer viewer;

	@Override
	public void create(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);

		// Graph g = new Graph(parent, SWT.NONE);
		//
		// GraphNode n = new GraphNode(g, SWT.NONE, "Paper");
		// GraphNode n2 = new GraphNode(g, SWT.NONE, "Rock");
		// GraphNode n3 = new GraphNode(g, SWT.NONE, "Scissors");
		// new GraphConnection(g, SWT.NONE, n, n2);
		// new GraphConnection(g, SWT.NONE, n2, n3);
		// new GraphConnection(g, SWT.NONE, n3, n);
		// g.setLayoutAlgorithm(new SpringLayoutAlgorithm(
		// LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);

		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		Canvas canvas = new Canvas(composite, SWT.None);

		//
		setDrop(canvas);
		//
		canvas.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		LightweightSystem lws = new LightweightSystem(canvas);
		IFigure contents = new Figure();
		XYLayout contentsLayout = new XYLayout();

		contents.setLayoutManager(contentsLayout);

		Font classFont = new Font(null, "Arial", 12, SWT.BOLD);

		// Label classLabel1 = new Label("Table", new Image(d,
		// UMLClassFigureTest.class.getResourceAsStream("class_obj.gif")));
		// classLabel1.setFont(classFont);

		// Label classLabel2 = new Label("Column", new Image(d,
		// UMLClassFigureTest.class.getResourceAsStream("class_obj.gif")));
		// classLabel2.setFont(classFont);
		Image i = null;
		Label classLabel1 = new Label("Table", i);
		Label classLabel2 = new Label("Column", i);

		classLabel2.addFigureListener(new FigureListener() {

			@Override
			public void figureMoved(IFigure source) {
				// TODO Auto-generated method stub

			}
		});
		contents.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseHover(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent me) {
				System.out.println("mouseDragged");

			}
		});
		contents.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent me) {
				ISelection selection = viewer.getSelection();
				if (selection instanceof StructuredSelection) {
					Object firstElement = ((StructuredSelection) selection)
							.getFirstElement();
					if (firstElement instanceof SampleDialogData) {
						String name = ((SampleDialogData) firstElement)
								.getName();
						Point location = me.getLocation();
						System.out.println(location.x + ":" + location.y);
					}
				}
			}

			@Override
			public void mousePressed(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClicked(MouseEvent me) {
				// TODO Auto-generated method stub

			}
		});

		// classLabel1.addMouseListener(listener)
		final UMLClassFigure classFigure = new UMLClassFigure(classLabel1);
		final UMLClassFigure classFigure2 = new UMLClassFigure(classLabel2);

		// Label attribute1 = new Label("columns: Column[]", new Image(d,
		// UMLClassFigure.class
		// .getResourceAsStream("field_private_obj.gif")));
		// Label attribute2 = new Label("rows: Row[]", new Image(d,
		// UMLClassFigure.class
		// .getResourceAsStream("field_private_obj.gif")));
		// Label attribute3 = new Label("columnID: int", new Image(d,
		// UMLClassFigure.class
		// .getResourceAsStream("field_private_obj.gif")));
		// Label attribute4 = new Label("items: List", new Image(d,
		// UMLClassFigure.class
		// .getResourceAsStream("field_private_obj.gif")));
		//
		// classFigure.getAttributesCompartment().add(attribute1);
		// classFigure.getAttributesCompartment().add(attribute2);
		// classFigure2.getAttributesCompartment().add(attribute3);
		// classFigure2.getAttributesCompartment().add(attribute4);
		//
		// Label method1 = new Label("getColumns(): Column[]", new Image(d,
		// UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
		// Label method2 = new Label("getRows(): Row[]", new Image(d,
		// UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
		// Label method3 = new Label("getColumnID(): int", new Image(d,
		// UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
		// Label method4 = new Label("getItems(): List", new Image(d,
		// UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
		//
		// classFigure.getMethodsCompartment().add(method1);
		// classFigure.getMethodsCompartment().add(method2);
		// classFigure2.getMethodsCompartment().add(method3);
		// classFigure2.getMethodsCompartment().add(method4);

		contentsLayout
				.setConstraint(classFigure, new Rectangle(10, 10, -1, -1));

		contentsLayout.setConstraint(classFigure2, new Rectangle(200, 200, -1,
				-1));

		/* Creating the connection */
		PolylineConnection c = new PolylineConnection();
		ChopboxAnchor sourceAnchor = new ChopboxAnchor(classFigure);
		ChopboxAnchor targetAnchor = new ChopboxAnchor(classFigure2);
		c.setSourceAnchor(sourceAnchor);
		c.setTargetAnchor(targetAnchor);

		/* Creating the decoration */
		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-2, 2);
		decorationPointList.addPoint(-4, 0);
		decorationPointList.addPoint(-2, -2);
		decoration.setTemplate(decorationPointList);
		c.setSourceDecoration(decoration);

		/* Adding labels to the connection */
		ConnectionEndpointLocator targetEndpointLocator = new ConnectionEndpointLocator(
				c, true);
		targetEndpointLocator.setVDistance(15);
		Label targetMultiplicityLabel = new Label("1..*");
		c.add(targetMultiplicityLabel, targetEndpointLocator);

		ConnectionEndpointLocator sourceEndpointLocator = new ConnectionEndpointLocator(
				c, false);
		sourceEndpointLocator.setVDistance(15);
		Label sourceMultiplicityLabel = new Label("1");
		c.add(sourceMultiplicityLabel, sourceEndpointLocator);

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				c, true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(-20);
		Label relationshipLabel = new Label("contains");
		c.add(relationshipLabel, relationshipLocator);

		contents.add(classFigure);
		contents.add(classFigure2);
		contents.add(c);

		lws.setContents(contents);
	}

	public void add(StructuredViewer viewer) {

		this.viewer = viewer;
	}

	private void setDrop(Composite composite) {
		int operations = DND.DROP_TARGET_MOVE | DND.DROP_MOVE;
		DropTarget target = new DropTarget(composite, operations);
		Transfer[] transferTypes = new Transfer[] { TextTransfer.getInstance() };
		target.setTransfer(transferTypes);
		target.addDropListener(new DropTargetListener() {

			@Override
			public void dropAccept(DropTargetEvent event) {
				// TODO Auto-generated method stub

			}

			@Override
			public void drop(DropTargetEvent event) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dragOver(DropTargetEvent event) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dragOperationChanged(DropTargetEvent event) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dragLeave(DropTargetEvent event) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dragEnter(DropTargetEvent event) {
				// TODO Auto-generated method stub

			}
		});

		// tableViewer.addDragSupport(operations, transferTypes, new
		// DragSourceListene);

	}
}
