package UI;

import java.awt.Color;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;

import Dominio.Asignacion;
import Dominio.Buscador;
import Dominio.Estudiante;
import Dominio.NotaConceptual;
import Dominio.RepositorioEstudiantes;

@SuppressWarnings("serial")
public class BuscadorView extends MainWindow<Buscador> {

	public BuscadorView(RepositorioEstudiantes repo) {
		super(new Buscador(repo));
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Buscador de Asignaciones");
		this.setMinHeight(350);
		this.setMinWidth(350);
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Ingrese un legajo: ").setWidth(350);
		new Label(mainPanel).setHeight(5).setWidth(350);
		new NumericField(mainPanel).setWidth(100).bindValueToProperty("legajo");

		new Button(mainPanel).setCaption("Buscar").onClick(() -> this.getModelObject().buscarEstudiante())
				.setAsDefault();

		new Label(mainPanel).setText("Nombre:").setBackground(Color.YELLOW).setHeight(20).setWidth(150).alignCenter();
		new Label(mainPanel).alignCenter().bindValueToProperty("nombre");
		new Label(mainPanel).setText("Apellido:").setBackground(Color.YELLOW).setHeight(20).setWidth(150).alignCenter();
		new Label(mainPanel).alignCenter().bindValueToProperty("apellido");

		Table<Asignacion> tabla = new Table<Asignacion>(mainPanel, Asignacion.class);
		tabla.bindItemsToProperty("asignaciones");

		new Column<Asignacion>(tabla).setTitle("Asignaciones").bindContentsToProperty("nombre");
		new Column<Asignacion>(tabla).setTitle("Nota").bindContentsToProperty("ultimaNota");

	}

	public static void main(String[] args) {
		Estudiante mole = new Estudiante("Agustin", "Mole", 123, "mole.boca");
		Asignacion asignacion = new Asignacion("TP Discreta", new NotaConceptual("R+"));

		mole.agregarAsignacion(asignacion);

		RepositorioEstudiantes repo = RepositorioEstudiantes.getInstancia();

		repo.agregarEstudiante(mole);

		new BuscadorView(repo).startApplication();
	}
}
