package maxamx.estudo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class InicioResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Olá RESTEasy";
    }
}