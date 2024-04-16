package comparadores;

import java.util.Comparator;

import practicaTema8y10.MaterialBibliografico;

public class ComparaAutores implements Comparator<MaterialBibliografico> {

	//ComparaAutores:  ordena los materiales según su autor por orden alfabético.
	
	@Override
	public int compare(MaterialBibliografico o1, MaterialBibliografico o2) {
		
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
