package elastic.test.client.exception;

import elastic.test.client.enums.AbortedFetchReason;

public class AbortedFetchException extends FetchException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AbortedFetchReason _abortReason;

	public AbortedFetchException() {
		super();
	}

	public AbortedFetchException(AbortedFetchReason abortReason) {
		super("Aborted due to " + abortReason);

		_abortReason = abortReason;
	}

	public AbortedFetchException(String message, AbortedFetchReason abortReason) {
		super(message);

		_abortReason = abortReason;
	}

	public AbortedFetchReason getAbortReason() {
		return _abortReason;
	}
}
