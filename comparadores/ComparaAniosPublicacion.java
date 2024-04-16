package comparadores;

import java.util.Comparator;

import practicaTema8y10.MaterialBibliografico;

public class ComparaAniosPublicacion implements Comparator<MaterialBibliografico>{

	//ComparaAniosPublicacion: ordena los materiales según el año de publicación más reciente.
	@Override
	public int compare(MaterialBibliografico o1, MaterialBibliografico o2) {
	
		return o2.getAnioPublicacion()-o1.getAnioPublicacion();
	}

}
