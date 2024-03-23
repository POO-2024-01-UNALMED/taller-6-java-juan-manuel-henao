package vehiculos;

public class Pais {
	private String nombre;

public Pais(String nombre) {
	this.nombre=nombre;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}
public String getNombre() {
	return this.nombre;
}

public static Pais paisMasVendedor() {
    Vehiculo respuesta = null;
    int maxRepeticiones = 0;
    for (Vehiculo candidato : Vehiculo.getListaCantidadVehiculos()) {
        int repeticion = 0;
        for (Vehiculo vehiculo : Vehiculo.getListaCantidadVehiculos()) {
            if (vehiculo.getFabricante().getPais().getNombre().equals(candidato.getFabricante().getPais().getNombre())) {
                repeticion++;
            }
        }
        if (repeticion > maxRepeticiones) {
            maxRepeticiones = repeticion;
            respuesta = candidato;
        }
    }
    if (respuesta != null) {
        return respuesta.getFabricante().getPais();
    } else {
        return null;
    }
}

}
