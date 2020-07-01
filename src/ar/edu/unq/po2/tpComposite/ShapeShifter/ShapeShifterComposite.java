package ar.edu.unq.po2.tpComposite.ShapeShifter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeShifterComposite implements IShapeShifter{
	
	private List<IShapeShifter> shapeshifters = new ArrayList<IShapeShifter>();

	@Override
	public IShapeShifter compose(IShapeShifter shapeshifter) {
		ShapeShifterComposite ret = new ShapeShifterComposite();
		ret.addShapeShifter(this);
		ret.addShapeShifter(shapeshifter);
		return ret;
	}

	@Override
	public Integer deepest() {
		List<Integer> ret = new ArrayList<Integer>();
		
		for(IShapeShifter shapeshifter : this.shapeshifters) {
			ret.add(shapeshifter.deepest());
		}
		
		return Collections.max(ret) + 1;
	}

	// ESTO ES HORRIBLE, COMO DEJASTE QUE PASE ESTO?
	@Override
	public IShapeShifter flat() {
		IShapeShifter ret = new ShapeShifterComposite();
		
		for(IShapeShifter shapeShifter : this.shapeshifters) {
			for(IShapeShifter shapeShifter2 : shapeShifter.flat().getShapeShifters()) {
				ret.addShapeShifter(shapeShifter2);
			}
		}
				
		return ret;
	}

	@Override
	public List<Integer> values() {
		List<Integer> ret = new ArrayList<Integer>();
		
		for(IShapeShifter shapeShifter : this.shapeshifters) {
			ret.addAll(shapeShifter.values());
		}
		
		return ret;
	}
	
	@Override
	public void addShapeShifter(IShapeShifter shapeshifter) {
		this.shapeshifters.add(shapeshifter);
	}
	
	public List<IShapeShifter> getShapeShifters() {
		return this.shapeshifters;
	}
}
