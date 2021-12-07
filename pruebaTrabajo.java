public class pruebaTrabajo{
    public static void main(String[] args){

	Empleado e1 = new Empleado();
	Empleado e2 = new Empleado("Mauricio");
	Operador o1 = new Operador();
	Operador o2 = new Operador("Marco");
	Directivo d1 = new Directivo();
	Directivo d2 = new Directivo("Eduardo");
	Oficial of1 = new Oficial();
	Oficial of2 = new Oficial("Pablo");
	Tecnico t1 = new Tecnico();
	Tecnico t2 = new Tecnico("Yanpol");

	System.out.println();
	
	System.out.println(e1.toString());
	System.out.println(e2.toString());
	System.out.println(e1.getNombre());	
	System.out.println(e2.getNombre());

        e1.setNombre("Urigod");	
	e2.setNombre("Maau");

	System.out.println(e1.toString());
	System.out.println(e2.toString());
	System.out.println(e1.getNombre());	
	System.out.println(e2.getNombre());

	
	System.out.println(o1.toString());
	System.out.println(o2.toString());
	System.out.println(o1.getNombre());	
	System.out.println(o2.getNombre());

	o1.setNombre("Urigod");	
	o2.setNombre("Marcacas");

	System.out.println(o1.toString());
	System.out.println(o2.toString());
	System.out.println(o1.getNombre());	
	System.out.println(o2.getNombre());

	
	System.out.println(d1.toString());
	System.out.println(d2.toString());
	System.out.println(d1.getNombre());	
	System.out.println(d2.getNombre());

	d1.setNombre("Urigod");	
	d2.setNombre("Late");

	System.out.println(d1.toString());
	System.out.println(d2.toString());
	System.out.println(d1.getNombre());	
	System.out.println(d2.getNombre());

	
	
	System.out.println(of1.toString());
	System.out.println(of2.toString());
	System.out.println(of1.getNombre());	
	System.out.println(of2.getNombre());

	of1.setNombre("Urigod");	
	of2.setNombre("Puvlo");

	System.out.println(of1.toString());
	System.out.println(of2.toString());
	System.out.println(of1.getNombre());	
	System.out.println(of2.getNombre());

	System.out.println(of1.trabaja());
	System.out.println(of2.trabaja());
	
	System.out.println(t1.toString());
	System.out.println(t2.toString());
	System.out.println(t1.getNombre());	
	System.out.println(t2.getNombre());

	t1.setNombre("Urigod");	
	t2.setNombre("Yanpopol");

	System.out.println(t1.toString());
	System.out.println(t2.toString());
	System.out.println(t1.getNombre());	
	System.out.println(t2.getNombre());

	System.out.println(t1.trabaja());
	System.out.println(t2.trabaja());
    }
}
