package airhacks.service;

import org.eclipse.microprofile.auth.LoginConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("resources")
@LoginConfig(authMethod = "MP-JWT")
public class JAXRSConfiguration extends Application {

    // See https://www.youtube.com/watch?v=ozQzsVxFfXU.

    // How to run this:
    // 1. Run jwtenizr from tools dir; read the output.
    // 2. Copy mp.jwt.verify.publickey from tools/microprofile-config.properties to META-INF/public-key.pem
    // 3. Build and deploy to a mp-featured server.
    // 4. Use the generated token (from token.jwt or curl command) in a http request. It's valid only 16 minutes!

    // For modifying the token, i.e. user and/or roles:
    // - modify groups in jwt-token.json,
    // - modify @RolesAllowed in PingResource and redeploy.
    // - rerun step 1, 2, 3 and 4.

}
