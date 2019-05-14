package elastic.test.client.cookieFactory;

import org.apache.commons.lang.StringUtils;

public class DefaultCookieFactory implements CookieFactory {

	private CookieInfo cookie;

	public DefaultCookieFactory(String cookie) {
		super();
		setCookie(cookie);
	}

	public void setCookie(String cookie) {
		if (StringUtils.isEmpty(cookie)) {
			throw new IllegalArgumentException("cookie is empty!");
		}
		this.cookie = new CookieInfo(cookie, "single", "single");
	}

	@Override
	public CookieInfo getCachedCookie() {
		return cookie;
	}

	@Override
	public void refreshCachedCookie() {
		
	}

	

}
