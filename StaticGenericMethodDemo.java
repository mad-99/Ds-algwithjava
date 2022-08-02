class StaticGenericMethodDemo{
	static<T> void genericPrint(T t){
		System.out.println(t.getClass().getName() + ":" +t);
	}
	public static void main(String[] args){
	genericPrint(101);
	genericPrint("Joy with Java");
	genericPrint(3.1412343);jajajjjjja
	}
}
