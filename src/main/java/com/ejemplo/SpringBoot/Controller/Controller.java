
package com.ejemplo.SpringBoot.Controller;
import com.ejemplo.SpringBoot.model.AcercaDe;
import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.model.Encabezado;
import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.model.Habilidades;
import com.ejemplo.SpringBoot.model.Idiomas;
import com.ejemplo.SpringBoot.model.Login;
import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.model.Proyectos;
//import com.ejemplo.SpringBoot.model.Users;
import com.ejemplo.SpringBoot.service.IAcercaDeService;
import com.ejemplo.SpringBoot.service.IEducacionService;
import com.ejemplo.SpringBoot.service.IEncabezadoService;
import com.ejemplo.SpringBoot.service.IExperienciaService;
import com.ejemplo.SpringBoot.service.IHabilidadesService;
import com.ejemplo.SpringBoot.service.IIdiomasService;
import com.ejemplo.SpringBoot.service.ILoginService;
import com.ejemplo.SpringBoot.service.IPersonaService;
import com.ejemplo.SpringBoot.service.IProyectosService;
//import com.ejemplo.SpringBoot.service.IUsersService;
//import de.mkammerer.argon2.Argon2;
//import de.mkammerer.argon2.Argon2Factory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "http://localhost:4200") 
public class Controller {
    //Aquí tenemos que hacer nuevamente otra injección de dependencias, de la controladora con nuestro service
    //nuestra controladora estara conectada al servicio, el servicio estara conectado al repositorio, el repo estara conectado a la BD
    //Esta separación en capas hace que la aplicación pueda ser modificada en cualquier lugar y no afectará al código
    
    @Autowired
    private IPersonaService persoServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/persona") //agregar  persona
    public void agregarPersona (@RequestBody Persona pers){
    persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")//ver lista de personas
    @ResponseBody//Request es la solicitud que da el cliente al servidor y Response es la respuesta que da el servidor al cliente
    public List<Persona> verPersonas (){
    return persoServ.verPersonas();
    }//El response body solicita la respuesta con el cuerpo en formato json, para que se entienda en el cliente
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}") //eliminar persona  
    public void borrarPersona (@PathVariable Long id){
    persoServ.borrarPersona(id);
    }
    
   //a partir de las nuevas versiones de Hibernate ya no existe el método editar, sino que se utiliza el método save (ni siquiera create)
   //en el elemento que nosotros tengamos, busca el id y si tiene algún dato para cambiar, lo modifica y si no esta lo crea.
       
    
    //ENCABEZADO
    
     @Autowired
    private IEncabezadoService encServ;
    
     @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/encabezado") 
    public void agregarEncabezado (@RequestBody Encabezado enc){
    encServ.crearEncabezado(enc);
    }
    
