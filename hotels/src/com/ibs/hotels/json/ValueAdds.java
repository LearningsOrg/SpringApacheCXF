package com.ibs.hotels.json;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ValueAdds")
public class ValueAdds {
	@XmlAttribute(name = "size")
	Integer size;
	
	@XmlElement(name = "ValueAdd")
	ValueAdd valueAdd;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public ValueAdd getValueAdd() {
		return valueAdd;
	}

	public void setValueAdd(ValueAdd valueAdd) {
		this.valueAdd = valueAdd;
	}
	
	
}
