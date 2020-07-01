package ar.edu.unq.po2.tpComposite.ShapeShifter;

import java.util.List;

public interface IShapeShifter {
	
	public IShapeShifter compose(IShapeShifter shapeshifter);
	
	public Integer deepest();
	
	public IShapeShifter flat();
	
	public List<Integer> values();
	
	public List<IShapeShifter> getShapeShifters();

	public void addShapeShifter(IShapeShifter shapeShifter2);
}
