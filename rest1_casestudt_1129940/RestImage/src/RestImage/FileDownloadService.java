package RestImage;
import java.io.File;  
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.core.Response.ResponseBuilder;  
@Path("/files")  
public class FileDownloadService {  
    private static final String FILE_PATH = "C:\\1129493\\cr7.jpg";  
    @GET  
    @Path("/image")  
    @Produces("image/png")  
    public Response getFile() {  
        File file = new File(FILE_PATH);  
        ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename=\"cr7.jpg\"");  
        return response.build();  
   
    }  
 }  