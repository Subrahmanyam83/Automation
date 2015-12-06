package restWebService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import restWebService.Domain;

@Path("/domain")
public class Resource {
  // This method is called if XMLis request
  @GET
  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  public Domain getXML() {
	Domain domain = new Domain();
    domain.setSummary("This is my first todo");
    domain.setDescription("This is my first todo");
    return domain;
  }
  
  // This can be used to test the integration with the browser
 
  @GET
  @Produces({ MediaType.TEXT_XML })
  public Domain getHTML() {
	Domain domain = new Domain();
	domain.setSummary("This is my first todo");
	domain.setDescription("This is my first todo");
    return domain;
  }
  
  
  @POST
  @Produces({MediaType.TEXT_PLAIN})
  public String postXML()
  {
	  Domain domain = new Domain();
	  domain.setDescription("This is something new");
	  return domain.getDescription();
  }

} 