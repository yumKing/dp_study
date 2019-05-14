package elastic.test.common;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class CommonUtils {

	/**
	 * 获取本地ip地址
	 * 
	 * @return
	 */
	public static String getIP() {
		String addip = null;
		Enumeration<NetworkInterface> allNetInterfaces = null;
		try {
			allNetInterfaces = NetworkInterface.getNetworkInterfaces();
			InetAddress ip = null;
			while (allNetInterfaces.hasMoreElements()) {
				NetworkInterface netInterface = allNetInterfaces.nextElement();
				Enumeration<InetAddress> addresses = netInterface
						.getInetAddresses();
				while (addresses.hasMoreElements()) {
					ip = addresses.nextElement();
					if (ip != null && ip instanceof Inet4Address
							&& !ip.getHostAddress().equals("127.0.0.1")) {
						addip = ip.getHostAddress();
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return addip;
	}

	/**
	 * 获取本地mac地址
	 * 
	 * @return
	 */
	public static String getMAC() {
		InetAddress ia;
		try {
			ia = InetAddress.getLocalHost();
			byte[] mac = NetworkInterface.getByInetAddress(ia)
					.getHardwareAddress();

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < mac.length; i++) {
				if (i != 0) {
					sb.append("-");
				}
				String s = Integer.toHexString(mac[i] & 0xFF);
				sb.append(s.length() == 1 ? 0 + s : s);
			}

			return sb.toString().toUpperCase();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
