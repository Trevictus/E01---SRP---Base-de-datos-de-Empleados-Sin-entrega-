import models.Empleado
import models.Informe

fun main() {
    val empleado = Empleado(1, "Juan Pérez", "Desarrollador")
    empleado.guardarEmpleado()
    empleado.eliminarEmpleado()

    val informe = Informe()
    informe.generarInformeEmpleado(empleado)
}