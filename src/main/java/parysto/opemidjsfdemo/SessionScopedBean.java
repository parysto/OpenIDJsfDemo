package parysto.opemidjsfdemo;

import java.io.Serializable;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("sessionScoped")
@SessionScoped
public class SessionScopedBean implements Serializable {

    private UUID uuid;

    @PostConstruct
    public void init() {
        System.out.println("!!!Init Session Scoped Bean!!!");
        this.uuid = UUID.randomUUID();
    }

    public String getUuid() {
        return this.uuid.toString();
    }

}
