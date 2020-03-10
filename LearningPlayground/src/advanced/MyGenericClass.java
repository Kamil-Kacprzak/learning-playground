package advanced;

import java.lang.reflect.Type;

public class MyGenericClass<T extends Number> 
					implements FunctionalIfce{
	
	private T value;
	// Lambda implementation of interface
	public FunctionalIfce fIfce = () -> {
		Type parameterType = value.getClass();
		return parameterType;
	};
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "The value is equal: "+value+" and it's type: "+fIfce.getType();
	}
	
	//Stadard implementation ###  Lambda implementation above
	/*
	@Override
	public Type getType() {
		Type parameterType = value.getClass();
		return parameterType;
	}
	*/

}
