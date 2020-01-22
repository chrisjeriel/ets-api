package ph.cpi.rest.api.storage;

public class StorageException extends RuntimeException {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -547531914406843559L;

	public StorageException(String message) {
	        super(message);
	    }
	 
	 public StorageException(String message, Throwable cause) {
	        super(message, cause);
	    }

}
