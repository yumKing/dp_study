package elastic.test.client.enums;

/**
 * 
 * @author zhouzhiwei 2014年5月7日上午10:08:24
 */
public enum AbortedFetchReason {
	// WARNING - adding new reasons requires changes to
	// AbortedFetchException.mapToUrlStatus

	SLOW_RESPONSE_RATE, // Response rate back from server was below minimum.
	INVALID_MIMETYPE, // FetcherPolicy doesn't specify this as a valid mime-type
	INTERRUPTED, // Fetch was interrupted (typically by FetchBuffer calling
					// executor.terminate())
	CONTENT_SIZE, // Content exceeds Fetcher.getMaxContentSize()
}
