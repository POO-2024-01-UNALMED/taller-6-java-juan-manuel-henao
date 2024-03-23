package vehiculos;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
public Fabricante(String nombre,Pais pais) {
	this.nombre=nombre;
	this.pais=pais;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
	}
public String getNombre() {
	return this.nombre;
	}
public void setPais(Pais pais) {
	this.pais=pais;
}
public Pais getPais() {
	return this.pais;
}

public static Fabricante fabricaMayorVentas() {
    Vehiculo respuesta = null;
    int maxRepeticiones = 0;
    for (Vehiculo candidato : Vehiculo.getListaCantidadVehiculos()) {
        int repeticion = 0;
        for (Vehiculo vehiculo : Vehiculo.getListaCantidadVehiculos()) {
            if (vehiculo.getFabricante().getNombre().equals(candidato.getFabricante().getNombre())) {
                repeticion++;
            }
        }
        if (repeticion > maxRepeticiones) {
            maxRepeticiones = repeticion;
            respuesta = candidato;
        }
    }
    if (respuesta != null) {
        return respuesta.getFabricante();
    } else {
        return null;
    }
}
}
