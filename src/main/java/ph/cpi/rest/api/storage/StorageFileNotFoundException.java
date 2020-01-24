package ph.cpi.rest.api.storage;

public class StorageFileNotFoundException extends StorageException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 762005017383860820L;

	public StorageFileNotFoundException(String message) {
        super(message);
    }
	
	public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
