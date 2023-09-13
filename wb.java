package practica.demo;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class wb extends Composite {
	private Text text;

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.SHELL_TRIM & (~SWT.RESIZE));
		shell.setLayout(new GridLayout(1, false));
		wb hola = new wb(shell, SWT.NONE);

		

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public wb(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));
		
		Label lblIngresaTuNombre = new Label(this, SWT.NONE);
		lblIngresaTuNombre.setText("Ingresa tu nombre");
		
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		Button btnListo = new Button(this, SWT.PUSH);
		btnListo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(text.getText());
			}
		});
	
		btnListo.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnListo.setText("Listo");

	}


	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
