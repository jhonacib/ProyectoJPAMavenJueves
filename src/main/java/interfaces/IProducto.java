package interfaces;

import java.util.List;

import model.TblProducto;

public interface IProducto {
void RegistrarProducto(TblProducto tblProducto);
void ActualizarProducto(TblProducto tblProducto);
void EliminarProducto(TblProducto tblProducto);
List<TblProducto> ListarProducto();
TblProducto BuscarProducto(TblProducto tblProducto);
}
