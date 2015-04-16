package expert.optimist.blog.blogservice.boundary;


import expert.optimist.blog.blogservice.control.EntryService;
import expert.optimist.blog.blogservice.entity.Entry;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("entries")
public class EntryEndpoint {

    @Inject
    EntryService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Entry> getAll() {
        return service.getAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Entry create(Entry entry) {
        return service.create(entry);
    }

}