    @GetMapping("/ver/encabezado")
    @ResponseBody
    public List<Encabezado> verEncabezados (){
    return encServ.verEncabezados();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/encabezado/{id}") 
    public void borrarEncabezado (@PathVariable Long id){
    encServ.borrarEncabezado(id);
    }
    
    //ACERCA DE
    
     @Autowired
    private IAcercaDeService aceServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/acercade") 
    public void agregarAcercaDe (@RequestBody AcercaDe ace){
    aceServ.crearAcercaDe(ace);
    }
    
    @GetMapping("/ver/acercade")
    @ResponseBody
    public List<AcercaDe> verAcercaDes (){
    return aceServ.verAcercaDes();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/acercade/{id}") 
    public void borrarAcercaDe (@PathVariable Long id){
    aceServ.borrarAcercaDe(id);
    }
    
    //EDUCACION
    
    @Autowired
    private IEducacionService eduServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/educacion") 
    public void agregarEducacion (@RequestBody Educacion edu){
    eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion (){
    return eduServ.verEducacion();
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/educacion/{id}") 
    public void borrarEducacion (@PathVariable Long id){
    eduServ.borrarEducacion(id);
    }
    
    //EXPERIENCIA
    
    @Autowired
    private IExperienciaService expServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/experiencia") 
    public void agregarExperiencia (@RequestBody Experiencia exp){
    expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias (){
    return expServ.verExperiencias();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/experiencia/{id}") 
    public void borrarExperiencia (@PathVariable Long id){
    expServ.borrarExperiencia(id);
    }
    
    //HABILIDADES
    
    @Autowired
    private IHabilidadesService habServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/habilidad") 
    public void agregarHabilidades (@RequestBody Habilidades hab){
    habServ.crearHabilidades(hab);
    }
    
    @GetMapping("/ver/habilidades")
    @ResponseBody
    public List<Habilidades> verHabilidadess (){
    return habServ.verHabilidades();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/habilidad/{id}") 
    public void borrarHabilidades (@PathVariable Long id){
    habServ.borrarHabilidades(id);
    }
    
    //IDIOMAS
    
    @Autowired
    private IIdiomasService idiServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/idioma") 
    public void agregarIdiomas (@RequestBody Idiomas idi){
    idiServ.crearIdiomas(idi);
    }
    
    @GetMapping("/ver/idiomas")
    @ResponseBody
    public List<Idiomas> verIdiomas (){
    return idiServ.verIdiomas();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/idioma/{id}") 
    public void borrarIdiomas (@PathVariable Long id){
   idiServ.borrarIdiomas(id);
    }
    
    //PROYECTOS
    
    @Autowired
    private IProyectosService proServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/proyecto") 
    public void agregarProyectos (@RequestBody Proyectos pro){
    proServ.crearProyectos(pro);
    }
    
    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos (){
    return proServ.verProyectos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/proyecto/{id}") 
    public void borrarProyectos (@PathVariable Long id){
    proServ.borrarProyectos(id);
    }
    
    //LOGIN
    
    /*
     @Autowired
    private ILoginService logServ;
    
    @PostMapping ("/new/login") 
    public void agregarLogin (@RequestBody Login log){
    logServ.crearLogin(log);
    }
    
    @GetMapping("/ver/login")
    @ResponseBody
    public List<Login> verLogins (){
    return logServ.verLogins();
    }
    
    @DeleteMapping ("/delete/login/{id}") 
    public void borrarLogin (@PathVariable Long id){
    logServ.borrarLogin(id);
    }
    
    */
    
    
    //USERS
    
   /*    @Autowired
    private IUsersService usersServ;
    
    @PostMapping ("/new/user") 
    public void agregarUsers (@RequestBody Users user){
        
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, user.getPassword());
        user.setPassword(hash);
        
        
    usersServ.crearUsers(user);
    }
    
    @GetMapping("/ver/users")
    @ResponseBody
    public List<Users> verUsers (){
    return usersServ.verUsers();
    }
    
    @DeleteMapping ("/delete/user/{id}") 
    public void borrarUsers (@PathVariable Long id){
    usersServ.borrarUsers(id);
    }
    
    
    @PostMapping("/user/ok")
    @ResponseBody    
    public boolean verUser(@RequestBody Users user){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        List<Users> usuarios =  usersServ.verUsers();
        
        for( Users x:usuarios){
            if((argon2.verify(x.getPassword(), user.getPassword()))&&(x.getUsuario().equals(user.getUsuario())) ){
                x.setValido(true);
                return true;
            }
   
        }
        return false;
    }*/
    
}
    

    




//NOTAS:
//Los todos navegadores trabajan con el metodo Get por defecto.
//Para que tome el método post debemos indicarlo expresamente.
//Path Variable - Para poder enviar conceptos y que nos devuelva los mismos. Ej. un nombre
//localhost:8080/hola/Angela/Kavrecic/36
//Otra annotation es request parameter - parametros mediante la solicitud. El request param, 
//no necesita cada uno de los datos en un get.
//localhost:8080/chau?nombre=Angela&apellido=Kavrecic&edad=36
//La ventaja del request param es que no requerimos pensar en un url muy larga, con ////, sino que
//con una sola url podemos recibir todos los parametros necesarios
//hasta aquí fue método GET

//Método Post: para crear altas, nuevos registros o nuevos elementos dentro de una BD
//Crearemos en End Point que se ejecute cuando recibamos una petición por el método post
//para ello utilizaremos la annotation "Post Mapping"

//RequestBody - anotación para que la info viaje. Cuerpo de la solicitud. La persona en cuestión
//vendrá en el cuerpo de la solicitud. En lenguaje Json. Nosotros recibiremos un Json con los 
//datos de la persona en cuestion que vamos  a agregar

//una vez concluido esto podremos consultar la lista de personas.

//Sugerencia de editar de Romi: 
//
//@PutMapping("/experiencia/update")
//public void actualizarExperiencia
//(@RequestBody Experiencia exp){
//expServ.actualizarExperiencia(exp);}
//
//
//CRUD: Create Read Update Delete
//o ABML: Alta Baja Modificación y Lectura
//

//Incorporamos JPA a la APP que estamos utilizando: 
//Creamos paquetes: 
//Repository: clases o elementos para conexión con BD. Clases JPA. o DAO (data access object)
//Service: aquí estará la logica de negocio

//esta es la arquitectura multicapa, respetando MVC

//DTO  - Data Transfer Objetct - esta es otra capa que se puede implementar. 

//Para aplicar JPA, se requieren dependencias. Para agregar a este proyecto JPA, se copian esas 
//dependencias en el pom
