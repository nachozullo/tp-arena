package UI;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import Dominio.Buscador;

@SuppressWarnings("serial")
public class BuscadorView extends MainWindow<Buscador> {

	public BuscadorView(int legajo) {
		super(new Buscador(legajo));
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Buscador de Asignaciones");
		mainPanel.setLayout(new VerticalLayout());
	}

	public static void main(String[] args) {
		new BuscadorView(123).startApplication();
	}
}
