package airhacks.service.ping.boundary;

import org.eclipse.microprofile.jwt.JsonWebToken;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.security.Principal;

@Path("ping")
public class PingResource {

    @Inject JsonWebToken token;
    @Inject Principal principal;

    @GET @RolesAllowed("hacker")
    public String ping() {
        return "Jakarta EE 8 with MicroProfile 3+! " + token.getGroups() + " " + principal.getName();
    }

}
