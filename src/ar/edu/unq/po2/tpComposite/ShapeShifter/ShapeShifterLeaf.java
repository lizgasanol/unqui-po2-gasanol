package ar.edu.unq.po2.tpComposite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter {
	
	private Integer value;
	
	public ShapeShifterLeaf(Integer value) {
		this.value = value;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeshifter) {
		ShapeShifterComposite ret = new ShapeShifterComposite();
		ret.addShapeShifter(this);
		ret.addShapeShifter(shapeshifter);
		return ret;
	}

	@Override
	public Integer deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> ret = new ArrayList<Integer>();
		ret.add(this.value);
		return ret;
	}

	@Override
	public List<IShapeShifter> getShapeShifters() {
		List<IShapeShifter> ret = new ArrayList<IShapeShifter>();
		ret.add(this);
		return ret;
	}

	@Override
	public void addShapeShifter(IShapeShifter shapeShifter2) {
	}
	
	
}
