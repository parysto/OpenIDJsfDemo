package parysto.opemidjsfdemo;

import fish.payara.security.annotations.ClaimsDefinition;
import fish.payara.security.annotations.OpenIdAuthenticationDefinition;
import javax.annotation.security.DeclareRoles;
import javax.faces.annotation.FacesConfig;
import javax.ws.rs.ApplicationPath;

@OpenIdAuthenticationDefinition(
        providerURI = "TODO",
        clientId = "TODO",
        clientSecret = "TODO",
        redirectURI = "${baseURL}/index.xhtml",
        claimsDefinition = @ClaimsDefinition(
                callerNameClaim = "name",
                callerGroupsClaim = "roles"
        ),
        tokenAutoRefresh = true
)
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@ApplicationPath("api")
@DeclareRoles("admin")
public class Configuration {

}
