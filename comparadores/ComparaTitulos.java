package comparadores;
import java.util.Comparator;

import practicaTema8y10.MaterialBibliografico;


public class ComparaTitulos  implements Comparator<MaterialBibliografico> {

	@Override
	public int compare(MaterialBibliografico o1, MaterialBibliografico o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
