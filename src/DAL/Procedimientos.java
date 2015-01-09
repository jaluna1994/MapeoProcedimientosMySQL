/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Jaime Alvarez Luna
 */
public enum Procedimientos {

    ACTUALIZARCARGO("{CALL ActualizarCargo (?,?,?)}"),
    ACTUALIZARCATEGORIA("{CALL ActualizarCategoria (?,?,?,?)}"),
    ACTUALIZARCLIENTE("{CALL ActualizarCliente (?,?,?,?,?)}"),
    ACTUALIZARCONTACTO("{CALL ActualizarContacto (?,?,?,?)}"),
    ACTUALIZARCORREOCLIENTE("{CALL ActualizarCorreoCliente (?,?,?)}"),
    ACTUALIZARCORREOCONTACTO("{CALL ActualizarCorreoContacto (?,?,?)}"),
    ACTUALIZARCORREOEMPLEADO("{CALL ActualizarCorreoEmpleado (?,?,?)}"),
    ACTUALIZARDEDUCCION("{CALL ActualizarDeduccion (?,?,?)}"),
    ACTUALIZAREMPLEADO("{CALL ActualizarEmpleado (?,?,?,?,?,?,?,?,?)}"),
    ACTUALIZARPROVEEDOR("{CALL ActualizarProveedor (?,?,?,?)}"),
    ACTUALIZARTELEFONOCLIENTE("{CALL ActualizarTelefonoCliente (?,?,?)}"),
    ACTUALIZARTELEFONOCONTACTO("{CALL ActualizarTelefonoContacto (?,?,?)}"),
    ACTUALIZARTELEFONOEMPLEADO("{CALL ActualizarTelefonoEmpleado (?,?,?)}"),
    AGREGARCORREOCLIENTE("{CALL AgregarCorreoCliente (?,?)}"),
    AGREGARCORREOCONTACTO("{CALL AgregarCorreoContacto (?,?)}"),
    AGREGARCORREOEMPLEADO("{CALL AgregarCorreoEmpleado (?,?)}"),
    AGREGARTELEFONOCLIENTE("{CALL AgregarTelefonoCliente (?,?)}"),
    AGREGARTELEFONOCONTACTO("{CALL AgregarTelefonoContacto (?,?)}"),
    AGREGARTELEFONOEMPLEADO("{CALL AgregarTelefonoEmpleado (?,?)}"),
    BORRARCORREOCLIENTE("{CALL BorrarCorreoCliente (?,?)}"),
    BORRARCORREOCONTACTO("{CALL BorrarCorreoContacto (?,?)}"),
    BORRARCORREOEMPLEADO("{CALL BorrarCorreoEmpleado (?,?)}"),
    BORRARTELEFONOCLIENTE("{CALL BorrarTelefonoCliente (?,?)}"),
    BORRARTELEFONOCONTACTO("{CALL BorrarTelefonoContacto (?,?)}"),
    BORRARTELEFONOEMPLEADO("{CALL BorrarTelefonoEmpleado (?,?)}"),
    CAMBIARESTADOCLIENTE("{CALL CambiarEstadoCliente (?,?)}"),
    CAMBIARESTADOCONTACTO("{CALL CambiarEstadoContacto (?,?)}"),
    CAMBIARESTADOEMPLEADO("{CALL CambiarEstadoEmpleado (?,?)}"),
    CAMBIARESTADOPROVEEDOR("{CALL CambiarEstadoProveedor (?,?)}"),
    FECHAMENORIGUALACTUAL("{CALL FechaMenorIgualActual (?,?)}"),
    REGISTRARCARGO("{CALL RegistrarCargo (?,?)}"),
    REGISTRARCATEGORIA("{CALL RegistrarCategoria (?,?,?)}"),
    REGISTRARCLIENTE("{CALL RegistrarCliente (?,?,?,?)}"),
    REGISTRARCONTACTO("{CALL RegistrarContacto (?,?,?)}"),
    REGISTRARDEDUCCION("{CALL RegistrarDeduccion (?,?)}"),
    REGISTRAREMPLEADO("{CALL RegistrarEmpleado (?,?,?,?,?,?,?,?)}"),
    REGISTRARPROVEEDOR("{CALL RegistrarProveedor (?,?,?)}"),
    VALIDARCEDULA("{CALL ValidarCedula (?,?)}"),
    VALIDARCORREO("{CALL ValidarCorreo (?,?)}"),
    VALIDARINSS("{CALL ValidarINSS (?,?)}"),
    VALIDARRUC("{CALL ValidarRUC (?,?)}"),
    VALIDARTELEFONO("{CALL ValidarTelefono (?,?)}");

    private final String procedimiento;

    private Procedimientos(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String SQL() {
        return procedimiento;
    }
}
