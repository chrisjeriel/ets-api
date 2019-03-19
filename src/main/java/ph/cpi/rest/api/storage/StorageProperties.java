package ph.cpi.rest.api.storage;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

	/**
     * Folder location for storing files
     */
    private String location = "C:\\ETS\\ATTACHMENTS\\Uploaded_Files";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
