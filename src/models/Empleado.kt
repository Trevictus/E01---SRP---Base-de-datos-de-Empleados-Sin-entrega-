package models

class Empleado(val id: Int, var nombre: String, var puesto: String) {
    fun guardarEmpleado() {
        // Conexión a la base de datos
        println("Conectando a la base de datos...")
        // Lógica para guardar el empleado
        println("Models.Empleado $nombre guardado en la base de datos")
    }

    fun eliminarEmpleado() {
        // Conexión a la base de datos
        println("Conectando a la base de datos...")
        // Lógica para eliminar el empleado
        println("Models.Empleado $nombre eliminado de la base de datos")
    }


}

