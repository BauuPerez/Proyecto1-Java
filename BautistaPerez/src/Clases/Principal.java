package Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<ProducPerez> listaProductos = new ArrayList<>();
		cargarProductosAutomaticos(listaProductos);

		int opcion = 0;
		while (opcion != 10) {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1:
				agregarProducto(listaProductos);
				break;
			case 2:
				quitarProducto(listaProductos);
				break;
			case 3:
				listarPorPrecio(listaProductos);
				break;
			case 4:
				listarPorNombre(listaProductos);
				break;
			case 5:
				listarPorCantidad(listaProductos);
				break;
			case 6:
				listarCantidadTotal(listaProductos);
				break;
			case 7:
				listarConTotal(listaProductos);
				break;
			case 8:
				listarElementosConJOptionPane(listaProductos, new Comparator<ProducPerez>() {
					public int compare(ProducPerez p1, ProducPerez p2) {
						return Float.compare(p1.getPrecio(), p2.getPrecio());
					}
				});
				break;
			case 9:
				listarElementosConJOptionPane(listaProductos, new Comparator<ProducPerez>() {

					public int compare(ProducPerez p1, ProducPerez p2) {
						return p1.getNombreDelProducto().compareTo(p2.getNombreDelProducto());
					}
				});
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "Gracias vuelva pronto!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida");
				break;
			}
		}
	}

	private static int mostrarMenu() {
		String opcionStr = JOptionPane
				.showInputDialog("MENU\n" + "1. Agregar producto\n" + "2. Quitar producto\n" + "3. Listar por precio\n"
						+ "4. Listar por nombre\n" + "5. Listar por cantidad\n" + "6. Listar cantidad total\n"
						+ "7. Listar con total\n" + "8. Listar elementos con JOptionPane (por precio)\n"
						+ "9. Listar elementos con JOptionPane (por nombre)\n" + "10. Salir\n" + "Ingrese una opción:");
		if (opcionStr != null) {
			return Integer.parseInt(opcionStr);
		} else {
			return 10;
		}
	}

	private static void agregarProducto(ArrayList<ProducPerez> listaProductos) {
		int codigo = Integer
				.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto (entre 1000 y 9999):"));
		String nombreDelProducto = JOptionPane
				.showInputDialog("Ingrese el nombre del producto (con la primera letra en mayúscula):");
		float precio = Float
				.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto (entre 0 y 10000):"));
		int cant = Integer
				.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades del producto (máximo 100):"));
		int porcentajeGanancia = Integer.parseInt(JOptionPane
				.showInputDialog("Ingrese el porcentaje de ganancia del producto (máximo 100, por defecto 50%):"));

		if (codigo >= 1000 && codigo <= 9999 && Character.isUpperCase(nombreDelProducto.charAt(0)) && precio >= 0
				&& precio <= 10000 && cant >= 0 && cant <= 100 && porcentajeGanancia >= 0
				&& porcentajeGanancia <= 100) {
			listaProductos.add(new ProducPerez(codigo, nombreDelProducto, precio, cant, porcentajeGanancia));
			JOptionPane.showMessageDialog(null, "Producto agregado");
		} else {
			JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos, ingrese otros datos");
		}
	}

	private static void quitarProducto(ArrayList<ProducPerez> listaProductos) {
		int codigo = Integer
				.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto que quieras quitar:"));
		Iterator<ProducPerez> iterator = listaProductos.iterator();
		while (iterator.hasNext()) {
			ProducPerez producto = iterator.next();
			if (producto.getCodigo() == codigo) {
				iterator.remove();
				JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "No se encontró un producto con el código ingresado");
	}

	private static void listarPorPrecio(ArrayList<ProducPerez> listaProductos) {
		Collections.sort(listaProductos, new Comparator<ProducPerez>() {
			public int compare(ProducPerez p1, ProducPerez p2) {
				return Float.compare(p1.getPrecio(), p2.getPrecio());
			}
		});
		mostrarLista(listaProductos);
	}

	private static void listarPorNombre(ArrayList<ProducPerez> listaProductos) {
		Collections.sort(listaProductos, new Comparator<ProducPerez>() {
			public int compare(ProducPerez p1, ProducPerez p2) {
				return p1.getNombreDelProducto().compareTo(p2.getNombreDelProducto());
			}
		});
		mostrarLista(listaProductos);
	}

	private static void listarPorCantidad(ArrayList<ProducPerez> listaProductos) {
		Collections.sort(listaProductos, new Comparator<ProducPerez>() {
			public int compare(ProducPerez p1, ProducPerez p2) {
				return Integer.compare(p1.getCant(), p2.getCant());
			}
		});
		mostrarLista(listaProductos);
	}

	private static void listarCantidadTotal(ArrayList<ProducPerez> listaProductos) {
		int cantidadTotal = 0;
		for (ProducPerez producto : listaProductos) {
			cantidadTotal += producto.getCant();
		}
		JOptionPane.showMessageDialog(null, "La cantidad total de productos es: " + cantidadTotal);
	}

	private static void listarConTotal(ArrayList<ProducPerez> listaProductos) {
		StringBuilder sb = new StringBuilder();
		for (ProducPerez producto : listaProductos) {
			float total = producto.getPrecio() * producto.getCant();
			sb.append(producto).append(" - Total: ").append(total).append("\n");
		}
		JOptionPane.showMessageDialog(null, sb.toString());
	}

	private static void listarElementosConJOptionPane(ArrayList<ProducPerez> listaProductos,
			Comparator<ProducPerez> comparator) {
		ArrayList<ProducPerez> listaOrdenada = new ArrayList<>(listaProductos);
		Collections.sort(listaOrdenada, comparator);

		StringBuilder sb = new StringBuilder();
		for (ProducPerez producto : listaOrdenada) {
			sb.append(producto).append("\n");
		}
		JOptionPane.showMessageDialog(null, sb.toString());
	}

	private static void cargarProductosAutomaticos(ArrayList<ProducPerez> listaProductos) {
		listaProductos.add(new ProducPerez(1001, "Manteca", 10.5f, 2, 15));
		listaProductos.add(new ProducPerez(4444, "Azucar", 8.75f, 6, 20));
		listaProductos.add(new ProducPerez(1500, "Cafe", 15.25f, 15, 25));
		listaProductos.add(new ProducPerez(7777, "Dulce de Leche", 12.0f, 25, 30));
		listaProductos.add(new ProducPerez(6060, "Harina", 7.8f, 1, 35));
	}

	private static void mostrarLista(ArrayList<ProducPerez> listaProductos) {
		StringBuilder sb = new StringBuilder();
		for (ProducPerez producto : listaProductos) {
			sb.append(producto).append("\n");
		}
		JOptionPane.showMessageDialog(null, sb.toString());
	}

}
