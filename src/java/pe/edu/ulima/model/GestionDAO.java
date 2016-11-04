package pe.edu.ulima.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GestionDAO {

    public EntityManagerFactory emf;
    public EntityManager em;

    public void conectarse() {
        emf = Persistence.createEntityManagerFactory("LoginPU");
        em = emf.createEntityManager();
    }

    public void desconectarse() {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }

    public void registrarUsuario(Usuario usuario) {
        conectarse();

        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();

        desconectarse();
    }
    
    public void registrarCliente(Cliente cliente) {
        conectarse();

        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();

        desconectarse();
    }

    public void registrarReserva(Reserva reserva) {
        conectarse();

        em.getTransaction().begin();
        em.persist(reserva);
        em.getTransaction().commit();

        desconectarse();
    }

    
    public boolean validarLogueo(String username, String password) {

        conectarse();
        boolean estado = false;
        Query query = em.createQuery(
                "select user from Usuario user where user.username=:p1 and user.password=:p2");

        query.setParameter("p1", username);
        query.setParameter("p2", password);

        List<Usuario> usuarios = (List<Usuario>) query.getResultList();
        if (usuarios.size() == 0) {
            estado = false;
        } else {
            estado = true;
        }
        desconectarse();

        return estado;
    }

    //REGISTRAR CATEGORÍA:
    public void registrarCategoria(Categoria categoria) {
        conectarse();

        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();

        desconectarse();
    }

    //REGISTRAR PROVEEDOR:
    public void registrarProveedor(Proveedor proveedor) {
        conectarse();

        em.getTransaction().begin();
        em.persist(proveedor);
        em.getTransaction().commit();

        desconectarse();
    }

   
    

    //REGISTRAR PRODUCTO:
    public void registrarProducto(Producto producto) {
        conectarse();

        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();

        desconectarse();
    }

    public List<Categoria> obtenerCategorias() {
        conectarse();
        List<Categoria> categorias
                //Query query = em.createQuery(

                = em.createQuery("SELECT p FROM Categoria p").getResultList();
        desconectarse();
        return categorias;
    }

    public List<Personal> obtenerPersonal() {
        conectarse();
        List<Personal> personal
                //Query query = em.createQuery(

                = em.createQuery("SELECT p FROM Personal p").getResultList();
        desconectarse();
        return personal;
    }

    public List<Producto> obtenerProductos() {
        conectarse();
        List<Producto> productos
                //Query query = em.createQuery(

                = em.createQuery("SELECT p FROM Producto p").getResultList();
        desconectarse();
        return productos;
    }

    public List<Venta> obtenerVenta() {
        conectarse();
        List<Venta> venta
                //Query query = em.createQuery(

                = em.createQuery("SELECT v FROM Venta v").getResultList();
        desconectarse();
        return venta;
    }
    
    public List<Reserva> obtenerReservas() {
        conectarse();
        List<Reserva> reservas
                //Query query = em.createQuery(

                = em.createQuery("SELECT r FROM Reserva r").getResultList();
        desconectarse();
        return reservas;
    }

    public List<Producto> obtenerProductosActivos(String estado) {
        conectarse();
        List<Producto> productos = null;
        Query query = em.createQuery("select p from Producto p where p.estado=:p1");
        query.setParameter("p1", estado);

        desconectarse();
        return productos;
    }

    public List<Proveedor> obtenerProveedores() {
        conectarse();
        List<Proveedor> proveedores
                = em.createQuery("SELECT p FROM Proveedor p").getResultList();
        desconectarse();
        return proveedores;
    }

    public Categoria obtenerCategoriaSegunID(int idCategoria) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select c from Categoria c where c.id_categoria =:c1");
        query.setParameter("c1", idCategoria);
        Categoria categoria = null;
        try {
            categoria = (Categoria) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return categoria;
    }
    
    public Cliente obtenerClienteSegunID(int idReserva) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select c from Cliente c where c.id_cliente =:c1");
        query.setParameter("c1", idReserva);
        Cliente cliente = null;
        try {
            cliente = (Cliente) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return cliente;
    }

    public Personal obtenerPerSegunIDVenta(int idVenta) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select p.id_personal from Venta p where p.id_venta =:p1");
        query.setParameter("p1", idVenta);
        Personal personal = null;
        try {
            personal = (Personal) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return personal;
    }

    public Categoria obtenerCatSegunIDProd(int idProducto) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select p.id_categoria from Producto p where p.id_producto =:p1");
        query.setParameter("p1", idProducto);
        Categoria categoria = null;
        try {
            categoria = (Categoria) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return categoria;
    }

    public List<Producto> obtenerListaProdSegunIDVenta(int idVenta) {
        conectarse();
        List<Producto> productos = em.createQuery("select v.id_producto from Venta v where v.id_venta =:v1").getResultList();
        desconectarse();
        return productos;
    }

    public List<DetalleVenta> obtenerListaDetVentaSegunIDVenta(int idVenta) {
        conectarse();
        List<DetalleVenta> detVentas = em.createQuery("select id_detalleventa from Venta v where v.id_venta =:v1").getResultList();
        desconectarse();
        return detVentas;
    }

    /*
     public DetalleVenta obtenerDetVentaSegunIDVenta(int idVenta) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select id_detalleventa from Venta v where v.id_venta =:v1");
        query.setParameter("v1", idVenta);
        DetalleVenta detalleventa = null;
        try {
            detalleventa = (DetalleVenta) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return detalleventa;
    }*/
    public Producto obtenerProducto(int idProducto) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select p from Producto p where p.id_producto=:p1");
        query.setParameter("p1", idProducto);
        Producto producto = null;
        try {
            producto = (Producto) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return producto;
    }

    public Proveedor obtenerProSegunIDProd(int idProducto) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select p.id_proveedor from Producto p where p.id_producto =:p1");
        query.setParameter("p1", idProducto);
        Proveedor proveedor = null;
        try {
            proveedor = (Proveedor) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return proveedor;
    }

    /* public Proveedor obtenerProSegunIDProd(int idProducto) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select p.id_proveedor from Producto p where p.id_producto =:p1");
        query.setParameter("p1", idProducto);
        Proveedor proveedor = null;
        try {
            proveedor = (Proveedor) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return proveedor;
    }*/

    public Producto obtenerProductoSegunID(int idProducto) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select p from Producto p where p.id_producto =:p1");
        query.setParameter("p1", idProducto);
        Producto producto = null;
        try {
            producto = (Producto) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return producto;
    }
    
    public Reserva obtenerReservaSegunID(int idReserva) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select r from Reserva r where r.id_reserva =:r1");
        query.setParameter("r1", idReserva);
        Reserva reserva = null;
        try {
            reserva = (Reserva) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return reserva;
    }

    public Venta obtenerVentaSegunID(int idVenta) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select v from Venta v where v.id_venta =:v1");
        query.setParameter("v1", idVenta);
        Venta venta = null;
        try {
            venta = (Venta) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return venta;
    }

    public Proveedor obtenerProveedorSegunID(int idProveedor) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select p from Proveedor p where p.id_proveedor =:p1");
        query.setParameter("p1", idProveedor);
        Proveedor proveedor = null;
        try {
            proveedor = (Proveedor) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return proveedor;
    }

    public void eliminarProductoSegunID(int idProducto) {
        conectarse();

        Producto producto = em.find(Producto.class, idProducto);
        em.getTransaction().begin();
        em.remove(producto);
        em.getTransaction().commit();

        desconectarse();
    }
    
     public void eliminarReservaSegunID(int idReserva) {
        conectarse();

        Reserva reser = em.find(Reserva.class, idReserva);
        em.getTransaction().begin();
        em.remove(reser);
        em.getTransaction().commit();

        desconectarse();
    }
    
    
    public void eliminarVentaSegunID(int id_venta) {
        conectarse();

        Venta venta = em.find(Venta.class, id_venta);
        em.getTransaction().begin();
        em.remove(venta);
        em.getTransaction().commit();

        desconectarse();
    }

    public void modificarProducto(Producto producto) {
        conectarse();

        em.getTransaction().begin();
        em.merge(producto);
        em.getTransaction().commit();

        desconectarse();
    }
    
    public void modificarReserva(Reserva reserva) {
        conectarse();

        em.getTransaction().begin();
        em.merge(reserva);
        em.getTransaction().commit();

        desconectarse();
    }

    public List<DetalleVenta> obtenerDetVentasSegunIdVenta(int idVenta) {
        conectarse();
        List<DetalleVenta> listaDetVenta = null;
        Query query = em.createQuery("select\n"
                + "Producto.nombre,\n"
                + "DetalleVenta.cantidad,\n"
                + "Producto.precio,\n"
                + "DetalleVenta.precioT\n"
                + "from\n"
                + "Venta join DetalleVenta on \n"
                + "Venta.id_Venta = DetalleVenta.id_venta join Producto on\n"
                + "Producto.id_producto = DetalleVenta.id_producto\n"
                + "where Venta.id_venta=:p1");
        query.setParameter("p1", idVenta);

        desconectarse();
        return listaDetVenta;
    }

}
